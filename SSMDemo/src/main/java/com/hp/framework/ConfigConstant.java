package com.hp.framework;

/**
 * 提供相关配置项常量
 */
public interface ConfigConstant {

    //配置文件的名称
    String CONFIG_FILE = "hp.properties";

    //数据库
    String JDBC_DRIVER = "hp.framework.jdbc.driver";
    String JDBC_URL = "hp.framework.jdbc.url";
    String JDBC_USERNAME = "hp.framework.jdbc.username";
    String JDBC_PASSWORD = "hp.framework.jdbc.password";

    //文件地址
    String APP_BASE_PACKAGE = "hp.framework.app.base_package";
    String APP_JSP_PATH = "hp.framework.app.jsp_path";
    String APP_ASSET_PATH = "hp.framework.app.asset_path";
}
