
public class Exam_07 {
	public static void main(String[] args) {
		/*
		int i = 1;
		int sum = 0;
		while(i<=10)
		{
			sum += i;
			++i;
			
		}
		
		System.out.println("1���� 10������ �� : "+sum);*/
		
		int i = 1;
		int sum = 0;
		while(true)
		{
			sum += i;
			if(sum>100) break;
			++i;
		}
		System.out.println("1���� ���� ���� 100�� �Ѵ� ������"+i+"�Դϴ�.");
	}

}
