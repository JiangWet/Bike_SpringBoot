package bike.example.demo.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexType;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

//Bike这个类以后跟mongoDB中的bikes collection关联上了
@Document(collection="bikes")
public class Bike {
	
	//主键（唯一、建立索引），id对于MongDB中的_id
	@Id
	private String id;
	
	//表示经纬度数组(数组第一个元素是经度，第二个为纬度）
	@GeoSpatialIndexed(type=GeoSpatialIndexType.GEO_2DSPHERE)
	private double[] location;
	
	//建立索引
	@Indexed
	//单车ID
	private Long bikeNo;
	//颜色
	private String color;
	//租金
	private String billing;
	//押金
	private double deposit;
	//状态
	private int status;
	//生厂商
	private String producer;
	//图片
	private String image;
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBilling() {
		return billing;
	}

	public void setBilling(String billing) {
		this.billing = billing;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Long getBikeNo() {
		return bikeNo;
	}

	public void setBikeNo(Long bikeNo) {
		this.bikeNo = bikeNo;
	}
	
	public double[] getLocation() {
		return location;
	}

	public void setLocation(double[] location) {
		this.location = location;
	}



}
