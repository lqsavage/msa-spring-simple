FROM openjdk:jre-slim

MAINTAINER yokv ez4tzl@hotmail.com

ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

ADD ./target/app.jar  app.jar

EXPOSE 8088

CMD ["/bin/sh", "-c", "java -jar app.jar"]