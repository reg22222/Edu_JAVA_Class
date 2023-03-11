
public class Exam_02 {
	public static void main(String[] args) {
		
		//String name = "홍길동";
		
		
		
		/*
		 * -----------자료형,변수,상수-----------
		 * 변수 : 변하는 수
		 * 상수 : 변하지 않는 수
		 * 자료형 : 변수나 상수등에 넣을 데이터 담을 그릇
		 * 종류(가장 기본이 되는 자료형)
		 * - 논리형 : boolean(1byte) - true, false만 입력가능
		 * - 정수형 : byte(1byte), short(2byte), char(2byte), int(4byte), long(8byte)
		 *  - 기본자료형 : int
		 * - 실수형 : float(4byte), double(8byte)
		 *  -기본자료형 : double
		 *  -float을 사용하려면 반드시 f나 F가 붙어야한다
		 * - 문자열형 : String
		 * 위 기본자료형 외에는 클래스 자료형 (첫글자가 대문자)
		 * 
		 * 
		 * 컴퓨터는 연산을 한번밖에 못한다. 그후 저장해야함
		 * 
		 * 형변환
		 * - 자동형변환 : 작은 자료형에서 큰 자료형으로 이동
		 * - 강제형변환 : 큰 자료형에서 작은 자료형으로 이동할떄
		 * 			     앞에 (바꾸고자 하는 자료형)을 넣어준다
		 * 
		 * 실수형은 정수형보다 항상 크다
		 * double > float > long > int
		 * char형이 문자형이라서 음수가 없음
		 * char형은 음수 표현할 양까지 양수로 표현함
		 * 
		 * ----자료형이 표현할수 있는 값----
		 * byte(1) : -128 ~ 127
		 * short(2) : -32,768 ~ 32,767
		 * char(2) : 0 ~ 65,535 --> 음수없어서 byte로 바꿔서 들어감 -> 데이터가 망가질 가능성이 높음 (복구불가)
		 * int(4) : -2^31 ~ 2^31-1
		 * long(8) : -2^63 ~ -2^63-1
		 * 
		 * -----------자료형 관계도
		 * byte a = 10;
		 * char b = (char)a;
		 * short c = (short)b;
		 * char d = (char)c;
		 * byte e = (byte)d;
		 * 
		 * int형 이상의 자료형에서 연산결과는 큰 자료형값
		 * int형 이하의 자료형에서 연산결과는 int값
		 * byte형 + byte형 = int형 -> 에러, 강제형변환 해줘야됨
		 * byte a = 10;
		 * byte b = 10;
		 * byte c = (byte)(a + b);
		 * 
		 * int d = 10;
		 * float e = 10.23f;
		 * int f = (int)(d + e); 
		 * int형  + float형 = float형
		 * 
		*/
		
		/*
		 * 자바의 기본 입출력
		 * -System 클래스
		 *  - 입력 :in    System.in : 키보드로부터 값을 입력받는다
		 *  - 출력 :out   System.out : 콘솔에 값을 출력하겠다
		 *  
		 */
		
		
		
	}
}
