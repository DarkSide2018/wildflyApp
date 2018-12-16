#!/usr/bin/env bash

echo "enter lucky number"

read n

case $n in 100)
echo "You got prize" ;; 300)
echo "You got third prize" ;; 400)
echo "You got fourth prize" ;; 500)
echo "You got fifth prize"  ;; 600)
echo "six prize" ;; *)
echo "sorry try for this time" ;;

esac
