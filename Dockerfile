FROM openjdk:21-slim
EXPOSE 33307
COPY ./build/libs/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
