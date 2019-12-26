#!/bin/bash
FILE=$(find . -name timer-*.jar)
#echo $FILE
java -jar $FILE