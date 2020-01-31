package exam.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@CrossOrigin(origins = "*")
@RestController
public class A {
	
	private B obj1;
	
	public A()
	{
	}
	
	
	@Autowired
	public void setObj1(B obj1) {
		System.out.println("Controller : service is wired with Controller ");
		this.obj1 = obj1;
	}
	@RequestMapping(value="/neha",method=RequestMethod.POST,consumes ="application/json",  produces="application/json")
	public @ResponseBody void getvalue(@RequestBody Guide gd)
	{
	  
		System.out.println(gd);
		//return "neha";
	}
	@PostMapping("/error")
	public void errorMapping(@RequestBody Guide gd)
	{
		System.out.println(gd);
		
	}
	/*
	 * @GetMapping("/pw") //single select public Guide f1(@RequestParam("x")int mn)
	 * { System.out.println("function pw is getting called"); Guide m
	 * =obj1.getId(mn); return m;
	 * 
	 * }
	 * 
	 * 
	 * @GetMapping("/ms") //multi select public List<Guide> get() { List<Guide> x
	 * =obj1.getAll(); return x;
	 * 
	 * }
	 * 
	 * @GetMapping("/del") public Guide delData(@RequestParam("x")int accno) {
	 * 
	 * Guide m = obj1.delAcc(accno); return m; }
	 * 
	 * @PostMapping("/upd") public Guide updateRecords(@RequestBody Guide n)//assume
	 * single select { Guide m =obj1.update(n); return m;
	 * 
	 * }
	 */
	
}
