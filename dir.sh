#!/bin/bash
listOfItem=*

for item in $listOfItem
do
	if [ -f $item ]; then
		echo $item
		sleep 1
	fi
done

