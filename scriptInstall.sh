#!/bin/bash
#source ./scriptInstall.sh
#GET ENV
mkdir -p /tmp/projet/
cd /tmp/projet/
touch hostfile.txt
export JAVA_HOME='/usr/lib/jvm/java-7-openjdk-amd64/'

nbNodes=$(uniq $OAR_NODEFILE | wc -l)
uniq $OAR_NODEFILE > hostfile.txt

export X10_HOSTFILE='/tmp/projet/hostfile.txt'
export X10_NPLACES=$nbNodes
export X10_ABSOLUTEPATH='/tmp/projet/hostfile.txt'

~/x10/bin/x10c DistMake/src/DistMake.x10
