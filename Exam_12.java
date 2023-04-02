import java.io.*;
public class Exam_12 {
	public static void main(String[] args) {
		System.out.println("File.separator = " + File.separator);
		System.out.println("File.separatorChar = " + File.separatorChar);
		System.out.println("File.pathSeparator = " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar = " + File.pathSeparatorChar);
		
		File f1 = new File("E:"+File.separator+"weekJava"+File.separator+"study"+File.separator+"day08"
					+File.separator+"aaa.txt");
		
		File f2 = new File("E:\\weekJava\\study\\day08\\aaa.txt");		//운영체제마다 구별자가 다르기에 f1처럼 써야지 다양한 운영체제에서 사용 가능하다
		File dir = new File("E:\\weekJava\\study\\day08");
		File f4 = new File(dir,"aaa.txt");
		
		//파일객체는 꼭 파일존재해야하는가? 아니다.
		//추상적인 경로라 없어도 상관없음
	}

}
