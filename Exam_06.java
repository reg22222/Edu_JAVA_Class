import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		intro();
		int su1 = input();
		int su2 = input();
		int tot = sum(su1,su2);
		output(su1,su2,tot);
		
		
	}
	public static void intro() { //매개변수가 없고, 반환형도 없는 메소드
		System.out.println("2개의 수를 입력받아 그 합을 구하는 프로그램");
	}
	
	public static void output(int a, int b, int c) { //매개변수가 있고, 반환형은 없는 메소드
		System.out.printf("%d + %d = %d\n",a,b,c);
	}
	
	public static int sum(int a, int b) {//매개변수가 있고, 반환형도 있는 메소드
		return a+b;
	}
	
	public static int input() { //매개변수는 없고 반환형만 있는 메소드
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력 : ");
		int su = in.nextInt();
		return su;
	}
}
