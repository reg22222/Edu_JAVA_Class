import java.util.*;
public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� ������ �Է� : ");
		int room = in.nextInt();
		
		String roomarr[] = new String[room];
		String tsilarr[] = new String[room];
		
		for(int i = 0 ; i < room ; ++i)
		{
			roomarr[i] = "���";
		}
		while(true)
		{
			System.out.println("1.�Խ� 2.��� 3.���� 4.���� : ");
			int n = in.nextInt();
			
			if(n == 1)
			{
				System.out.println("�Խ��Ͻ� ���� ��ȣ : ");
				int roomnum = in.nextInt();
				if(roomnum > room)
				{
					System.out.println("1ȣ�Ǻ���"+room+"ȣ�Ǳ����� �Է� �����մϴ�.");
					continue;
				}
				else if(roomarr[roomnum-1] == "�����")
				{
					System.out.println("�̹� �ԽǵǾ��ִ� ȣ���Դϴ�.");
					continue;
				}
				roomarr[roomnum-1] = "�����";
				System.out.println(roomnum+"ȣ�ǿ� �Խ��ϼ̽��ϴ�.");
			}
			else if(n == 2)
			{
				System.out.println("����Ͻ� ���� ��ȣ : ");
				int tsil = in.nextInt();
				if(tsil > room)
				{
					System.out.println("1ȣ�Ǻ���"+room+"ȣ�Ǳ����� �Է� �����մϴ�.");
					continue;
				}
				
				if(roomarr[tsil-1] == "���")
				{
					System.out.println(tsil + "ȣ���� ���� ����Դϴ�.");
				}
				
				if(roomarr[tsil-1] == "�����")
				{
					System.out.println(tsil+"ȣ�ǿ��� ����ϼ̽��ϴ�.");
					roomarr[tsil-1] = "���";
				}
			}
			else if(n == 3)
			{
				for(int i = 0; i < room; ++i)
				{
					System.out.println(i+1+"ȣ�� - "+roomarr[i]);
				}
			}
			else if(n == 4)
			{
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0); //���α׷� ������Ѷ�
			}
			else
			{
				System.out.println("�߸��Է��߽��ϴ�. �ٽ��Է����ּ���");
				continue;
			}
		}
	}

}
