package com.shiva.jdbc;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class jdbcConfig 
{
	 @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource ds = new DriverManagerDataSource();
	        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	        ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	        ds.setUsername("system");
	        ds.setPassword("oracle");
	        return ds;
	    }

	    @Bean
	    public JdbcTemplate jdbcTemplate() {
	        return new JdbcTemplate(dataSource());
	    }
	}

