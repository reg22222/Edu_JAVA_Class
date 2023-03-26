class Outer03{
	private int a;
	private static int b;
	static {
		b = 20;
	}
	public Outer03(){
		a = 10;
	}
	public void disp() {
		class Inner03{
			private int c;
			public Inner03() {
				
				c = 30;
			}
			public void disp_in() {
				System.out.println("a = "+a);
				System.out.println("b = "+b);
				System.out.println("c = "+c);
			}
		}
		Inner03 in = new Inner03();
		in.disp_in();
		//"지역"중첩클래스이기때문에 그 지역의 메소드 안에서 객체생성해야함
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		Outer03 ot = new Outer03();
		
		
	}

}
