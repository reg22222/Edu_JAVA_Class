
public class Exam_07 {
	public static void main(String[] args) {
		/*
		int i = 1;
		int sum = 0;
		while(i<=10)
		{
			sum += i;
			++i;
			
		}
		
		System.out.println("1부터 10까지의 합 : "+sum);*/
		
		int i = 1;
		int sum = 0;
		while(true)
		{
			sum += i;
			if(sum>100) break;
			++i;
		}
		System.out.println("1부터 합을 구해 100이 넘는 순간은"+i+"입니다.");
	}

}
