package tw.com.lccnet.web.utils;

public class FirstPersonInfo {
	private String CName;
	private String University;
	private String Major;
	private String Address;
	private String WorkExperience;
	
	public FirstPersonInfo() {
		super();
	}
	public FirstPersonInfo(String cName, String university, String major, String address, String workExperience) {
		super();
		CName = cName;
		University = university;
		Major = major;
		Address = address;
		WorkExperience = workExperience;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public String getUniversity() {
		return University;
	}
	public void setUniversity(String university) {
		University = university;
	}
	public String getMajor() {
		return Major;
	}
	public void setMajor(String major) {
		Major = major;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getWorkExperience() {
		return WorkExperience;
	}
	public void setWorkExperience(String workExperience) {
		WorkExperience = workExperience;
	}
	@Override
	public String toString() {
		return "FirstPersonInfo [CName=" + CName + ", University=" + University + ", Major=" + Major + ", Address="
				+ Address + ", WorkExperience=" + WorkExperience + "]";
	}
}
