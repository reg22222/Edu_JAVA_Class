import java.util.*;


public class Exam_15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n[] = new int[5];
		int sum = 0;
		
		for(int i = 0 ; i < n.length ; ++i)
		{
			System.out.println(i+1+"¹øÂ° ¼ö :");
			n[i] = in.nextInt();
			sum += n[i];
			
		}
		
		for(int i = 0; i< n.length-1 ;++i)
		{
			System.out.print(n[i] + " + ");
		}
		System.out.println(n[4]+" = " + sum);
		
	}

}
