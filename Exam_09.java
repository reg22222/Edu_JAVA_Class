class A08{
	private final int a; // private final int a = 0;
	private static int b;
	static {
		//��ü������ ������� ���α׷������� �ѹ� ����Ǵ� ����
		System.out.println("static���� ���!!");
	}
	{
		//��ü������ �����ں��� ���� �ҷ����� ����Ǵ� ����
		System.out.println("�Ϲݱ��� ���!!");
	}
	public A08() {
		a = 10;
		System.out.println("default������ ���!!");
	}
	public A08(int a, int b){
		this.a = a;
		System.out.println("A08(int a, int b)������ ���!!");
		
	}
}

public class Exam_09 {
	public static void main(String[] args) {
		A08 ap = new A08();
		A08 bp = new A08(10,20);
		
	}

}
