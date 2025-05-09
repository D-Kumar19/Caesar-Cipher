FROM maven:3.9.9-eclipse-temurin-17

WORKDIR /app

COPY pom.xml .

COPY src ./src

RUN mvn clean package

ENTRYPOINT ["java", "-jar", "target/CaesarCipher-1.0-SNAPSHOT.jar"]

CMD ["cipher", "Hello World", "3"]
