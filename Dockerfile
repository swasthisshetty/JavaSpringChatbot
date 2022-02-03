FROM openjdk:8
EXPOSE 8080
ADD target/sns-watson-chatbot-0.1.0.jar sns-watson-chatbot-0.1.0.jar
ENTRYPOINT ["java","-jar","sns-watson-chatbot-0.1.0.jar"]