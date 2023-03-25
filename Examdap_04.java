import java.util.*;

class SungJuk{
	
	String name;
	int kor;
	int eng;
	int tot;
	int rank;
	
	SungJuk(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = kor + eng;
		
		
	}
	
	void disp() {
		System.out.println(name + "���� ������" + tot + "\t������ "+rank+"�� �Դϴ�.");
	}
}


public class Examdap_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�л����� �Է� : ");
		int inwon = in.nextInt();
		SungJuk[] sj = new SungJuk[inwon];
		
		for(int i = 0 ; i < inwon; ++i) {
			System.out.println("�̸��� �Է� : ");
			String name = in.next();
			System.out.println("���������� �Է� : ");
			int kor = in.nextInt();
			System.out.println("���������� �Է� : ");
			int eng = in.nextInt();
			sj[i] = new SungJuk(name, kor, eng);
		}
		
		for(int i=0 ; i<inwon ; ++i) {
			sj[i].rank = 1;
			for(int  j = 0 ; j <inwon ; ++j) {
				if(sj[i].tot < sj[j].tot )
					sj[i].rank++;
			}
		}
		
		for(int i = 0 ; i <inwon; ++i) {
			sj[i].disp();
		}
		
		
	}

}
