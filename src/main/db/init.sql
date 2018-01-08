DROP TABLE IF EXISTS site;

CREATE TABLE site
(
    id BIGINT(20)  NOT NULL  AUTO_INCREMENT,
    url VARCHAR(355) DEFAULT '',
    is_delete INTEGER,
    name VARCHAR(355),
    create_at DATETIME,
    update_at DATETIME,
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