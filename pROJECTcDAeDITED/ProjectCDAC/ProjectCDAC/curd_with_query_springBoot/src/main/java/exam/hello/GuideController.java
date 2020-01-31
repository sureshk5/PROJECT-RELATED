package exam.hello;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@CrossOrigin(origins = "*")
@RestController
public class GuideController {
	
	private GuideService obj1;
	
	public GuideController()
	{
		////System.out.println("A object created");
		
	}
	
	
	@Autowired
	public void setObj1(GuideService obj1) {
		System.out.println("Controller : service is wired with Controller ");
		this.obj1 = obj1;
	}
		
	
	/*
	@GetMapping("/ssq")
	public Customer singleSelect(@RequestParam("x")int balance) {
		Customer a = obj1.findOne(balance);
		return a;
	}
	
	

	@GetMapping("/msq")
	public Collection<Customer> multiSelect(@RequestParam("x")int balance) {
		Collection<Customer> a = obj1.findMulti(balance);
		return a;
	}
	*/
	@PostMapping("/upq")
	public Guide updateSingle(@RequestBody Guide a) {
		//Customer b = obj1.updateOne(a);
		return null;
	}
}
