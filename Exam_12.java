import java.util.*;
public class Exam_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name[] = new String[7];
		
		for(int i=0 ; i<7; ++i)
		{
			System.out.println(i+1+"¹øÂ° ¸â¹ö : ");
			name[i] = in.next();
		}
		
		for(int i=0; i<7; ++i)
		{
			System.out.println(name[i]);
		}
			
	}

}
