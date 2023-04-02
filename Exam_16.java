import java.io.*;
public class Exam_16 {
	public static void main(String[] args) throws IOException{
		
		File dir = new File("D:\\°ûÁ¤±Ù\\study\\day08");
		File file = new File(dir,"bbb.txt");
		
		int a = 10;
		String msg = "¾È³çÇÏ¼¼¿ä!!";
		double b = 10.23;
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeInt(a);
		dos.writeDouble(b);
		dos.writeUTF(msg);
		
		dos.close(); //flush()
		
	}

}
