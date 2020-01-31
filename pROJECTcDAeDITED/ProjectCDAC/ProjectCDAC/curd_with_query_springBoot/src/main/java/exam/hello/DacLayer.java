package exam.hello;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DacLayer {
 private JdbcTemplate t;
 public DacLayer() {
	// TODO Auto-generated constructor stub
} 
 public JdbcTemplate getJt() {	 
	return t;
}
 @Bean
 public JdbcTemplate getJDBCTemplateSpringDoesNOtCareForThis()
 {	
 //	System.out.println("insdie the function that uses @Bean");
 	BasicDataSource b = new BasicDataSource();
 	b.setDriverClassName("com.mysql.cj.jdbc.Driver");
 	b.setUsername("root");
 	b.setPassword("root");
 	b.setUrl("jdbc:mysql://localhost:3306/Projectcdac");
 	JdbcTemplate t =new JdbcTemplate();
 	t.setDataSource(b);
 	return t;
 }

@Autowired
public void setJt(JdbcTemplate t) {
	this.t = t;
}

}
