package bike.example.demo.pojo;

import java.util.Date;

import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.index.GeoSpatialIndexType;
//import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="repairmsg")
public class RepairMsg {
	
	//主键（唯一、建立索引），id对于MongDB中的_id
	@Id
	private String id;
	//表示经纬度数组(数组第一个元素是经度，第二个为纬度）
	//@GeoSpatialIndexed(type=GeoSpatialIndexType.GEO_2DSPHERE)
	//private double[] location;
	private double longitude;
	private double latitude;
	//建立索引
	
	//单车ID
	private String bikeNo;
	//报修信息
	private String repairMsg[];
	//图片
	private String image[];
	@Indexed
	//手机号
	private String phoneNum;
	//状态
	private Integer status;
	//备注
	private String desc;
	//日期
	private Date regDate;
	
	public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getBikeNo() {
		return bikeNo;
	}
	public void setBikeNo(String bikeNo) {
		this.bikeNo = bikeNo;
	}
	public String[] getRepairMsg() {
		return repairMsg;
	}
	public void setRepairMsg(String[] repairMsg) {
		this.repairMsg = repairMsg;
	}
	public String[] getImage() {
		return image;
	}
	public void setImage(String[] image) {
		this.image = image;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
		
}
