import java.util.*;
public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("ù��° �� �Է� : ");
		
		int n1 = in.nextInt();
		System.out.println("�ι�° �� �Է� :");
		int n2 = in.nextInt();
		
		if (n1 < n2)
		{
			System.out.printf("%d�� �� ũ��",n2);
		}
		else if (n1>n2)
		{
			System.out.printf("%d�� �� ũ��",n1);
		}
		else
		{
			System.out.println("����");
		}
	}
}
