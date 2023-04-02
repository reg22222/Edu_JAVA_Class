import java.io.*;
import java.io.*;

public class Exam_17 {
	public static void main(String[] args) throws IOException{
		File dir = new File("D:\\°ûÁ¤±Ù\\study\\day08");
		File file = new File(dir,"bbb.txt");

		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		int a = dis.readInt();
		double b = dis.readDouble();
		String msg = dis.readUTF();
	
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("msg = "+msg);
	}
}
