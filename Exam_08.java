//사용자정의 예외
class MyException extends Exception{			//Exception클래스를 상속받아야지 예외클래스가 됨
	private String message;
	
	public MyException(String msg) {
		super(msg);
	}

	@Override			//어노테이션 : 이 메소드는 오버라이드 한 메소드라고 알려주는 길잡이
	public String getMessage() {	//예외클래스는 public String getMessage()를 꼭 오버라이드 받게 되어있음
		message = super.getMessage() + " :  내가 만든 예외클래스!!";
		return message;
	}
}
public class Exam_08 {
	public static void main(String[] args) {
		
		try {
			throw new MyException("예외코드");		//강제로 에외를 발생시키는것 (MyException는 예외클래스여야함)
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		/*
		 * 예외클래스 만들기
		 * 1. Exception 클래스를 상속받는다
		 * 2. public String getMessage() 메소드를 오버라이드 한다
		 */
	}

}
