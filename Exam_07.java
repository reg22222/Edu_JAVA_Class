import java.util.*;
public class Exam_07 {
	public static void main(String[] args) {
		// JSP���� LIST�������� ���� ���� ��
		
		ArrayList list = new ArrayList();
		
		list.add("���缮");
		list.add("������");
		list.add("����");
		list.add("����ȿ");
		list.add("���ҹ�");
		list.add("�缼��");
		list.add("�缼��");
		list.add("���缮");
		
		
		
		
		/*
		
		list.remove(5)
		System.out.println(list); //������ ������� ����
		
		list.remove("���ҹ�");
		System.out.println(list);
		
		/*
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			String name = (String)obj;
			System.out.println(name);
		}
		
		/*

		String[] name = new String[list.size()];
		list.toArray(name);
		for(int i = 0; i<name.length; ++i) {
			System.out.println(name[i]);
		}
		
		/*
		
		System.out.println(list.indexOf("���缮"));		//���� �־ ��ġ�� ������� �˷��ִ� ��
		System.out.println(list.lastIndexOf("���缮"));	//���� �־ ��ġ�� ������� �˷��ִ� ��
		
		/*
		for(int i= 0 ; i<list.size(); ++i) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.get(1));
		
		/*
		System.out.println(list); // set�̶� ����� �����, �迭ó�� ���� ������� ��
		list.add(1,"������");
		System.out.println(list);
		
		*/
		
		
	}

}
