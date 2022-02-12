FROM maven:3.6-jdk-11
COPY ./ ./
RUN mvn clean package
CMD ["java", "-jar", "/target/goods-accounting-0.1.jar"]