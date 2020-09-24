package bike.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import bike.example.demo.pojo.RepairMsg;
@Service
public class RepairServiceImpl implements RepairService {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	//插入报修信息
	@Override
	public void repair(RepairMsg bikeRepair) {
	
	mongoTemplate.insert(bikeRepair);
	}
}
