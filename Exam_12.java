import java.io.*;
public class Exam_12 {
	public static void main(String[] args) {
		System.out.println("File.separator = " + File.separator);
		System.out.println("File.separatorChar = " + File.separatorChar);
		System.out.println("File.pathSeparator = " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar = " + File.pathSeparatorChar);
		
		File f1 = new File("E:"+File.separator+"weekJava"+File.separator+"study"+File.separator+"day08"
					+File.separator+"aaa.txt");
		
		File f2 = new File("E:\\weekJava\\study\\day08\\aaa.txt");		//�ü������ �����ڰ� �ٸ��⿡ f1ó�� ����� �پ��� �ü������ ��� �����ϴ�
		File dir = new File("E:\\weekJava\\study\\day08");
		File f4 = new File(dir,"aaa.txt");
		
		//���ϰ�ü�� �� ���������ؾ��ϴ°�? �ƴϴ�.
		//�߻����� ��ζ� ��� �������
	}

}
