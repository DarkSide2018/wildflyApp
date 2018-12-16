#!/usr/bin/env bash

echo "enter username"
read username

echo "enter password"

read password

if [[ $username == "admin" && $password == "secret" ]]; then

echo "valid user"
else
echo "invalid user"
fi
