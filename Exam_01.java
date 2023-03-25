class A01{
	//멤버필드
	int a;
	int b;
	
	int c,d,e,f,g;
	//JVM이 A01(){}(디폴트 생성자)를 만듦
	//생성자
	A01(){
		a = 10;
		b = 20;
		c = 30;
		d = 40;
		e = 50;
		f = 60;
		g = 70;
	}
	A01(int a){
		this(); //A01()생성자를 호출, 반드시 생성자 첫째줄에 나타나야 한다
		this.a = a; //this : 클래스내의 멤버(대부분 필드)를 지칭할때 쓰는 예약어
	}
	
	A01(int a, int b){
		this(a);
		//this.a = a; 
		this.b = b;
	}
	
	//멤버메소드
	void disp() {
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		//클래스 멤버에 매개변수간에 출돌이 나지 않는다면 this를 생략해서 사용할 수 있다.
		
	}
}


public class Exam_01 {
	public static void main(String[] args) {
		int a = 10; //자료형 변수명;
		int[] arr = new int[3]; //자료형 배열명[] = new 자료형[개수];
		A01 ap = new A01(10,20); //자료형(사용자가 정의한 자료형) 객체명(변수명X) = new 생성자 호출;
		
		/*
		 * 생성자
		 * -클래스 이름과 동일한 메소드
		 * -반환형이 없다(void조차 없다)
		 * -멤버필드의 초기값을 주기 위해 만든다
		 * -생성자를 구현하지 않으면 JVM이 default생성자를 만들어 낸다
		 * -생성자가 하나라도 구현이 되었으면 default생성자 안만든다
		 * -생성자로 메소드의 일부라서 오버로딩이 가능하다
		 * -객체생성시 딱 한번 호출되는 메소드. 따라서, 직접 호출하지 못한다. 
		 */
		
		// . : 참조연산자, 객체멤버에 접근하려는 연산자
		ap.disp(); //메소드 호출
		
		ap.a = 100;
		ap.b = 200;
		//ap.A01(100);      생성자 직접 호출 불가
		ap.disp();
	}
}
