#!/bin/bash

#GET ENV
touch hostfile.txt

export JAVA_HOME='/usr/lib/jvm/java-7-openjdk-amd64/'


nbNodes=$(uniq $OAR_NODEFILE | wc -l)
uniq $OAR_NODEFILE > hostfile.txt

export X10_HOSTFILE='hostfile.txt'
export X10_NPLACES=$nbNodes

x10/bin/x10c hello.x10

x10/bin/x10 hello
