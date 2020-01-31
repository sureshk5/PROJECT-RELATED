package exam.hello;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class B {
	
	private C obj1;
	
	
	@Autowired
	public void setObj1(C obj1) {
		System.out.println("Service : repository DAO  wired to service ");
		this.obj1 = obj1;
	}

	public B()
	{
		
	}

	/*
	 * public Guide getId(int mn) { // note obj1 here is a repository object
	 * 
	 * Optional<Guide> x = obj1.findById(mn); Guide y =null; if(x.isPresent()) { y =
	 * x.get(); //get the mobile object
	 * 
	 * } else { y =new Guide(mn); } return y;
	 * 
	 * }
	 * 
	 * 
	 * public List<Guide> getAll() { return obj1.findAll(); }
	 * 
	 * public Guide delAcc(int accno) { obj1.deleteById(accno); Guide a =
	 * getId(accno); return a; }
	 * 
	 * public Guide update(Guide n) { // System.out.println("update failure"); //
	 * TODO Auto-generated method stub
	 * 
	 * if(obj1.existsById(n.getCustid())) { obj1.save(n); }//change of failing is
	 * almost zero.
	 * 
	 * else { n = new Guide(0); //obj1.save(n); } return n; }
	 */
}
