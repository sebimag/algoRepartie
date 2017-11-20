#!/bin/bash

echo "1. Test premier"
echo "2. other Test"
echo "3. another Test"
read -p "Select num test : " numTest

case $numTest in
        1)
	gcc testMakefiles/premier/premier.c -lm -o premier
	./scriptSend2Slave.sh premier
	cp testMakefiles/premier/Makefile DistMake
	cd  DistMake
	~/x10/bin/x10 DistMake Makefile list.txt
	;;
        2) echo "Choix 2"
	;;
	3) echo "Choix 3"
	;;
        *)
esac




