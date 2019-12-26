#!/bin/bash
FILE=$(find /opt/timer -name timer-*.jar)
#echo $FILE
java -jar $FILE
