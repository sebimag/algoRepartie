#!/bin/bash

#GET ENV
touch hostfile.txt

export JAVA_HOME='/usr/lib/jvm/java-7-openjdk-amd64/'

nbNodes=$(uniq $OAR_NODEFILE | wc -l)
uniq $OAR_NODEFILE > /tmp/projet/hostfile.txt

export X10_HOSTFILE='/tmp/projet/hostfile.txt'
export X10_NPLACES=$nbNodes

x10/bin/x10c DistMake/src/DistMake.x10

filename="${file%.*}"
x10/bin/x10 DistMake Makefile.txt fin
