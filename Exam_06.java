import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		intro();
		int su1 = input();
		int su2 = input();
		int tot = sum(su1,su2);
		output(su1,su2,tot);
		
		
	}
	public static void intro() { //�Ű������� ����, ��ȯ���� ���� �޼ҵ�
		System.out.println("2���� ���� �Է¹޾� �� ���� ���ϴ� ���α׷�");
	}
	
	public static void output(int a, int b, int c) { //�Ű������� �ְ�, ��ȯ���� ���� �޼ҵ�
		System.out.printf("%d + %d = %d\n",a,b,c);
	}
	
	public static int sum(int a, int b) {//�Ű������� �ְ�, ��ȯ���� �ִ� �޼ҵ�
		return a+b;
	}
	
	public static int input() { //�Ű������� ���� ��ȯ���� �ִ� �޼ҵ�
		Scanner in = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int su = in.nextInt();
		return su;
	}
}
