package bike.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bike.example.demo.pojo.Billing;
import bike.example.demo.service.BillingService;


@Controller
public class BillingController {
	//到spring容器中查找BillingService的类型的实例，然后注入到BillingController实例中
			@Autowired
			private BillingService billingSrevice;
			
			@RequestMapping("/user/billing")
			@ResponseBody
			public boolean warn(@RequestBody Billing billing) {
				boolean flag=true;
				try {
					billingSrevice.billing(billing);
				}
				catch(Exception e) {
					e.printStackTrace();
					flag=false;
				}
				return flag;
			}
}
