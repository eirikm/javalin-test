FROM openjdk:11-jdk
ADD /target/appassembler /app

ENTRYPOINT ["/app/bin/hello"]


