name := "task-admin"

version := "1.0.0"

scalaVersion := "2.12.4"

sbtPlugin := true

organization := "com.isuwang"

isSnapshot in Global := true

resolvers += Resolver.mavenLocal

lazy val commonSettings = Seq(
  organization := "com.isuwang",
  version := "1.0.0",
  scalaVersion := "2.12.4"
)

lazy val task_admin_api = (project in file("task-admin-api"))
  .settings(
    commonSettings,
    name := "task-admin-api",
    libraryDependencies ++= Seq(
      "com.isuwang" % "dapeng-remoting-api" % "1.3.0",
      "com.isuwang" % "dapeng-remoting-netty" % "1.3.0"
      // "com.isuwang" % "common-library" % "1.2.1"
    )
  ).enablePlugins(ThriftGeneratorPlugin)


lazy val task_admin_service = (project in file("task-admin-service"))
  .dependsOn( task_admin_api )
  .settings(
    commonSettings,
    name := "taskadmin-service",
    libraryDependencies ++= Seq(
      "com.isuwang" % "dapeng-spring" % "1.3.0",
      "com.github.wangzaixiang" %% "scala-sql" % "2.0.2",
      "org.slf4j" % "slf4j-api" % "1.7.13",
      "ch.qos.logback" % "logback-classic" % "1.1.3",
      "ch.qos.logback" % "logback-core" % "1.1.3",
      "org.codehaus.janino" % "janino" % "2.7.8",
      "mysql" % "mysql-connector-java" % "5.1.36",
      "com.isuwang" % "dapeng-remoting-netty" % "1.3.0",
      "com.isuwang" % "dapeng-registry-zookeeper" % "1.3.0",
      "com.alibaba" % "druid" % "1.0.17",
      "org.springframework" % "spring-context" % "4.2.4.RELEASE",
      "org.springframework" % "spring-jdbc" % "4.2.4.RELEASE",
      "com.isuwang" % "dapeng-message-api" % "1.3.0",
      "com.isuwang" % "company-api" % "1.2.2" exclude("com.isuwang", "common-library"),
      "com.isuwang" % "admin-api" % "1.2.1" exclude("com.isuwang", "common-library")

    )).enablePlugins(ImageGeneratorPlugin).enablePlugins(RunContainerPlugin).enablePlugins(DbGeneratorPlugin)
