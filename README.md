# Micro Service Demo Spring Boot
# What you Should know
* Must have Java 8 knowledge 
* Springboot intermediate Skills
* Kafka Basic knowledge
* Database beginner knowledge


# Technology
* Java 11
* Maven
* Spring Boot 2.3.x
* Kafka MQ
* MySQL
* Mongo DB
* Spring Kafka

# Tools
* IntelliJ
* Studio3t(Mongo-Optional) 
* SqlYoq/MYSQL WorkBench(Mysql-optional)
* kafka installation(Zookeeper,Topics, Partition)

# Description

This Demo have  7 modules as Services which are :


* Config Service(**Spring Cloud Configuration**)
* Discovery Service(Eureka Server) 
* Gateway Service(Spring Cloud)
* Auth Service
* User Service
* Department Service

# Config Service(Client Service)
This Service hold all the global configurations and getting used as 
bootstrap to other service to load configurations by this design pattern
developer get rid of defining the configuration at each service level
like if host name of eureka server changed and we have 1000 of microservices that register with that server and 
we have to make a change in hostname we have to go through all services and change them.

# Discovery Service(Server Service)
 This Service is Eureka Server which basically discover 
 the other micro services which are client services and balance the load among multiple nodes of a microservice.

# Gateway Service(Client Service)
This service a signle entry point to the all microservices
all routes are define in that service and this direct an incoming 
request and validate if the token is required for the request or not and whether token is valid
or not .

# Auth Service(Client Service)
This service is used for Register , Login and for that it communicate
with User and Department service.

# User Service(Client Service)
This  Service capture the User Information for Registration and authentication.
Its Datasource is MongoDb .
This service is also sourcing the events using kafka Messaging Queue
when Register a User request is received  by User service from Auth service.
What it does is create the user enter the record to Db
and push the Email Notification to a Kafka Topic's Partition.




# Department Service(Client Service)
This is a simple Service which capture the  Registerd User Department.
Its Data Source is MySQL.

# Guidelines
 Install Java, MySql and mongodb 

