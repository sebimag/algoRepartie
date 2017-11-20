#!/bin/bash
#source ./scriptInstall.sh
#GET ENV

cd /tmp/

touch "$HOME/hostfile.txt"
export JAVA_HOME="/usr/lib/jvm/java-7-openjdk-amd64/"

nbNodes=$(uniq $OAR_NODEFILE | wc -l)
uniq $OAR_NODEFILE > "$HOME/hostfile.txt"

export X10_HOSTFILE="$HOME/hostfile.txt"
export X10_NPLACES=$nbNodes
export X10_ABSOLUTEPATH="$HOME/hostfile.txt"

file="$HOME/hostfile.txt"
i=0

mv x10 ~/
~/x10/bin/x10c -d /tmp/DistMake DistMake/src/DistMake.x10

while IFS= read -r line
do
	if [ $i -gt 0 ]
	then
		scp -r /tmp/DistMake/ $line:/tmp/
	fi
	((i++))
done < "$file"


