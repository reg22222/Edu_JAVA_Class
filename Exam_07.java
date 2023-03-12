import java.util.*;
import java.io.*;
public class Exam_07 {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		
		System.out.println("첫번째 수 :");
		int n1 = in.nextInt();
		System.out.println("두번째 수 :");
		int n2 = in.nextInt();
		System.out.println("산술연산자 : ");
		char ch = (char)System.in.read();
		
		/*
		if (ch == '+')
		{
			System.out.printf("%d %c %d = %d",n1,ch,n2,(n1+n2));
		}
		else if (ch == '-')
		{
			System.out.printf("%d %c %d = %d",n1,ch,n2,(n1-n2));
		}
		else if (ch == '*')
		{
			System.out.printf("%d %c %d = %d",n1,ch,n2,(n1*n2));
		}
		else if (ch == '/')
		{
			System.out.printf("%d %c %d = %d",n1,ch,n2,(n1/n2));
		}
		else if (ch == '%')
		{
			System.out.printf("%d %c %d = %d",n1,ch,n2,(n1%n2));
		}*/
		//스위치 케이스엔 상수만 올 수 있음
		
		switch(ch) {
		//byte, char, short, int, String 같은 자료형만 스위치에 올 수 있음
		case '+':
			System.out.printf("%d %c %d = %d",n1,ch,n2,(n1+n2));
			break;
		case '-':
			System.out.printf("%d %c %d = %d",n1,ch,n2,(n1-n2));
			break;
		case '*':
			System.out.printf("%d %c %d = %d",n1,ch,n2,(n1*n2));
			break;
		case '/':
			System.out.printf("%d %c %d = %d",n1,ch,n2,(n1/n2));
			break;
		case '%':
			System.out.printf("%d %c %d = %d",n1,ch,n2,(n1%n2));
			break;
		default:
			System.out.println("산술연산자만 계산이 가능합니다");
		
		}
		
		
	}
}
