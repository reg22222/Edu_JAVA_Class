interface A11{
	public static final int A = 1;
	public static int B = 2;
	public final int C = 3;
	public int D = 4; // static final이 생략됨
	int E = 5; //static final이 생략됨
	//private int F = 6; //public, static & final자리인데 private가 와서 에러 뜸
	//인터페이스의 멤버필드는 무조건 상수(final)
	public abstract void disp();
	public void disp2(); //{System.out.println("aaa");}인터페이스 안에 있는 메소드는 추상메소드만 쓸수있음
	void disp3();
	//private void disp4(); 에러남
	//추상클래스의 모임이라 생성자가 없음
	class Inner11{} //추상중첩클래스 : 독립적으로 쓸수있음
}
public class Exam_11 {
	public static void main(String[] args) {
		System.out.println("A11.A = " + A11.A);
		//A11.A = 100;  //final멤버라 수정 못함
		//A11.B = 100;
		System.out.println("A11.C = "+A11.C);
		
		A11.Inner11 ai = new A11.Inner11();
	}
}
