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
		System.out.println(name+"���� ���� ���� ���� ������ "+kor + eng + math +"�̰�, ������ : "+tot+" �̸�, ����� "+rank+"���Դϴ�.");
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
		
		System.out.println("�̸� �Է� :");
		String name = in.next();
		System.out.println("�������� �Է� :");
		int kor = in.nextInt();
		System.out.println("�������� �Է� :");
		int eng = in.nextInt();
		System.out.println("�������� �Է� : ");
		int math = in.nextInt();
		
		sj.disp(name, kor, eng, math);
		
		
	}

}
