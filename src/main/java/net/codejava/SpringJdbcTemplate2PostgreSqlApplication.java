package net.codejava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringJdbcTemplate2PostgreSqlApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcTemplate2PostgreSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		String sql = "INSERT INTO student(name, email) VALUES ('Alex', 'alex.email.com')";
		String sql = "INSERT INTO student VALUES (4, 'kevin@email.com', 'Kevin')";

		int rows = jdbcTemplate.update(sql);
		if (rows > 0) {
			System.out.println("A new row has been inserted.");
		}
	}

}
