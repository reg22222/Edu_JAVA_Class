import java.util.Scanner;
public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/*
		for(int i = 2 ; i<=9 ; ++i)
		{
			for(int j = 1 ; j<=9; ++j)
			{
				System.out.printf("%2d X %2d = %2d",i,j,i*j);
				//%2d는 출력2칸+오른쪽정렬
				//%-2d는 출력2칸+왼쪽정렬
			}
			System.out.println("\n");
		}*/
		for(int i = 1 ; i<=9 ; ++i)
		{
			for(int j = 2 ; j<=9; ++j)
			{
				System.out.printf("%2d X%2d=%2d",j,i,i*j);
			}
			System.out.println("\n");
		
		
	}

}
}
