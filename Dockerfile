FROM maven:3.6-jdk-11
COPY ./ ./
EXPOSE 8080:8080
RUN mvn clean package
CMD ["java", "-jar", "/target/goods-accounting-0.1.jar"]