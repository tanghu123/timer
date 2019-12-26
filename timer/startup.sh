#!/bin/bash
FILE=$(find /opt/timer -name timer-*.jar)
#echo $FILE
/usr/bin/java -jar $FILE &
