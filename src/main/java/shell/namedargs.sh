#!/usr/bin/env bash

for arg in "$@"

do
#  до и после знака '='  не должно быть пробелов
index=$(echo $arg | cut -f1 -d'=')
val=$(echo $arg | cut -f2 -d'=')
case $index in
X)
x=$val ;;
Y)
y=$val ;;
*)
esac

done

((result=x+y))

echo "X+Y = $result"
