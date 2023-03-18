
public class Exam_05 {
	public static void main(String[] args) {
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 1234
		 * 123
		 * 12
		 * 1
		 */
		int co = 0;
		for(int j = 1; j <= 9 ; ++j)
		{
			if(j <= 5)
			{
				++co;
			}
			else
				--co;
			for(int i = 1 ; i <=co; i ++)
			{
				System.out.print(i);
			}
			System.out.println();
			
		}
		
		
	}
}
