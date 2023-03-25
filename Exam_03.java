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
			System.out.println(i+1+"��° ���� �Է� :");
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
		
		System.out.println("��ǻ�� �� :");
		
		for(int i  = 0 ; i < 5 ; ++i)
		{
			System.out.println(Com[i] + " , ");
		}
		System.out.println(Com[5]);
		
		
		
	}
	void dispselect() {
		
		System.out.println("��ǻ�� �� :");
		
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
			System.out.println("1.�����Է� 2.�ڵ��Է� 3.��ǻ�ͼ� �缳�� 4.���� : ");
			int select = in.nextInt();
			switch(select) {
			case 1: 
				lotto.setSelect();
				System.out.println("���᰹�� : "+lotto.getCount() + "���Դϴ�.");
			case 2:
				lotto.setAutoselect();
				lotto.dispselect();
			case 3:
			case 4:

				lotto.dispCom();
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			default:
		
		}
		}
		
		
		
	}

}
