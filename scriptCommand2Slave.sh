#!/bin/bash
file="$HOME/hostfile.txt"
i=0

while IFS= read -r line
do
        if [ $i -gt 0 ]
        then
		ssh $line $1 &
        fi
        ((i++))
done < "$file"

wait
