//import java.lang.*; //JVM이 제일먼저 자동으로 호출하는 패키지
class A10{
	public final static double PI = 3.141592;
}
public class Exam_10 {
	public static void main(String[] args) { //JVM이 먼저 실행시키는게 main이기에 static을 써야함
		//Math.PI = 111;   //final필드라서 못고친다.
		
		
		//System.out.println("반지름이 5인 원의 넓이 : " + 5*5*A10.PI);
		System.out.println("반지름이 5인 원의 넓이 : " + 5*5*Math.PI);
		//static멤버라서 클래스 이름으로 접근한다.
		//접근제한자가 public이라서 어디서든 접근이 가능함(import만 되어 있으면)
		//상수선언 : public static final 또는 public final static
		
		//
	}
}
