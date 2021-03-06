#!/bin/bash
echo "=================================="
echo "            TEST STARTER          "
echo "=================================="
echo "1. Test premier"
echo "2. Blender"
echo "3. Matrix"
echo "================================="
read -p "Select num test : " numTest

case $numTest in
        1)
	rm -rf /tmp/DistMake/list*.txt 2> /dev/null
	./scriptCommand2Slave.sh "rm -rf /tmp/DistMake/list*.txt 2> /dev/null"
	gcc testMakefiles/premier/premier.c -lm -o premier
	./scriptSend2Slave.sh premier
	cp premier /tmp/DistMake
	cp testMakefiles/premier/Makefile DistMake
	cd  DistMake
	{ time ~/x10/bin/x10 DistMake Makefile list.txt ; } 2> ~/premierTime.txt
	tail DistMake/list.txt
	;;
        2)
        rm -rf /tmp/DistMake/fram* 2> /dev/null
              rm -rf /tmp/cube* 2> /dev/null
              sudo-g5k apt-get install blender -y -qq
              ./scriptCommand2Slave.sh "sudo-g5k apt-get install blender -y -qq"
              unzip testMakefiles/blender_2.49/cube_anim.zip
              ./scriptSend2Slave.sh cube_anim.blend
              cp cube_anim.blend /tmp/DistMake
              cp testMakefiles/blender_2.49/Makefile DistMake
              cp testMakefiles/blender_2.49/cube_anim.zip DistMake
              cd DistMake
              { time ~/x10/bin/x10 DistMake Makefile cube.mpg ; } 2> ~/blenderTime.txt
              $emptyFile="SUCCES"
              nbFrames=$(ls /tmp/fram*.png | wc -l)
              for filename in /tmp/fram*.png; do
                      if [ -s "$filename" ]
                      then

                      else
                              $emptyFile="ECHEC"
                      fi
              done
              if [ nbFrames -ne 113 ]
              then
                      $emptyFile="ECHEC"
              fi
              echo $emptyFile
              ;;
	3)
	read -p "Give size : " size
	testMakefiles/matrix/./generate_makefile.pl $size > Makefile
	testMakefiles/matrix/random_matrix.pl 3 2 > a
	testMakefiles/matrix/random_matrix.pl 2 3 > b
	;;
        *)
esac
