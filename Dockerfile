FROM openjdk
EXPOSE 8080:8080
ADD /target/goods-accounting-0.1.jar goodsaccounting.jar
ENTRYPOINT ["java", "-jar", "goodsaccounting.jar"]
