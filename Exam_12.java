import java.util.*;
public class Exam_12 {
	public static void main(String[] args) {
		
		for(int i = 1 ; i<= 10 ; ++i)
		{
			if (i % 3 == 0)
				continue;
			if (i == 7)
			{
				break;
			}
			System.out.println("i =" + i);	
		}
		
		
	}

}
