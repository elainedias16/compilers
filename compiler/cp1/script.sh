#!/bin/bash
ROOT=/home/filipe/git/compilers/compiler/cp1
ANTLR_PATH=$ROOT/tools/antlr-4.11.1-complete.jar
CLASS_PATH_OPTION="-cp .:$ANTLR_PATH"

GRAMMAR_NAME=Ezlang
GEN_PATH=lexer

DATA=$ROOT
IN=$DATA/in
OUT=$DATA/out

cd $GEN_PATH
for infile in `ls $IN/*.pas`; do
	base=$(basename $infile)
	outfile=$OUT/${base/.ezl/.out}
	echo Running $base
	java $CLASS_PATH_OPTION org.antlr.v4.gui.TestRig $GRAMMAR_NAME \
		tokens -tokens $infile 2>&1 | diff -w $outfile -
done
