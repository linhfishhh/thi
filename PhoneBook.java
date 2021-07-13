package Thi;

public class PhoneBook {
	private String Name;
	private String PhoneNumber;
	private String Address;
	private String Email;
	private String Fb;
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**
	 * @return the fb
	 */
	public String getFb() {
		return Fb;
	}
	/**
	 * @param fb the fb to set
	 */
	public void setFb(String fb) {
		Fb = fb;
	}
	@Override
	public String toString() {
		return "PhoneBook [Name=" + Name + ", PhoneNumber=" + PhoneNumber + ", Address=" + Address + ", Email=" + Email
				+ ", Fb=" + Fb + "]";
	}
	PhoneBook(String name, String phoneNumber, String address, String email, String fb) {
		super();
		Name = name;
		PhoneNumber = phoneNumber;
		Address = address;
		Email = email;
		Fb = fb;
	}
	
}
