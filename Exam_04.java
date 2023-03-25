import java.util.*;

class Inwon{
	Scanner in = new Scanner(System.in);
	String name;
	int kor;
	int eng;
	int hap;
	int rank;
	
	Inwon(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		
	}
	
	void disp() {
		System.out.println(name + "님의 총점 :" + hap + "순위는 : "+rank+"등 입니다.");
	}
	
}


public class Exam_04 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		
		System.out.println("인원수 입력 :");
		int inwonsu = in.nextInt();
		String name[] = new String[inwonsu];
		int kor[] = new int[inwonsu];
		int eng[] = new int[inwonsu];
		
		Inwon[] iw = new Inwon[inwonsu];
		
		for(int i = 0 ; i < 3 ; ++i)
		{
			System.out.println("이름을 입력 : ");
			name[i] = in.next();
			System.out.println(name[i] + "님의 국어점수 입력 : ");
			kor[i] = in.nextInt();
			System.out.println(name[i] + "님의 영어점수 입력 : ");
			eng[i] = in.nextInt();
			iw[i] = new Inwon(name,kor,eng);
		}

		
		for(int i = 0 ; i < inwonsu; ++i) {
			iw[i].disp();
		}
		
		
	}

}
