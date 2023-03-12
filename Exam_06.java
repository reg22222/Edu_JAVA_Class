import java.util.*;
import java.io.*;//throws IOException를 쓰기위한
public class Exam_06 {
	public static void main(String[] args) throws IOException/*예외처리 클래스*/{
		System.out.println("문자를 입력 :");
		char ch = (char)System.in.read();
		
		System.out.println(ch);
		/*
		Scanner in = new Scanner(System.in);
		System.out.println("문자를 입력 : ");
		char ch = in.nextChar ==>없음
		*/
		/*
		//char형은 수치형 자료형이면서, 문자 한개를 처리하는 자료형이다
		//아스키 코드
		char ch = 'A';
		System.out.println((char)ch+1);*/
		
		
	}
}
