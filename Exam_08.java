import java.util.*;
public class Exam_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("������ �Է� : ");
		String name = in.next();
		
		switch(name) {
		case "¥���": System.out.println("¥����� ��Ű�̽��ϴ�. "); break;
		case "«��": System.out.println("«���� ��Ű�̽��ϴ�. "); break;
		case "�쵿": System.out.println("�쵿�� ��Ű�̽��ϴ�. "); break;
		case "������": System.out.println("�������� ��Ű�̽��ϴ�. "); break;
		default: System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		/*
		System.out.println("1¥��� 2«�� 3�쵿 4������ : ");
		int select = in.nextInt();
		
		switch(select) {
		case 1:		System.out.println("¥����� ��Ű�̽��ϴ�. "); break;
		case 2:		System.out.println("«���� ��Ű�̽��ϴ�. "); break;
		case 3:		System.out.println("�쵿�� ��Ű�̽��ϴ�. "); break;
		case 4:		System.out.println("�������� ��Ű�̽��ϴ�. "); break;
		default :	System.out.println("�߸��Է��ϼ̽��ϴ�.");*/
		
		}
	}


