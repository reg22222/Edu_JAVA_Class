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
		System.out.println(name + "님의 총점은" + tot + "\t순위는 "+rank+"등 입니다.");
	}
}


public class Examdap_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("학생수를 입력 : ");
		int inwon = in.nextInt();
		SungJuk[] sj = new SungJuk[inwon];
		
		for(int i = 0 ; i < inwon; ++i) {
			System.out.println("이름을 입력 : ");
			String name = in.next();
			System.out.println("국어점수를 입력 : ");
			int kor = in.nextInt();
			System.out.println("영어점수를 입력 : ");
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
