From openjdk:8
From maven:latest
VOLUME /tmp
RUN mkdir /application-book
COPY . /application-book
WORKDIR /application-book
RUN mvn install #if you use gradle change it to /application/gradlew build
RUN mv /application-book/target/*.jar /application-book/book.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/application-book/book.jar"]	
