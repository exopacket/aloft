#!/bin/bash

java -Xmx500M -cp "/usr/local/lib/antlr-4.13.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool Aloft.g4 -package com.inteliense.aloft.grammar.antlr