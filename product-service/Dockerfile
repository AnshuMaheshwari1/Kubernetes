From openjdk:8
From maven:latest
VOLUME /tmp
RUN mkdir /application-product
COPY . /application-product
WORKDIR /application-product
RUN mvn install #if you use gradle change it to /application/gradlew build
RUN mv /application-product/target/*.jar /application-product/product.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/application-product/product.jar"]
