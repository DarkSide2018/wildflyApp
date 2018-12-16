#!/usr/bin/env bash

Str="Learn substring linux"
# первый аргумент это начальная позиция,
# второй аргумент это сколько символов нужно после этого

substr=${Str:6:5}

echo $substr
