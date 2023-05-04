package com.code.springJdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.code.springJdbc.Dao.StudentDao;
import com.code.springJdbc.Dao.StudentDaoImplement;

@Configuration
@ComponentScan(basePackages= {"com.code.springJdbc.Dao"})
public class jdbcConfig {

	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("system");
		ds.setPassword("system16");
		return ds;
	}
	
	@Bean("jdbcTemp")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemp=new JdbcTemplate();
		jdbcTemp.setDataSource(getDataSource());
		return jdbcTemp;
	}
	
//	@Bean("stdao")
//	public StudentDao getStudentDao() {
//		StudentDaoImplement stdao=new StudentDaoImplement();
//		stdao.setJdbcTemplate(getTemplate());
//		return stdao;
//	}
}
