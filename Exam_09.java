import java.util.*;
class Mex extends Exception{
	
	/**
	 * 국어점수가 0~100사이가 아닐때의 예외처리
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public Mex(String msg) {
		super(msg);
	}
	
	@Override
	public String getMessage() {
		
		message = super.getMessage() + "점수는 0점에서 100점 사이값만 넣어야 합니다.";
		return message;
	}
	
	
	
}
public class Exam_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		
			try {
				
				System.out.println("국어점수 입력 : ");
				int n = in.nextInt();
				if(n < 0 || n > 100) {
					throw new Mex("국어");
				}
				System.out.println("입력하신 국어 점수 : "+n);
			}catch(Mex e) {
				System.err.println(e.getMessage());
			}catch(Exception e) {
				e.printStackTrace();
				//예외발생시 예외발생된 시점까지 사용된 모든 메소드를 반환해준다
			}
		
		
		
	
	}

}
