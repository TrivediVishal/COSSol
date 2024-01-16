#!/bin/sh


# Create directory 'one' and create two files in it
mkdir one
echo "File 1 in one" > one/file1.txt
echo "File 2 in one" > one/file2.txt

# Create directory 'two' inside 'one' and create two files in it
mkdir one/two
echo "File 1 in two" > one/two/file1.txt
echo "File 2 in two" > one/two/file2.txt

# Create directory 'three' inside 'two' and create two files in it
mkdir one/two/three
echo "File 1 in three" > one/two/three/file1.txt
echo "File 2 in three" > one/two/three/file2.txt

# Go to directory 'one' and remove everything under it
cd one
rm -r *

