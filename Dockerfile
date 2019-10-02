FROM openjdk:8-jre-alpine

EXPOSE 5000
ENTRYPOINT ["/app/bin/app"]

COPY target/appassembler /app