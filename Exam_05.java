import java.util.Scanner;

class Member{
	String name;
	String tel;
	Member(String name, String tel){
		this.name = name;
		this.tel = tel;	
	}
	
	void disp() {
		System.out.println(name+"���� ��ȭ��ȣ�� " + tel +"���Դϴ�.");
	}
}


public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//3�� ȸ���� �̸��� ��ȭ��ȣ�� �Է¹޾� �����غ���
		//Ŭ���� �迭 �����
		//1. ��ü�� ������ ����
		Member[] mb = new Member[3];
		
		for(int i = 0 ; i < 3; ++i)
		{
			//2.�� ��ü�� �����ϱ�
			
			System.out.println("�̸��� �Է� : ");
			String name = in.next();
			System.out.println("��ȭ��ȣ�� �Է� : ");
			String tel = in.next();
			mb[i] = new Member(name, tel);
		}
		for(int i=0 ;i<3 ; ++i) {
			mb[i].disp();
		}
		
	}

}
