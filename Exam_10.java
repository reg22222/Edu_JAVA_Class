//import java.lang.*; //JVM�� ���ϸ��� �ڵ����� ȣ���ϴ� ��Ű��
class A10{
	public final static double PI = 3.141592;
}
public class Exam_10 {
	public static void main(String[] args) { //JVM�� ���� �����Ű�°� main�̱⿡ static�� �����
		//Math.PI = 111;   //final�ʵ�� ����ģ��.
		
		
		//System.out.println("�������� 5�� ���� ���� : " + 5*5*A10.PI);
		System.out.println("�������� 5�� ���� ���� : " + 5*5*Math.PI);
		//static����� Ŭ���� �̸����� �����Ѵ�.
		//���������ڰ� public�̶� ��𼭵� ������ ������(import�� �Ǿ� ������)
		//������� : public static final �Ǵ� public final static
		
		//
	}
}
