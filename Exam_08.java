import java.util.*;
import java.io.*;
public class Exam_08 {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		System.out.println("1��° �� �Է� : ");
		int n1 = in.nextInt();
		System.out.println("2���� �� �Է� :");
		int n2 = in.nextInt();
		System.out.println("��������� �Է� : ");
		char op = (char)System.in.read();
		int tot = 0;
		switch(op) {
		case '+': tot = plus(n1,n2); break;
		case '-': tot = minus(n1,n2); break;
		case '*': tot = multi(n1,n2); break;
		case '/': tot = div(n1,n2); break;
		case '%': tot = mod(n1,n2); break;
		default:
			System.out.println("��������ڰ� �ƴ϶� ��� �Ұ�");
		}
		System.out.printf("%d %c %d = %d\n",n1,op,n2,tot);

		
	}

	public static int plus(int a, int b) {
		return a+b;
	}
	public static int minus(int a, int b) {
		return a+b;
	}
	public static int multi(int a, int b) {
		return a+b;
	}
	public static int div(int a, int b) {
		return a+b;
	}
	public static int mod(int a, int b) {
		return a+b;
	}
}
