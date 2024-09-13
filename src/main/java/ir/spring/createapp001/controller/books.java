package ir.spring.createapp001.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class books {
	
	@GetMapping(path = "/")
	@ResponseBody
	public String HomePage() {
		return "<a href='/form'>form</a>";
	}
	
	@GetMapping(path = "/form")
	@ResponseBody
	public View form() {
		return new JstlView("/form.jsp");
	}
	  @GetMapping("/api/foo")
	    @ResponseBody
	    public String getFoos3(@RequestParam(value  = "test") String id){
	        return "ID: " + id;
	    }
	
	@PostMapping("/login")
	@ResponseBody
	public String login(@RequestParam String email,@RequestParam String password) {
		
		
		return email+password;
	}
	

}
