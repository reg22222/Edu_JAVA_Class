class Outer01{
	//멤버필드
	private int a;
	private static int b;
	
	//static 멤버 초기화
	static {
		b = 20;
	}
	
	//생성자
	public Outer01() {
		a = 10;
	}
	
	//멤버메소드
	public void disp() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		//System.out.println("c = "+c);
		//밖에 있는 클래스에서는 내부 클래스의 멤버에 접근하지 못한다.
	}
	
	//중첩클래스, Inner클래스(내부클래스)
	class Inner01{
		private int c;
		
		public Inner01() {
			c = 30;
		}
		public void disp_in() {
			//내부클래스에서는 밖의 클래스 멤버에 마음껏 접근 가능
			System.out.println("a = "+a);
			System.out.println("b = "+b);
			System.out.println("c = "+c);
		}
		class Inner01_Inner{
			
		}
	}
}


public class Exam_01 {
	public static void main(String[] args) {
		Outer01 ot = new Outer01();
		
		//Outer01.Inner01 oi = new Outer01.Inner01(); // 오류뜸 => 생성자에 의해 객체 선언되야됨
		Outer01.Inner01 oi = ot.new Inner01(); //일반중첩클래스 객체만들기
		
		oi.disp_in();
		
		/*
		 * 중첩클래스
		 * -일반중첩클래스		:클래스안에 클래스를 만들어 사용		=> Outer01$Inner01
		 * 					객체 생성 후 메모리에 올라가므로, 바깥클래스가 객체를 만들어야 사용 가능
		 * -static 중첩클래스	:클래스안에 static클래스를 만들어 사용	=>Outer02$Inner02
		 *					메모리에 미리 올라가기 때문에, 독립적으로 사용이 가능
		 * -지역 중첩클래스		:메소드안에 클래스를 만들어 사용		=>Outer03$1Inner03
		 * 					메소드 안에서만 사용 가능
		 * -익명 중첩클래스		:객체를 생성시에 메소드를 오버라이드(재 정의)해서 사용할때 새로운 클래스를 만들게 되는데 그
		 * 					클래스는 이름이 없다. 이때 생긴 클래스를 익명중첩클래스라고 한다.		=>Exam_04$1
		 * 
		 * 
		 * 클래스멤버
		 * -멤버필드
		 * -생성자
		 * -멤버메소드
		 * -중첩클래스
		 * 
		 * 
		 */
		
		
		
	}

}
