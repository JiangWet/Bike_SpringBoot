package bike.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bike.example.demo.pojo.User;
import bike.example.demo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/genCode")
	@ResponseBody
	public boolean genVerifyCode(String countryCode,String phoneNum) {
		
		boolean flag=userService.sendMsg(countryCode,phoneNum);
		return flag;
	}
	
	@RequestMapping("user/verify")
	@ResponseBody
	public boolean verify(String phoneNum,String verifyCode) {
		//调用Service层进行校验
		return userService.verify(phoneNum,verifyCode);
		
		
	}
	
	@RequestMapping("/user/register")
	@ResponseBody
	//参数前加@RequestBody，接收json类型的参数，然后set到对应的实体类中的属性
	public boolean reg(@RequestBody User user) {
		boolean flag=true;
		//调用Service，将用户数据保存起来
		try {
			userService.register(user);
		}catch(Exception e) {
			e.printStackTrace();
			flag=false;
		}
		return flag;
		//return false;
	}
	
	@RequestMapping("user/deposit")
	@ResponseBody
	public boolean deposit(@RequestBody User user) {
		boolean flag=true;
		try {
			userService.update(user);
		}catch(Exception e) {
			e.printStackTrace();
			flag=false;
		}
		return flag;
	}
	
	@RequestMapping("/user/identify")
	@ResponseBody
	public boolean indentify(@RequestBody User user) {
		boolean flag=true;
		try {
			userService.update(user);
		}
		catch(Exception e) {
			e.printStackTrace();
			flag=false;
		}
		return flag;
	}
	
	@RequestMapping("/user/scan")
	@ResponseBody
	public boolean billing(String number,String password) {
		//调用Service层进行校验
		return userService.check(number,password);
	}
	
}

