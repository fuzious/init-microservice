FROM openjdk:8
ADD target/learningdocker.jar learningdocker.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","learningdocker.jar"]
