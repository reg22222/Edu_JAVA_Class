import java.util.*;
class Protoss{
	public void attack() {
		System.out.println("�����ϴ� ����� ����!!");
	}
	public void move() {
		System.out.println("�̵��ϴ� ����� ����!!");
	}
	
}
class Zealot extends Protoss{
	public void attack() {
		System.out.println("������ ������ �մϴ�!!");
	}
	public void move() {
		System.out.println("������ �̵��� �մϴ�!!");
	}
}
class Dragon extends Protoss{
	public void attack() {
		System.out.println("������ ������ �մϴ�!!");
	}
	public void move() {
		System.out.println("������ �̵��� �մϴ�!!");
	}
}
public class Exam_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Protoss pro;
		
		System.out.println("1.���� 2.���� : ");
		int select1 = in.nextInt();
		System.out.println("1.���� 2.�̵� :");
		int select2 = in.nextInt();
		
		if(select1 == 1) {
			pro = new Zealot(); //������ ��ĳ����
		}
		else {
			pro = new Dragon(); //�巡���� ��ĳ����
		}
		if(select2 == 1) {
			pro.attack();
		}else {
			pro.move();
		}
	}

}
