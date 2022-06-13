package tw.com.lccnet.web.utils;

public class PersonalProfile {
	private String MyPhoto;
	private String Information;
	private String EmploymentStatus;
	private String PhoneNumber;
	private String Email;
	private String Address;
	private String EName;
	
	public PersonalProfile() {
		super();
	}
	public PersonalProfile(String myPhoto, String information, String employmentStatus, String phoneNumber,
			String email, String address, String eName) {
		super();
		MyPhoto = myPhoto;
		Information = information;
		EmploymentStatus = employmentStatus;
		PhoneNumber = phoneNumber;
		Email = email;
		Address = address;
		EName = eName;
	}
	public String getMyPhoto() {
		return MyPhoto;
	}
	public void setMyPhoto(String myPhoto) {
		MyPhoto = myPhoto;
	}
	public String getInformation() {
		return Information;
	}
	public void setInformation(String information) {
		Information = information;
	}
	public String getEmploymentStatus() {
		return EmploymentStatus;
	}
	public void setEmploymentStatus(String employmentStatus) {
		EmploymentStatus = employmentStatus;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEName() {
		return EName;
	}
	public void setEName(String eName) {
		EName = eName;
	}
	@Override
	public String toString() {
		return "PersonalProfile [MyPhoto=" + MyPhoto + ", Information=" + Information + ", EmploymentStatus="
				+ EmploymentStatus + ", PhoneNumber=" + PhoneNumber + ", Email=" + Email + ", Address=" + Address
				+ ", EName=" + EName + "]";
	}
	
}
