# msa-spring-simple
spring cloud 微服务最简版本，用于测试部署swarm Kubernetes

## 项目说明
A通过eureka注册中心调用B（定时任务）


##  构建镜像
```
mvn clean package docker:build
```

##  compose部署
``` 
docker-compose up -d --scale app-a=2 --scale app-b=3

```

## swarm部署
```
docker network create -d overlay --subnet 10.0.1.0/24 cloud-net
docker stack deploy app -c docker-stack.yml
docker run --restart=always -d -p 9000:9000 -v /var/run/docker.sock:/var/run/docker.sock portainer/portainer
```


## 部分environment不起作用
[相关issues](https://github.com/spring-cloud/spring-cloud-netflix/issues/2541)
[doc](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html#boot-features-external-config)

其他项目能正常使用environment(与操作系统还有关系!!!)
官方文档中解释：
If you use environment variables rather than system properties, **most operating systems** disallow period-separated key names, but you can use underscores instead (for example, SPRING_CONFIG_NAME instead of spring.config.name).


## spring cloud 网络支持
[spring-cloud-commons](https://github.com/spring-cloud/spring-cloud-commons/blob/master/docs/src/main/asciidoc/spring-cloud-commons.adoc#ignore-network-interfaces)