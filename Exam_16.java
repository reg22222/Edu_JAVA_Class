import java.util.*;
public class Exam_16 {
	public static void main(String[] args) {
		int arr[] = new int[6];
		
		for(int i = 0; i < arr.length ; ++i)
		{
			arr[i] = (int)Math.random()*45+1;
			for(int j = 0 ;j < i ; ++i)
			{
				if(arr[i] == arr[j])
				{
					
					--i;
					break;
				}
			}
			
		}
		for(int i = 0; i < arr.length-1; ++i)
			System.out.println(arr[i] + ',');
		
	}
	System.out.println(arr[arr.length-1]);

	}

}
