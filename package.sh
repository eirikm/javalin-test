#!/bin/sh

mvn clean package appassembler:assemble
zip -r app.zip Procfile target/appassembler
