import java.util.*;
public class Exam_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("첫번째 수를 입력 : ");
				int n1 = in.nextInt();					
				System.out.println("두번째 수를 입력 : ");
				int n2 = in.nextInt();
				
				int res = n1/n2;
				
				System.out.println("결과 : "+res);
				break;
			}catch(InputMismatchException e) {
				System.out.println("숫자만 입력해야 합니다.");
				in.nextLine();			//엔터칠때까지 입력스트링을 비워버림
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
		
		
		
	}

}
