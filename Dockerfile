FROM openjdk:8
COPY ./target/com.example.calculator-0.0.1-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "com.example.calculator-0.0.1-SNAPSHOT-jar-with-dependencies.jar", "Calculator"]
