package bike.example.demo.pojo;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

//Billing这个类以后跟mongoDB中的billing collection关联上了
@Document(collection="billing")
public class Billing {
	//主键（唯一、建立索引），id对于MongDB中的_id
		@Id
		private String id;
		
		//表示经纬度数组(数组第一个元素是经度，第二个为纬度）
		//@GeoSpatialIndexed(type=GeoSpatialIndexType.GEO_2DSPHERE)
		//private double[] location;
		private double longitude;
		private double latitude;
		//建立索引
		@Indexed
		//单车ID
		private Long bikeNo;
		@Indexed
		//手机号
		private String phoneNum;
		//姓名
		private String name;
		//骑行费用
		private String billings;
		//租借时间
		private Date rentTime;
		//归还时间
		private Date returnTime;
		//租借状态
		private int status;
		
		
		public double getLongitude() {
			return longitude;
		}
		public void setLongitude(double longitude) {
			this.longitude = longitude;
		}
		public double getLatitude() {
			return latitude;
		}
		public void setLatitude(double latitude) {
			this.latitude = latitude;
		}
		public Date getRentTime() {
			return rentTime;
		}
		public void setRentTime(Date rentTime) {
			this.rentTime = rentTime;
		}
		public Date getReturnTime() {
			return returnTime;
		}
		public void setReturnTime(Date returnTime) {
			this.returnTime = returnTime;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public Long getBikeNo() {
			return bikeNo;
		}
		public void setBikeNo(Long bikeNo) {
			this.bikeNo = bikeNo;
		}
		public String getPhoneNum() {
			return phoneNum;
		}
		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBillings() {
			return billings;
		}
		public void setBillings(String billings) {
			this.billings = billings;
		}		
		
}
