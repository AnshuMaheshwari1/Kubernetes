From openjdk:8
From maven:latest
VOLUME /tmp
RUN mkdir /application-eurekaserver
COPY . /application-eurekaserver
WORKDIR /application-eurekaserver
RUN mvn install #if you use gradle change it to /application/gradlew build
RUN mv /application-eurekaserver/target/*.jar /application-eurekaserver/eurekaserver.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/application-eurekaserver/eurekaserver.jar"]
