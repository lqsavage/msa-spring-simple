# msa-spring-simple
spring cloud 微服务最简版本，用于测试部署swarm Kubernetes

## 项目说明
A通过eureka注册中心调用B（定时任务）


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