import java.util.*;
import java.io.*;
public class Exam_07 {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		
		System.out.println("ù��° �� :");
		int n1 = in.nextInt();
		System.out.println("�ι�° �� :");
		int n2 = in.nextInt();
		System.out.println("��������� : ");
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
		//����ġ ���̽��� ����� �� �� ����
		
		switch(ch) {
		//byte, char, short, int, String ���� �ڷ����� ����ġ�� �� �� ����
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
			System.out.println("��������ڸ� ����� �����մϴ�");
		
		}
		
		
	}
}
