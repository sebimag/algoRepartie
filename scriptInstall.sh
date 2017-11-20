#!/bin/bash
#source ./scriptInstall.sh
#GET ENV
userHome="/home/ndekerleau"
cd /tmp/
mkdir -p "$userHome/DistMake"
touch "$userHome/hostfile.txt"
export JAVA_HOME="/usr/lib/jvm/java-7-openjdk-amd64/"

nbNodes=$(uniq $OAR_NODEFILE | wc -l)
uniq $OAR_NODEFILE > "$userHome/hostfile.txt"

export X10_HOSTFILE="$userHome/hostfile.txt"
export X10_NPLACES=$nbNodes
export X10_ABSOLUTEPATH="$userHome/hostfile.txt"

file="$userHome/hostfile.txt"
i=0
~/x10/bin/x10c -d "$userHome"/DistMake DistMake/src/DistMake.x10
while IFS= read -r line
do
	if [ $i -gt 0 ]
	then
		scp -r /tmp/DistMake/ $line:/tmp/
	fi
	((i++))
done < "$file"

