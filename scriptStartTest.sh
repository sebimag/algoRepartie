#!/bin/bash
echo "=================================="
echo "            TEST STARTER          "
echo "=================================="
echo "1. Test premier"
echo "2. other Test"
echo "3. another Test"
echo "================================="
read -p "Select num test : " numTest

case $numTest in
        1)
	rm -rf /tmp/DistMake/list*.txt 2> /dev/null
	./scriptCommand2Slave.sh rm -rf /tmp/DistMake/list*.txt 2> /dev/null
	gcc testMakefiles/premier/premier.c -lm -o premier
	./scriptSend2Slave.sh premier
	cp testMakefiles/premier/Makefile DistMake
	cd  DistMake
	~/x10/bin/x10 DistMake Makefile list.txt
	tail DistMake/list.txt
	;;
        2) echo "Choix 2"
	wget https://download.blender.org/release/Blender2.79/blender-2.79-linux-glibc219-x86_64.tar.bz2
	tar -xf blender-2.79-linux-glibc219-x86_64.tar.bz2
	./scriptSend2Slave.sh blender-2.79-linux-glibc219-x86_64
	 	
	cp testMakefiles/blender_2.49/Makefile DistMake
	cp testMakefiles/blender_2.49/cube_anim.zip DistMake
	cd DistMake
	
	;;
	3) echo "Choix 3"
	;;
        *)
esac




