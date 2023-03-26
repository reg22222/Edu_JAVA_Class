class A07{
	int a;
	int b;
	public A07(int t) {
		a = 10;
		b = 20;
	}
	public void disp() { //부모가 public이니까 자식도 public보다 크거나 같아야함 (21번라인)
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
class B07 extends A07{
	int c;
	int b;
	public B07() {
		super(10);//첫줄에서만 호출 가능 
		c = 30;
		b = 100;
	}
	public void disp() { //부모가 public이라 자식도 public보다 크거나 같아야함
		System.out.println("a = "+a);
		System.out.println("b = "+b); //super.b는 상위 클래스의 멤버필드 값을 가져옴
		System.out.println("c = "+c);
	}
}

public class Exam_07 {
	public static void main(String[] args) {
		B07 ap = new B07();
		ap.disp();
	}

}
