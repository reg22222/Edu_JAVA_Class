import java.util.*;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("년도 : ");
		int y = in.nextInt();
		System.out.println("월 : ");
		int m = in.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(y,m-1,1);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //이달의 마지막날을 표시
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i = 1 ; i<week; ++i) {
			System.out.print("\t");
		} //첫날이 나올때까지 공백을 채워서 첫날의 요일 찾는거
		
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
