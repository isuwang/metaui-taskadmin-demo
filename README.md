# frontend启动
### 修改连接配置
```
vi frontend/src/main/resources/init.properties
```
修改 ``${your-mysql-host}``、``${username}`` 和 ``${password}``：
```
DB_METADB_URL=jdbc:mysql://${your-mysql-host}:3306/metadb?useUnicode=true&characterEncoding=utf8
DB_METADB_USER=${username}
DB_METADB_PASSWD=${password}
```
### 添加tomcat配置
VM options添加参数， 修改 ``${your-zookeeper-host}``
```
-Dsoa.zookeeper.host=${your-zookeeper-host}:2181 -Dfile.encoding=UTF-8
```
### 启动tomcat

# server启动
## 软件要求
- mysql
- zookeeper
- scala 2.12.4
- jdk 1.8

## 启动步骤
### 启动mysql
### 启动zookeeper
### 修改连接配置
#### 1. 修改scala-sql的sql语法检查数据库配置
```
cd server
vi scala-sql.properties
```
修改 ``${your-mysql-host}``、``${username}`` 和 ``${password}``：
```
default.driver=com.mysql.jdbc.Driver
default.url=jdbc:mysql://${your-mysql-host}/taskdb?useUnicode=true&characterEncoding=utf8
default.user=${username}
default.password=${password}
```
#### 2. 修改数据库连接配置
```
vi task-admin-service/src/main/resources/config_task-admin.properties
```
修改 ``${your-mysql-host}``、``${username}`` 和 ``${password}``：
```
DB_TASKDB_URL=jdbc:mysql://${your-mysql-host}:3306/taskdb?useUnicode=true&characterEncoding=utf8
DB_TASKDB_USER=${username}
DB_TASKDB_PASSWD=${password}

DB_SLAVE_TASKDB_URL=jdbc:mysql://${your-mysql-host}:3306/taskdb?useUnicode=true&characterEncoding=utf8
DB_SLAVE_TASKDB_USER=${username}
DB_SLAVE_TASKDB_PASSWD=${password}

FORCE_DO_THROUGH=false

```
#### 3. 修改容器启动连接配置
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