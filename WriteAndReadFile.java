package Thi;
import java.io.*;
import java.util.ArrayList;
public class WriteAndReadFile {
	static void WriteFile(String PhoneBook) throws IOException {
		File File=new File("test.csv");
		if(!File.exists()) {
			File.createNewFile();
		}
		FileWriter fw=new FileWriter(File,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(PhoneBook);
		bw.newLine();
		bw.close();
	}
	static void ReadFile() throws IOException {
		FileReader fr=new FileReader("test.csv");
		BufferedReader br=new BufferedReader(fr);
		int i;
		while((i=br.read())!=-1) {
			System.out.print((char) i);
		}
		br.close();
	}
}
