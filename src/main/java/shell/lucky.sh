#!/usr/bin/env bash

echo "enter your lucky number"

read in

if [[ $in -eq 100 ]];

then

echo "you got prize"

elif [[ $in -eq 500 ]];

then echo "you got second prize";

else

echo "Sorry, try for next time";

fi
