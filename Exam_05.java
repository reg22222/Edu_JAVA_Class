
public class Exam_05 {
	public static void main(String[] args) {
		/*
		 * package 패키지명;
		 * import  패키지명;
		 * 
		 * 접근제한자 지정예약어  class 클래스명
		 * 				extends상위 클래스 implements 상위인터페이스
		 *		자료형 멤버필드(변수명);
		 *		반환형 멤버메소드(매개변수...){
		 *		}
		 *		접근제한자 생성자(){}
		 *		중첩클래스(내부클래스)
		 *
		 *클래스 : 구조체에 기능(메소드)을 넣어 만든 형태
		 *-> 선언(변수)(또는 멤머필드)부와 기능(메소드)(또는 멤머메소드)로 이뤄진 자료형
		 */
		/*
		 * 1.멤버필드와 멤버메소드
		 * 2.생성자(중요함)
		 * 3.접근제한자
		 * 4.지정예약어
		 * 5.중첩클래스
		 * 6.상속
		 * 7.다형성
		 * 8.추상화
		 * 9.인터페이스
		 * 
		 * 객체지향언어 4가지 속성
		 * -은닉화
		 * -상속성 (상속 - extends 상위클래스)
		 * -다형성
		 * -추상화
		 */
		/*
		 * 1.멤버필드와 멤버메소드
		 * -멤버필드 : 클래스 내부에서 실행을 위해 필요한 변수 선언
		 * -멤버메소드 : 클래스 내부에서 기능을 위해 선언
		 *   형식 : 반환형 메소드명(매개변수...){return 반환값;}
		 *   메소드는 클래스 안에서만 쓸수있고 함수는 독립적으로 쓸수있음
		 *   자바는 모두 메소드
		 *   사실상 메소드 함수 둘다 함수
		 *   반환형 : 반환값의 자료형(메소드의 자료형이 아님)
		 *   -반환형의 종류
		 *    -void : 반환할 값이 없어요 라고 알려주는 반환형(신호만 전달하는 자료형)
		 *    -기본자료형 : boolean, int, double, float, long, byte, char, short
		 *    - 클래스 : String.....
		 *   -매개변수 : 메소드가 실행할때 초기값으로 주는 변수
		 *   		    매개변수가 없어도 상관없다
		 *   -반환값(return) : 이 메소드가 실행이 된 후, 결과를 내보낸다
		 *                   void일때는 return만 써주면 된다(return만 쓸때는 생략가능)(JVM이 알아서 써줌)
		 *                   메소드의 끝은 return
		 *   메소드를 만드는 상황
		 *   -주로 반복되는 기능이 있을때
		 *   -어려운 부분을 기능으로 만들어 호출하여 사용할때
		 *   -메소드오버로딩 : 메소드의 이름은 같고, 매개변수가 틀린 메소드의 집합
		 */
		class Person{
			String 이름;
			int 나이;
			double 키;
			double 몸무게;
			String 최종학력;
			//저 위에 있는 선언한 변수들이 멤머필드
			
			void disp() {
				System.out.println("당신의 최종학력은 "+최종학력 + "입니다.");
			//이것들이 메소드
			}
		}
	}
}
//구조체 : 서로다른 자료형을 하나로 묶어서 사용 ->구조체는 개발자가 선언해준다.
//->새로운 자료형, 변수만 선언
