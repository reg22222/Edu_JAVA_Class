import java.util.*;
public class Collection_Exam_01 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("���缮");		// add() : ������ ����
		set.add("������");
		set.add("����ȿ");
		set.add("���ҹ�");
		set.add("����");
		set.add("������");
		set.add("�缼��");
		set.add("���缮"); // �ߺ��Ǹ� �׳� �ϳ��� ����(���)
		
		set.remove("�缼��");			//Ư�� ������ ����!!
		
		Iterator it = set.iterator();
		while(it.hasNext()) { 			//���� �����Ͱ� �����ϴ��� ���ϴ���
			Object obj = it.next();		// ��ĳ����
			String name = (String)obj;	// �ٿ�ĳ����
			System.out.println(name);
		}
		
		
		/*
		
		String[] name = new String[set.size()];  
		set.toArray(name);							//String �迭�� �ٲ㼭 ��
		for(int i=0; i<name.length; ++i) {
			System.out.println(name[i]);
		}
		
		/*
		String name = "���缮";
		
		if(set.contains(name)) {		// contains : �ش��ϴ� ��ü�� �����ϴ��� ã���ִ� 
			System.out.println(name+"�� ���׸� ���!!");
		}else {
			System.out.println(name+"�� ���׸� ����� �ƴմϴ�.");
		}
		
		/*
		//System.out.println(set);
		
		//System.out.println("set�� ũ�� : "+set.size());	// size() : ũ�⸦ ��Ÿ����
		
		set.clear();			//������ ��� ����(�����)
		//System.out.println("clear �� ��set�� ũ�� : "+set.size());
		
		if(set.isEmpty()) {		//�����Ͱ� ������, �ִ���
			System.out.println("������ ����");
		}
		else {
			System.out.println("������ �ִ�.");
		}
		*/
	}
}