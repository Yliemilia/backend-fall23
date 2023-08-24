package s23.uno.viikko1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHello {
	
	@RequestMapping("index")
	@ResponseBody
	public String showIndexPage() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String showContactPage() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHello(@RequestParam (name ="name") String name, @RequestParam (name="location") String location) {
		return ("Welcome to the  " + location + " " + name + "!");
	}
}
