import java.util.*;
public class Exam_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� ������ �Է� : ");
		int room = in.nextInt();
		
		System.out.println("1.�Խ� 2.��� 3.���� 4.���� : ");
		int n = in.nextInt();
		
		String roomarr[] = new String[room];
		String tsilarr[] = new String[room];
		
		switch(n) {
		case 1: ipsil(room);
		case 2:
		case 3:
		case 4:
		default:
		}
	}
	public static int ipsil(int su1) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("�Խ��Ͻ� ���� ��ȣ : ");
		int roomnum = in.nextInt();
		if(roomnum > su1)
		{
			System.out.println("1ȣ�Ǻ���"+su1+"ȣ�Ǳ����� �Է� �����մϴ�.");
			continue;
		}
		//else if(roomarr[roomnum-1] == "�����")
		{
			System.out.println("�̹� �ԽǵǾ��ִ� ȣ���Դϴ�.");
			continue;
		}
		//roomarr[roomnum-1] = "�����";
		System.out.println(roomnum+"ȣ�ǿ� �Խ��ϼ̽��ϴ�.");
	}
	
	//����� ����� �ð�����;;

}
