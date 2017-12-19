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
