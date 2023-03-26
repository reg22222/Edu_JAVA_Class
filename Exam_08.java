import java.util.*;
class SungJuk{
	public String name;
	public int kor;
	public int eng;
	public int math;
	protected int tot;
	public int rank;
	
	SungJuk(String name,int kor,int eng,int math,int tot){
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = kor+eng+math;
		
	}
	public void disp() {
		System.out.println(name+"님의 국어 영어 수학 점수는 "+kor + eng + math +"이고, 총점은 : "+tot+" 이며, 등수는 "+rank+"등입니다.");
	}
	
}
class SungJuk2 extends SungJuk{
	private int math;
	public SungJuk2(String name, int kor, int eng, int math) {
		super(name,kor,eng)
		this.math = math;
		
	}
	
	
	
}
public class Exam_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		SungJuk sj = new SungJuk();
		
		System.out.println("이름 입력 :");
		String name = in.next();
		System.out.println("국어점수 입력 :");
		int kor = in.nextInt();
		System.out.println("영어점수 입력 :");
		int eng = in.nextInt();
		System.out.println("수학점수 입력 : ");
		int math = in.nextInt();
		
		sj.disp(name, kor, eng, math);
		
		
	}

}
