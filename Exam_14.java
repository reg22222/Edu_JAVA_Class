import java.util.*;
public class Exam_14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�ο����� �Է� : ");
		int n = in.nextInt();
		String narr[] = new String[n];
		String jarr[] = new String[n];
		
		for(int i = 0 ; i < n ; ++i)
		{
			
			System.out.println(i+1+"��° �̸� : ");
			narr[i] = in.next();
			System.out.println(i+1+"��° ��ȭ��ȣ : ");
			jarr[i] = in.next();
			
		}
		for(int j = 0 ;j<n ; ++j)
		{
			System.out.printf("%s���� ��ȭ��ȣ : %s\n",narr[j],jarr[j]);
		
		}
		
		
		
		
		
	}

}
