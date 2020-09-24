package bike.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import bike.example.demo.pojo.Billing;
@Service
public class BillingServiceImpl implements BillingService{
	@Autowired
	private MongoTemplate mongoTemplate;
	
	//插入订单信息
	@Override
	public void billing(Billing billing) {
	
	mongoTemplate.insert(billing);
	}
}
