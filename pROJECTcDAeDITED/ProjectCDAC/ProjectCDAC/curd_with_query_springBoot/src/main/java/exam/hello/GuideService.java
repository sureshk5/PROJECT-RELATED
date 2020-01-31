package exam.hello;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class GuideService {
	
	//private C obj1;
	private DacLayer obj1;
	
	@Autowired
	public void setObj1(DacLayer obj1) {
		System.out.println("Service : repository DAO  wired to service ");
		this.obj1 = obj1;
	}
	
	public GuideService()
	{
		
		//System.out.println("B object created");
	}

	/*//Single account by query
	public Customer findOne(int balance) {
		Customer a = obj1.findSingleAccount(balance);
		return a;
	}
	
	//multiselect by query
	public Collection<Customer> findMulti(int balance){
		Collection c = obj1.findAllAccount(balance);
		return c;
	}
	*/
//	public Customer updateOne(Customer a) {
//		obj1.updateAccount(a.getCustid(), a.getPassword());
//		return a;
//	}

}
