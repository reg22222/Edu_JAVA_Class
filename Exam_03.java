import java.util.*;

class Lotto{
	
	int Com[];
	int select[];
	
	Lotto(){
		
		Com = new int[6];
		select = new int[6];
		
}
	
	void setCom() {
		
		for( int i = 0; i < 6 ; ++i)
		{
			Com[i] = (int)(Math.random()*45)+1;
			for(int j = 0; j < i ; ++j) {
				if(Com[i] == Com[j]) {
					i--;
					break;
				}
			}
		}
		
		
		
}
	void setAutoselect() {
	Scanner in = new Scanner(System.in);
		
	for( int i = 0; i < 6 ; ++i)
	{
		do {
			System.out.println(i+1+"번째 수를 입력 :");
			select[i] = in.nextInt();
		}while(select[i]<1 || select[i]>45);
		for(int j = 0; j < i ; ++j) {
			if(select[i] == select[j]) {
				i--;
				break;
				}
			}
		}
		
		
		
}
	void getCount() {
		int count = 0;
		for(int i = 0 ; i<6 ; ++i)
		{
			for(int j = 0 ; j < 6 ; ++j) {
				if(Com[i] == select[j] ){
					count++;
					break;
				}
			}
		}
		return count;	
}
	void dispCom() {
		
		System.out.println("컴퓨터 수 :");
		
		for(int i  = 0 ; i < 5 ; ++i)
		{
			System.out.println(Com[i] + " , ");
		}
		System.out.println(Com[5]);
		
		
		
	}
	void dispselect() {
		
		System.out.println("컴퓨터 수 :");
		
		for(int i  = 0 ; i < 5 ; ++i)
		{
			System.out.println(select[i] + " , ");
		}
		System.out.println(select[5]);
		
		
		
	}
	
}

public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Lotto lotto = new Lotto();
		
		while(true)
		{
			System.out.println("1.직접입력 2.자동입력 3.컴퓨터수 재설정 4.종료 : ");
			int select = in.nextInt();
			switch(select) {
			case 1: 
				lotto.setSelect();
				System.out.println("맞춘갯수 : "+lotto.getCount() + "개입니다.");
			case 2:
				lotto.setAutoselect();
				lotto.dispselect();
			case 3:
			case 4:

				lotto.dispCom();
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
		
		}
		}
		
		
		
	}

}
