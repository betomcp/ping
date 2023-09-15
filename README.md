# Ping

API Java com Spring Boot para uso genérico adequada para criação de imagens de implementação CI/CD


## app web + Docker + deploy

### Azure

-- Criar um grupo de recursos
	- rs-azure-user
-- Acessar App Service
	- Criar Web App
		- rm86750-ping
	- configurar deployment
	 - Acessar central de implantação

## Spring Boot

Project: Maven
Language: Java
Spring Boot: 2.7.X
Project Metadata/Group: com.github.acnaweb
Project Metadata/Artifact: ping
Project Metadata/Name: ping
Project Metadata/Description: API for Ping Pong
Project Metadata/Package name: com.github.acnaweb.ping
Project Metadata/Packaging: Jar
Project Metadata/Java: 11


Dependencies:
- Spring Web
- [Springdoc OpenAPI](https://springdoc.org/)
```
		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-ui</artifactId>
			<version>1.6.14</version>
		</dependency>
```

## Maven

#### Build

```
mvn clean package
```

#### Run

```
mvn spring-boot:run
```

----
## API 


#### Documentação

- http://localhost:8080

#### Endpoints
- http://localhost:8080/ping


## Docker

#### Criando imagem
```
docker build -t ping .
```
```
docker tag ping:latest betoporto/ping:0.0.3
```
```
docker push betoporto/ping:0.0.3
```

#### Listando imagens

```
docker image ls
```

#### Executando a aplicação (Container)

```
docker run -d -p 8080:8080 ping
```
```
docker run -d -e PROFILE=dev -p 8080:8080 ping
```

#### Listando Containers em execução

```
docker ps
```

#### Listando Containers encerrados

```
docker ps -a
```
####  Monitoramento

```
docker logs container_id
```


## Referencias

- https://blog.tericcabrel.com/push-docker-image-docker-hub/
- https://devconnected.com/category/devops/docker/
- https://developer.okta.com/blog/2020/12/28/spring-boot-docker
- https://sterl.org/2021/05/spring-boot-redirect-to-swaggerui/
- https://hub.docker.com/