#!/bin/bash

#GET ENV
#wget https://sourceforge.net/projects/x10/files/x10/2.6.1/x10-2.6.1_linux_x86_64.tgz

#mkdir x10
touch hostfile
#tar -xvf x10-2.6.1_linux_x86_64.tgz -C x10

export JAVA_HOME='/usr/lib/jvm/java-7-openjdk-amd64/'


nbNodes=$(uniq $OAR_NODEFILE | wc -l)
uniq $OAR_NODEFILE > hostfile

export X10_HOSTFILE='hostfile'
export X10_NPLACES=$nbNodes

x10/bin/x10c hello.x10

x10/bin/x10 hello
