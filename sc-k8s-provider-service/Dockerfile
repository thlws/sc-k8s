FROM openjdk:8-alpine

COPY ./target/sc-k8s-provider.jar /app.jar

ENV TZ=Asia/Shanghai

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

EXPOSE 6789

WORKDIR /

CMD java -server -Djava.security.egd=file:/dev/./urandom -jar app.jar