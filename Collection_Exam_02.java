import java.util.*;

class Input{
	Scanner in = new Scanner(System.in);
	HashSet set = new HashSet();
	
	public void disp() {
		System.out.println("�̸� �Է� : ");
		String name = in.next();
		set.add(name);
		System.out.println(name+"���� ��ȭ��ȣ �Է� : ");
		int pnum = in.nextInt();
		
		System.out.println(name+"���� �ּ� �Է� : ");
		String adress = in.next();
		
		
	}

	
	
}


public class Collection_Exam_02 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		Scanner in = new Scanner(System.in);
		
		System.out.println("1.�Է� 2.��� 3.���� 4.���� 5.����");
		int select = in.nextInt();

		switch(select) {
		case 1: 
		case 2:
		case 3:
		case 4:
		case 5:
		default:
		}
		
		
	}

}
