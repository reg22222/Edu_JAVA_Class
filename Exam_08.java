import java.util.*;
import java.io.*;
public class Exam_08 {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		System.out.println("1번째 수 입력 : ");
		int n1 = in.nextInt();
		System.out.println("2번쨰 수 입력 :");
		int n2 = in.nextInt();
		System.out.println("산술연산자 입력 : ");
		char op = (char)System.in.read();
		int tot = 0;
		switch(op) {
		case '+': tot = plus(n1,n2); break;
		case '-': tot = minus(n1,n2); break;
		case '*': tot = multi(n1,n2); break;
		case '/': tot = div(n1,n2); break;
		case '%': tot = mod(n1,n2); break;
		default:
			System.out.println("산술연산자가 아니라서 계산 불가");
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
