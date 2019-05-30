# javalin-test

Requires Java 11

$ mvn clean install appassembler:assemble

$ target/appassembler/bin/hello

$ docker build -t javalin-test:0.1 .

$ docker run javalin-test:0.1
