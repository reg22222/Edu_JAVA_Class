import java.util.*;

public class Exam_03 {
	public static void main(String[] args) {
		
		String data = "ȫ�浿@123-1234@���ﰭ����";
		
		/*
		Scanner in = new Scanner(data).useDelimiter("\\s*@\\s*"); // s* : 0���̻�
		// \\s*@\\s*  : @�� �߽����� �տ� ����, �ڿ� ������ �������̴�.
		System.out.println("�̸� : "+in.next());
		System.out.println("��ȭ��ȣ : "+in.next());
		System.out.println("�ּ� : "+in.next());
		/*
		String[] member = data.split("@");
		for(int i = 0 ; i<engtmember.lh; ++i) {
			System.out.println(member[i]);
		}
		
		/*������ �� ������� �ʴ� ����Ŭ���� (������ ������ ������ �Ⱦ��� �˾Ƹ� ����)
		StringTokenizer st = new StringTokenizer(data);
		//ù��° �Ű������� data�� �ְ�, �ι�° �Ű������� �����ڸ� �ִ´�.
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		
		/*
		String str = "Hello, java!!";
		String str2 = "             Hello, Java!!           ";
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str2.trim().equals(str)); //�޼ҵ� ü��(������ ���̾���)(trim:�������� �� equals:��)
		//str2�� �յ��� �������� ������ ����� str�� ���Ѵ�
		
		/*
		System.out.println(str.toUpperCase()); //���� �빮�ڷ� �ٲ���
		System.out.println(str.toLowerCase()); //���� �ҹ��ڷ� �ٲ���
		/*
		System.out.println("str.substring(7) = "+ str.substring(7));
		// �Ű������� �ϳ��϶� => �ش��������� ������
		System.out.println("str.substring(7,11) = "+str.substring(7,11));
		//�Ű������� �ΰ��϶� => ó����ġ���� �ι�° �Ǳ� ������
		/*
		
		System.out.println("Hello�� �����մϱ�?"+ str.startsWith("Hello")); //
		System.out.println("Java�� ���� ���ϱ�?"+ str.endsWith("Java")); // �̸���(gmail,naver���)�� �����Ҷ� ���� ����
		byte[] by = str.getBytes();
		for(int i=0; i<by.length; ++i); // ���ڿ��� byte�迭�� �ٲٱ�
		{
			System.out.println(by[i]); //��Ʈ��ũ ������  UDP�� BYTE�������ιۿ� �������� �̷��� �ٲٴ°�
		}
		
		
		String str2 = new String(by); // byte�迭�� ���ڿ��� �ٲٱ�
		System.out.println(str2);
			
		/*

		for(int i = 0 ; i<str.length(); ++i)
		{
			System.out.println(str.charAt(i)); //charAt : �ش�Ǵ� �ε��� ���� �����ͼ� char������ �ٲٴ°�
		}
		
		/*
		String a = "aaa";
		String b = "aaa";
		String c = new String("aaa");
		String d = new String("aaa");
		
		System.out.println(a.equals(b)); // equals : a�� b�� ���� ����°�
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(c.equals(d));
		
		/*
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(c==d);
		*/
	}

}
