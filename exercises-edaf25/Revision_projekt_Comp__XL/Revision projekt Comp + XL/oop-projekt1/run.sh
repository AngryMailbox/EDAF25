#!/bin/sh

# Compile the project
javac -sourcepath src -d bin $(find src -name "*.java")

# Run the project
cd bin
java Main
cd ..
