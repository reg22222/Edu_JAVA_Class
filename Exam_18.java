import java.util.Scanner;
public class Exam_18 {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		
		int co=0;
		
		int[] arr = new int[6];
		int[] arrr = new int[6];
		
		for(int i = 0; i < arr.length;++i)
		{
			arr[i] = (int)(Math.random()*10)+1;
		}
		
		for(int i = 0 ; i < arr.length ; ++i)
		{
			System.out.println(i+1+"��° �ζ� ��ȣ �Է� : ");
			int n = in.nextInt();
		}
		for(int i = 0 ; i < arr.length ; ++i)
		{
			if(arr[i] == arrr[i])
			{
				++co;
			}
			System.out.print(arr[i]);
			System.out.print(arrr[i]);
		}
		
		System.out.println("���� ������ "+co+"�� �Դϴ�.");
	}

}
