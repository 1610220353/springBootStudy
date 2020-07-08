package com.guohong.spring.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author guohong
 * mybatis 第一个配置
 * 声明该类是一个配置类
 * 在SpringBoot的启动类上，使用@MapperScan注解时引入了错误的包下的。
 * 　　正确的应该是：import tk.mybatis.spring.annotation.MapperScan;
 * 　　错误的引入了：import org.mybatis.spring.annotation.MapperScan;
 * SqlSessionFactory根据dsOne创建，然后再根据创建好的SqlSessionFactory创建一个SqlSessionTemplate。
 * 扫描的包是com.guohong.spring.mapper1
 */
@Configuration
@MapperScan(basePackages = "com.guohong.spring.mapper1", sqlSessionFactoryRef = "sqlSessionFactory1", sqlSessionTemplateRef = "sqlSessionTemplate1")
public class MyBatisConfigOne {
    @Resource(name = "dsOne")
    DataSource dsOne;

    @Bean
    SqlSessionFactory sqlSessionFactory1() {
        SqlSessionFactory sessionFactory = null;
        try {
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            bean.setDataSource(dsOne);
            sessionFactory = bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }

    @Bean
    SqlSessionTemplate sqlSessionTemplate1() {
        return new SqlSessionTemplate(sqlSessionFactory1());
    }
}
