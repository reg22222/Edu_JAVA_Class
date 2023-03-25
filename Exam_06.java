import test.*;
class A06{
	private int a;
	A06(){
		a = 10;
	}
	public void disp() {
		System.out.println("a = "+a);
	}
}


public class Exam_06 {
	public static void main(String[] args) {
		//A06 ap = new A06();
		//ap.disp();
		//ap.a = 100;
		//ap.disp();
		test01 t1 = new test01();
		t1.disp();
		
		//A06 ap = new A06(1);
		
	}
	/*
	 * 접근제한자
	 * -private		:클래스 내부에서만 접근 가능
	 * -default		:같은 폴더(같은 패키지)에서 접근 가능, 아무것도 적지 않으면...
	 * -protected	:상속관계에서는 public처럼, 상송관계가 아니면 default처럼 접근가능
	 * -public		:누구나 접근 가능
	 */
	
	/*
	 *  객체지향언어 4가지 속성
	 *  -은닉화 : 멤버를 숨긴다.(외부에 보여주지 않음) 자바에서는 private 선어가 은닉화에 해당함. 자바에서는 멤머필드는 프라이빗, 메소드는 퍼블릿으로 
	 *  -상속성
	 *  -다형성
	 *  -추상화
	 */
	
	

}
