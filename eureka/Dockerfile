FROM java:8

MAINTAINER yokv ez4tzl@hotmail.com

ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

ADD ./target/app.jar  app.jar

CMD ["/bin/sh", "-c", "java -jar app.jar"]