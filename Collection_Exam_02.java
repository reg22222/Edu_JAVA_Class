import java.util.*;

class Input{
	Scanner in = new Scanner(System.in);
	HashSet set = new HashSet();
	
	public void disp() {
		System.out.println("이름 입력 : ");
		String name = in.next();
		set.add(name);
		System.out.println(name+"님의 전화번호 입력 : ");
		int pnum = in.nextInt();
		
		System.out.println(name+"님의 주소 입력 : ");
		String adress = in.next();
		
		
	}

	
	
}


public class Collection_Exam_02 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		Scanner in = new Scanner(System.in);
		
		System.out.println("1.입력 2.출력 3.수정 4.삭제 5.종료");
		int select = in.nextInt();

		switch(select) {
		case 1: 
		case 2:
		case 3:
		case 4:
		case 5:
		default:
		}
		
		
	}

}
