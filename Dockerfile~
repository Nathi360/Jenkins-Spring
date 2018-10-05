FROM openjdk:10-jre-slim
COPY ./target/hybrid-1.0-SNAPSHOT.jar /usr/src/hybrid/
WORKDIR /usr/src/hybrid
EXPOSE 9090
CMD ["java", "-jar", "hybrid-1.0-SNAPSHOT.jar"]
