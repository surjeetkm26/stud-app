FROM adoptopenjdk/openjdk11:alpine-jre
RUN mkdir -p /app/file
COPY /target/*.jar /app/file
WORKDIR /app/file
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "stud-microapp.jar"]