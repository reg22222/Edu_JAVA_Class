import java.util.*;
public class Exam_05 {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("�̸� : ");
		String name = in.next();
		System.out.println("���� : ");
		int kor = in.nextInt();
		System.out.println("���� ; ");
		int eng = in.nextInt();
		
		
		System.out.printf("%s���� ������ %d���Դϴ�.",name,kor+eng);
	}
}
