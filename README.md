# 一个配置管理系统

## 安装部署
#### docker安装DB，如果本地有数据库，可以跳过，进入下一步
```shell
docker-compose up -d
```
#### 执行初始化sql脚本

* 脚本位置：dolphin/db/init.sql

#### 修改 application.properties 配置
#### 打包
```shell
mvn clean package
```
### 启动JAR, jar位于dolphin/target
```shell
java -jar dolphin-1.0-SNAPSHOT.jar

```

### 访问页面
    http://localhost:9052/index

## 功能介绍
### 站点导航
* 管理公司网站
### 配置管理
* 配置公司微服务
### 脚本中心
* 管理散落在各处的脚本

## to do list
### 任务调度
### 资产管理

