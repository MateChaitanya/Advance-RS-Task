package in.sp.resources;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {

    @Bean
    public DataSource myDataSource() {  // Return type correctly defined as DataSource
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db1");
        dataSource.setUsername("root");
        dataSource.setPassword("Chaitu@123");
        return dataSource;
    }

    @Bean
    public JdbcTemplate myJdbcTemplate(DataSource dataSource) {  // Pass DataSource as a parameter
        return new JdbcTemplate(dataSource);
    }
}
