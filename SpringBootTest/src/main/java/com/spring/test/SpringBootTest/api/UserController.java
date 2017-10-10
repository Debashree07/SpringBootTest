package com.spring.test.SpringBootTest.api;

import ch.qos.logback.classic.Logger;
import com.spring.test.SpringBootTest.model.ResponseCode;
import com.spring.test.SpringBootTest.model.User;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";
	private final org.slf4j.Logger logger = LoggerFactory.getLogger(UserController.class);
	@RequestMapping(value = "/",method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public User UserDetails() {
		logger.debug("debug***************");
		logger.info("info******************");
		User u = new User("Debashree",260100,"Bhubaneswar",new ResponseCode(200));

		/*u.setResponseCode(new ResponseCode(200));
		u.setName("Debashree");
		u.setEmpId(260100);
		u.setAddress("Bhubaneswar");*/

		return u;
	}

}