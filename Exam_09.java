import java.util.*;
public class Exam_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("�������� �Է� : ");
		int kor = in.nextInt();
		System.out.println("�������� �Է� : ");
		int eng = in.nextInt();
		
		int avg = 2/(kor+eng);
		
		switch(avg/10) {
		case 10:System.out.println("��"); break;
		case 9:System.out.println("��"); break;
		case 8:System.out.println("��"); break;
		case 7:System.out.println("��"); break;
		case 6:System.out.println("��"); break;
		default: System.out.println("��"); break;
		}
		
		
	}

}
