import java.util.*;
public class Exam_06 {
	public static void main(String[] args) {
		Hashtable map = new Hashtable();
		
		map.put("���缮","���׸�");
		map.put("������","�߱�����");
		map.put("�����","�౸����");
		map.put("������","����");
		
		
		
		if(map.containsKey("�����")) {
			System.out.println("������� ���� ����Դϴ�.");
		}
		
		/*
		
		Enumeration enu = map.keys();   	//Ű���� ��� ��������
		while(enu.hasMoreElements()) {		//hasNext() �� ������ ���
			Object obj = enu.nextElement();
			String key = (String)obj;
			Object obj2 = map.get(key);		//��ĳ����
			String value = (String)obj2;	//�ٿ�ĳ����
			System.out.println(key+"���� ���� : "+ value);
		}
		
		/*
		System.out.println("�������� ���� : "+ map.get("������")); //map.get(Ű��) : �� Ű�� �ش�Ǵ� ������� ����
		
		/*
		System.out.println("map�� ũ�� : " +map.size());
		map.remove("������");			//����
		System.out.println("map = "+map);
		
		/*
		System.out.println("map = "+map);
		map.put("������","���׸�");
		System.out.println("map = "+map);		//Ű���� ���� ������� �ٸ��� ������� ������ �ȴ�
		*/
	}
}
