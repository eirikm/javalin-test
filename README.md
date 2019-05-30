# javalin-test

Requires Java 11

$ mvn clean install appassembler:assemble

$ target/appassembler/bin/hello

$ docker build -t javalin-test:0.1 .

$ docker run -p 127.0.0.1:80:7000/tcp javalin-test:0.1

$ zip -r app.zip target/appassembler


