FROM openjdk:8-alpine

COPY ./target/sc-k8s-consumer.jar /app.jar

ENV TZ=Asia/Shanghai

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

EXPOSE 5678

WORKDIR /

CMD java -server -Djava.security.egd=file:/dev/./urandom -jar app.jar