import java.util.Scanner;

class Member{
	String name;
	String tel;
	Member(String name, String tel){
		this.name = name;
		this.tel = tel;	
	}
	
	void disp() {
		System.out.println(name+"님의 전화번호는 " + tel +"번입니다.");
	}
}


public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//3명 회원의 이름과 전화번호를 입력받아 관리해보자
		//클래스 배열 만들기
		//1. 객체의 갯수를 정의
		Member[] mb = new Member[3];
		
		for(int i = 0 ; i < 3; ++i)
		{
			//2.각 객체를 생성하기
			
			System.out.println("이름을 입력 : ");
			String name = in.next();
			System.out.println("전화번호를 입력 : ");
			String tel = in.next();
			mb[i] = new Member(name, tel);
		}
		for(int i=0 ;i<3 ; ++i) {
			mb[i].disp();
		}
		
	}

}
