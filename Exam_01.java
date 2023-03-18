import java.util.*;
public class Exam_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/*
		int k;
		int co = 0;
		for(int i=1 ; i <= 5 ; ++i)
		{
			for(k=1; k<= 3; ++k)
				++co;
				System.out.printf("i=%d, k=%d, co=%d\n",i , k ,co);
		}
		
		System.out.println("co = "+ co);*/
		
		for(int i = 2 ; i<=9 ; ++i)
		{
			for(int j = 1 ; j<=9; ++j)
			{
				System.out.printf("%d X %d = %d\n",i,j,i*j);
			}
			System.out.println("\n");
		}
			
		
	}

}
