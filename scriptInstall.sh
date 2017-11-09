#!/bin/bash

#GET ENV
wget https://sourceforge.net/projects/x10/files/x10/2.6.1/x10-2.6.1_linux_x86_64.tgz

mkdir x10

tar -xvf x10-2.6.1_linux_x86_64.tgz -C x10

export JAVA_HOME='/usr/lib/jvm/java-7-openjdk-amd64/'


nbNodes=$(uniq $OAR_NODEFILE | wc -l)
nodes=$(uniq $OAR_NODEFILE)

export X10_HOSTFILE=$nodes
export X10_NPLACES=$nbNodes

source .bashrc

x10/bin/x10c hello.x10

x10/bin/x10 hello
