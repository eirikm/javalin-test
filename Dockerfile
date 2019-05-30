FROM openjdk:11-jdk
EXPOSE 7000

ADD /target/appassembler /app

ENTRYPOINT ["/app/bin/hello"]


