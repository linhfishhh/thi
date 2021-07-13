package Thi;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
	static Manager m=new Manager();
	static Scanner sc=new Scanner(System.in);
	public static void Menu() throws IOException {
		System.out.println("___Chuong trinh quan ly danh ba__");
		System.out.println("1. xem danh sach");
		System.out.println("2. them moi");
		System.out.println("3. cap nhat");
		System.out.println("4. xoa");
		System.out.println("5 tim kiem");
		System.out.println("6. doc tu file");
		System.out.println("7. ghi vao file");
		System.out.println("8. exit");
		try {
		int choice=Integer.parseInt(sc.nextLine());
		choice(choice);
		}catch(NumberFormatException e) {
			System.out.println("Vui long Nhap dung Dinh dang");
			Menu();
		}
	}
	static void choice(int choice) throws IOException {
		switch(choice) {
		case 1:
			m.show();
			break;
		case 2:
			m.add();
			break;
		case 3:
			System.out.println("Nhap ten muon sua ");
			String name=sc.nextLine();
			System.out.println("nhap sdt");
			String sdt=sc.nextLine();
			m.update(name,sdt);
			break;
		case 4:
			System.out.println("nhap ten muon Xoa");
			String name1=sc.nextLine();
			System.out.println("nhap sdt Muon xoa");
			String sdt1=sc.nextLine();
			m.remove(name1,sdt1);
			break;
		case 5:
			System.out.println("Nhap ten muon tim");
			String name3=sc.nextLine();
			m.find(name3);
			break;
		case 6:
			WriteAndReadFile.ReadFile();
			break;
		case 7:
			m.WriteFile();
			break;
		default: System.exit(0);
		}
	}
	public static void main(String[] args) throws IOException {
		while(true) {
			Menu.Menu();
		}
	}
}
