interface A11{
	public static final int A = 1;
	public static int B = 2;
	public final int C = 3;
	public int D = 4; // static final�� ������
	int E = 5; //static final�� ������
	//private int F = 6; //public, static & final�ڸ��ε� private�� �ͼ� ���� ��
	//�������̽��� ����ʵ�� ������ ���(final)
	public abstract void disp();
	public void disp2(); //{System.out.println("aaa");}�������̽� �ȿ� �ִ� �޼ҵ�� �߻�޼ҵ常 ��������
	void disp3();
	//private void disp4(); ������
	//�߻�Ŭ������ �����̶� �����ڰ� ����
	class Inner11{} //�߻���øŬ���� : ���������� ��������
}
public class Exam_11 {
	public static void main(String[] args) {
		System.out.println("A11.A = " + A11.A);
		//A11.A = 100;  //final����� ���� ����
		//A11.B = 100;
		System.out.println("A11.C = "+A11.C);
		
		A11.Inner11 ai = new A11.Inner11();
	}
}
