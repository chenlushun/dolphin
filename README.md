# 一个配置管理系统

## 安装部署
#### docker安装DB，如果本地有数据库，可以跳过，进入下一步
```shell
docker-compose up -d
```
#### 执行sql脚本

```sql
DROP TABLE IF EXISTS site;

CREATE TABLE site
(
    id BIGINT(20)  NOT NULL  AUTO_INCREMENT,
    url VARCHAR(355) DEFAULT '',
    is_delete INTEGER,
    PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT = '站点表';


SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS project_info;
CREATE TABLE project_info (
  project_name varchar(255) NOT NULL,
  project_env varchar(255) DEFAULT NULL,
  project_app_port varchar(255) DEFAULT NULL,
  project_management_port varchar(255) DEFAULT NULL,
  project_logs_path varchar(255) DEFAULT NULL,
  project_deploy_host varchar(255) DEFAULT NULL,
  project_deploy_path varchar(255) DEFAULT NULL,
  project_start_cmd longtext,
  source_jar_path varchar(255) DEFAULT NULL,
  source_jar_name varchar(255) DEFAULT NULL,
  start_seq tinyint(3) DEFAULT NULL,
  PRIMARY KEY (`project_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS script;
CREATE TABLE script
(
   id BIGINT(20)  NOT NULL  AUTO_INCREMENT,
   name varchar(255) DEFAULT NULL,
   parent_id BIGINT(20)  NOT NULL DEFAULT 0,
   description varchar(255) DEFAULT NULL,
   version varchar(255) DEFAULT NULL,
   file TEXT,
   status int,
   type int,
   operator_id BIGINT(20) ,
   create_at DATETIME,
   update_at DATETIME,
   PRIMARY KEY (id)
)
   ENGINE = InnoDB
   DEFAULT CHARSET = utf8
   COMMENT = '脚本表';
```
#### 修改 application.properties 配置
#### 打包
```shell
mvn package
```
### 启动JAR, jar位于dolphin/target
```shell
java -jar dolphin-1.0-SNAPSHOT.jar
```

## 功能介绍
### 站点导航
### 应用管理
### 脚本中心

## to do list
### 任务调度
### 资产管理

