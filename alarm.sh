#!bin/bash
read timer

while [ $timer -gt 0 ]
do
	echo 
	echo $timer
	timer=$((timer-1))
	sleep 1
done

echo "Times Up!"
while [ $timer -eq 0 ]
do
	echo 
	echo "Press Ctrl+C to stop"
	sleep 0.1
done
