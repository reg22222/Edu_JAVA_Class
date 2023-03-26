//자바에서 클래스와 인터페이스 상속 관계
class A12{}
interface B12{}
//클래스는 클래스를 상속받을 수 있다
class C12 extends A12{}
//클래스는 인터페이스를 상속받을 수 있다
class D12 implements B12{}
//클래스는 클래스를 상속받고 인터페이스를 상속받을 수 있다.
class E12 extends A12 implements B12{}
//인터페이스는 인터페이스를 상속받을 수 있다.
interface F12 extends B12{}
//인터페이스는 인터페이스를 다중상속 받을 수 있다.
interface G12 extends B12, F12{}
//인터페이스는 클래스를 상속받지 못한다.
//클래스는 인터페이스를 다중상속 받을 수 있다.
class H12 implements B12, F12{}
//클래스는 클래스를 상속받고 인터페이스를 다중상속 받을 수 있다.
class I12 extends A12 implements B12, F12{}
public class Exam_12 {
	public static void main(String[] args) {
		
		/*
		 * java API수업
		 * -java.lang 패키지
		 *   -String
		 *   -System등등...
		 *   -Thread
		 *   -예외처리
		 *   -그외 클래스
		 *   
		 * - java.util 패키지
		 *   -Collection
		 *   -Date와 Calendar 
		 *   -Scanner
		 *   -그외 클래스
		 *   
		 * -java.text 패키지
		 *   -SimpleDateFormat
		 *   -DecimalFormat
		 *   
		 * -java.io 패키지
		 *   -File
		 *   -1byte 입출력
		 *   -text  입출력
		 *   -Object 입출력
		 */
		
	}

}
