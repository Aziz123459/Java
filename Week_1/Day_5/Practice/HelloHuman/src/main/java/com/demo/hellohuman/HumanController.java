package com.demo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String human(@RequestParam(value="firstName",required=false) String firstName,@RequestParam(value="lastName" , required=false) String lastName,@RequestParam(value="times" , required=false) Integer times) {
		if(firstName != null && lastName != null) {
			return "hello" +firstName +" "+lastName;
		}
		if(firstName != null && times>=2) {
			String msg="";
			int i =1;
			while(i<=times) {
				msg+="hello "+ firstName;
				i++;
			}
			return msg;
		}
		if(firstName != null ) {
			return "hello "+ firstName;
		}
		return "hello Human";
	}
}
