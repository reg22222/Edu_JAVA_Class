import java.util.*;
public class Exam_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("ù��° ���� �Է� : ");
				int n1 = in.nextInt();					
				System.out.println("�ι�° ���� �Է� : ");
				int n2 = in.nextInt();
				
				int res = n1/n2;
				
				System.out.println("��� : "+res);
				break;
			}catch(InputMismatchException e) {
				System.out.println("���ڸ� �Է��ؾ� �մϴ�.");
				in.nextLine();			//����ĥ������ �Է½�Ʈ���� �������
			}catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
		}
		
		
		
	}

}
