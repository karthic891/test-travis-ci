FROM openjdk:8

EXPOSE 8080

WORKDIR /tmp

COPY ./target/test-travis-ci-0.0.1-SNAPSHOT.jar /tmp

RUN chmod -R 777 /tmp

CMD java -jar /tmp/test-travis-ci-0.0.1-SNAPSHOT.jar
# CMD ["java", "-version"]