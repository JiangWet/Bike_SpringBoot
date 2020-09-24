package bike.example.demo.service;


import bike.example.demo.pojo.User;

public interface UserService {

	boolean sendMsg(String countryCode, String phoneNum);

	boolean verify(String phoneNum, String verifyCode);

	void register(User user);

	void update(User user);
	
	boolean check(String number,String password);
	

}
