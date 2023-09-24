FROM amazoncorretto:17-alpine
ADD target/*.jar bookmarkapp.jar
RUN sh -c 'touch /webstash-api.jar'
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -jar /webstash-api.jar"]