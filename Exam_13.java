import java.util.*;
public class Exam_13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int jsum = 0;
		int hsum = 0;
		for (int i = 1 ; i <= 100 ; ++i)
		{
			if (i % 2 == 0)
			{
				jsum += i;
			}
			else if(i % 2 != 0)
			{
				hsum +=i;
			}
		}
		System.out.printf("È¦¼öÀÇ ÇÕ : %d\nÂ¦¼öÀÇ ÇÕ : %d",hsum,jsum);
	}

}
