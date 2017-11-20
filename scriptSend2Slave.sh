#!/bin/bash
file="$HOME/hostfile.txt"
i=0

while IFS= read -r line
do
        if [ $i -gt 0 ]
        then
                scp -r $1 $line:/tmp/DistMake &
        fi
        ((i++))
done < "$file"

wait
