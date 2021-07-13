package Thi;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
public class Manager {
	Scanner sc=new Scanner(System.in);
	String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
	String SDT_PATTERN="^\\d{2}-[0]\\d{9}$";
	private ArrayList<PhoneBook> List=new ArrayList<PhoneBook>();
	
	/**
	 * @return the list
	 */
	public ArrayList<PhoneBook> getList() {
		return List;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<PhoneBook> list) {
		List = list;
	}
	public PhoneBook createPhoneBook() {
		System.out.println("Nhap ten: ");
		String Name=sc.nextLine();
		System.out.println("Nhap Sdt");
		String Sdt=sc.nextLine();
		System.out.println("Address:");
		String address=sc.nextLine();
		System.out.println("nhap Email:");
		String Email=sc.nextLine();
		System.out.println("Nhap fb: ");
		String fb=sc.nextLine();
		if(!Pattern.matches(EMAIL_PATTERN, Email)) {
			System.out.println("nhap lai dung dinh dang");
			return createPhoneBook();
		}else return new PhoneBook(Name,Sdt,address,Email,fb);
	}
	public void add() {
		PhoneBook p=createPhoneBook();
		List.add(p);
	}
	public void update(String name,String sdt) {
		for(int i=0;i<List.size();i++) {
			if(List.get(i).getName().equals(name)) {
				if(List.get(i).getPhoneNumber().equals(sdt)) {
				List.set(i, createPhoneBook());
				}
			}
		}
	}
	public void remove(String name,String sdt) {
		for(int i=0;i<List.size();i++) {
			if(List.get(i).getName().equals(name)) {
				if(List.get(i).getPhoneNumber().equals(sdt)) {	
				List.remove(i);
				}
			}
		}
	}
	public void find(String name) {
		for(int i=0;i<List.size();i++) {
			if(List.get(i).getName().equals(name)) {
			System.out.println(List.get(i));
			}
		}
	}
	public void show() {
		for(int i=0;i<List.size();i++) {
			System.out.println(List.get(i));
		}
	}
	public void WriteFile() throws IOException {
		for(int i=0;i<List.size();i++) {
			WriteAndReadFile.WriteFile(List.get(i).toString());
		}
	}
}
