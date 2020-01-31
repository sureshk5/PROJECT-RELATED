package exam.hello;

import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
import org.springframework.web.servlet.ModelAndView;


@CrossOrigin(origins = "*")
@RestController
public class AppController {
	
	private AppService obj1;
	
	public AppController() {
		
	}
	
	
	@Autowired
	public void setObj1(AppService obj1) {
		System.out.println("Controller : service is wired with Controller ");
		this.obj1 = obj1;
	}

	/*
	 * @RequestMapping(value="/neha",method=RequestMethod.POST,consumes
	 * ="application/json", produces="application/json") public @ResponseBody void
	 * getvalue(@RequestBody Guide gd) {
	 * 
	 * System.out.println(gd); //return "neha"; }
	 */
	@RequestMapping(value="/neha",method=RequestMethod.POST,consumes ="application/json",  produces="application/json")
	public @ResponseBody ResponseEntity<?> getvalue(@RequestBody String gd)
	{
		AjaxResponseBody result= new AjaxResponseBody();
		if(!gd.equals("eyJ1c2VySWQiOiIiLCJwYXNzd29yZCI6IiJ9"))
		{
		Base64.Decoder decoder = Base64.getDecoder(); //decode base 64 encode value
		byte[] decodedByteArray=decoder.decode(gd); // convert to byte array
		String stringValue=new String(decodedByteArray);// convert to string
		StringTokenizer st = new StringTokenizer(stringValue, ":\\,\\}\\{\\''"); // break into tokens
		String[] str= new  String[16]; // initialise array
		int i=0;
		while(st.hasMoreTokens()) 
		{
			String s1=st.nextToken();
			String s2=s1.replaceAll("\"", "");
			str[i]=s2; //add tokens to string array
			i++;
		}
		Guide guide= new Guide(str[1],str[3],str[5],str[7],str[9],str[11],str[13],str[15]);
		System.out.println(guide);
		Guide guide2=obj1.insertIntoDB(guide);
		result.setMsg("hello there!");
		}
		return ResponseEntity.ok(result);
	}
	@RequestMapping(value="/login",method=RequestMethod.POST,consumes ="application/json",  produces="application/json")
	public @ResponseBody ResponseEntity<?> loginDetails(@RequestBody String gd)
	{
		AjaxResponseBody result= new AjaxResponseBody();
		if(!gd.equals("eyJ1c2VySWQiOiIiLCJwYXNzd29yZCI6IiJ9"))
		{
		Base64.Decoder decoder = Base64.getDecoder(); 
		byte[] decodedByteArray=decoder.decode(gd);
		String stringValue=new String(decodedByteArray);
		//System.out.println(new String(stringValue).toString());
		StringTokenizer st = new StringTokenizer(stringValue, ":\\,\\}\\{\\''");
		String[] str= new  String[4];
		int i=0;
		while(st.hasMoreTokens()) 
		{
			String s1=st.nextToken();
			String s2=s1.replaceAll("\"", "");
			str[i]=s2;
			i++;
		}
		Guide gd21=new Guide("1","2","3","4","5","6","7","8");
		if(obj1.findValue(str[1],str[3]))
			result.setMsg(gd21.toString());
	//	result.setMsg("logged in");
		else
			result.setMsg("loggin failed");
			//result.setMsg(gd21.toString());
		}
		return ResponseEntity.ok(result);	
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
