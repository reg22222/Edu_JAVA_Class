class A07{
	int a;
	int b;
	public A07(int t) {
		a = 10;
		b = 20;
	}
	public void disp() { //�θ� public�̴ϱ� �ڽĵ� public���� ũ�ų� ���ƾ��� (21������)
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
class B07 extends A07{
	int c;
	int b;
	public B07() {
		super(10);//ù�ٿ����� ȣ�� ���� 
		c = 30;
		b = 100;
	}
	public void disp() { //�θ� public�̶� �ڽĵ� public���� ũ�ų� ���ƾ���
		System.out.println("a = "+a);
		System.out.println("b = "+b); //super.b�� ���� Ŭ������ ����ʵ� ���� ������
		System.out.println("c = "+c);
	}
}

public class Exam_07 {
	public static void main(String[] args) {
		B07 ap = new B07();
		ap.disp();
	}

}
