import java.util.*;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("�⵵ : ");
		int y = in.nextInt();
		System.out.println("�� : ");
		int m = in.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(y,m-1,1);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //�̴��� ���������� ǥ��
		
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		for(int i = 1 ; i<week; ++i) {
			System.out.print("\t");
		} //ù���� ���ö����� ������ ä���� ù���� ���� ã�°�
		
		for(int i=1 ;i<=lastDay;++i) {
			System.out.print(i+"\t");
			week++;
			if(week>7) {
				week = 1;
				System.out.println();
			}
		}
		
		
		
		
	}

}
