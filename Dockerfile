FROM maven:3.8.6-openjdk-8-slim

ADD . /usr/local/src
COPY settings.xml /usr/share/maven/conf

WORKDIR /usr/local/src

RUN mvn clean package -Dmaven.test.skip=true

EXPOSE 8000

ENTRYPOINT java -jar target/rdssecrets-0.0.1-SNAPSHOT.jar