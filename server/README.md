# server启动
## 软件要求
- mysql
- zookeeper
- scala 2.12.4

## 启动步骤
### 启动mysql
### 启动zookeeper
### 修改连接配置
#### 1. 修改scala-sql sql语法检查数据库配置
```
cd server
vi scala-sql.properties
```
修改 ``${your-mysql-host}``：
```
default.driver=com.mysql.jdbc.Driver
default.url=jdbc:mysql://${your-mysql-host}/taskdb?useUnicode=true&characterEncoding=utf8
default.user=iplastest
default.password=123456
```
#### 2. 修改容器启动连接配置
```
cd task-admin-service
vi dapeng.properties
```
修改 ``${your-zookeeper-host}`` 和 ``${your-kafka-host}``：
```
soa.run.mode=maven
soa.apidoc.port=8192
soa.zookeeper.host=${your-zookeeper-host}:2181
soa.kafka.host=${your-kafka-host}:9092
soa.container.port=9095
soa.monitor.enable=false
soa.transactional.enable=false
dapeng.version=1.2.2
```
### 启动容器 （[更多工具](https://github.com/isuwang/dapeng-soa.g8)）
```
sbt runContainer
```
> 这里忽略了sbt环境的搭建，[sbt提速](https://github.com/Centaur/repox)