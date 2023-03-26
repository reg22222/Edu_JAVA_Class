import java.util.*;
class Protoss{
	public void attack() {
		System.out.println("공격하는 기능을 구현!!");
	}
	public void move() {
		System.out.println("이동하는 기능을 구현!!");
	}
	
}
class Zealot extends Protoss{
	public void attack() {
		System.out.println("질럿이 공격을 합니다!!");
	}
	public void move() {
		System.out.println("질럿이 이동을 합니다!!");
	}
}
class Dragon extends Protoss{
	public void attack() {
		System.out.println("드라곤이 공격을 합니다!!");
	}
	public void move() {
		System.out.println("드라곤이 이동을 합니다!!");
	}
}
public class Exam_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Protoss pro;
		
		System.out.println("1.질럿 2.드라곤 : ");
		int select1 = in.nextInt();
		System.out.println("1.공격 2.이동 :");
		int select2 = in.nextInt();
		
		if(select1 == 1) {
			pro = new Zealot(); //질럿을 업캐스팅
		}
		else {
			pro = new Dragon(); //드래곤을 업캐스팅
		}
		if(select2 == 1) {
			pro.attack();
		}else {
			pro.move();
		}
	}

}
