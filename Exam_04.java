import java.util.*;//Scanner 클래스를 알려주기 위해
public class Exam_04 {
	public static void main(String[] args) {
		
		//클래스에 에러가 나면 그 클래스가 뭔지 모른다는 것
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름을 입력 : ");
		String name = in.next(); // in.next : 문자열을 입력받는다
		System.out.println("임의의 수를 입력 : ");
		int su = in.nextInt(); // in.nextInt : 정수를 입력받는다
		
		System.out.println("입력하신 이름은" + name);
		
		
		
	}
}
