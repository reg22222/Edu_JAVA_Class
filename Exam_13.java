import java.io.*;
public class Exam_13 {
	public static void main(String[] args) throws IOException {
		
		File dir = new File("D:\\������\\study\\day08");
		File file = new File(dir,"aaa.txt");
		
		file.delete();		//�ش簴ü�� ������ �ٷ� ����
		
		if(file.createNewFile()) {
			//������ ������ ����� true, ������ false�� ��ȯ
			System.out.println("������ ��������ϴ�.");
		}else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		
		 File imsi = File.createTempFile("temp0", ".txt",dir);
		 //�ӽ� ���� �����
		 imsi.deleteOnExit();		//���α׷� ����� ���� ����
		 
		 try {
			 Thread.sleep(5000);
		 }catch(Exception e) {}
		 //5�ʵ� ���� ����
		 
		 

		
		
	}

}
