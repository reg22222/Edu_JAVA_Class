import java.util.*;
class Mex extends Exception{
	
	/**
	 * ���������� 0~100���̰� �ƴҶ��� ����ó��
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public Mex(String msg) {
		super(msg);
	}
	
	@Override
	public String getMessage() {
		
		message = super.getMessage() + "������ 0������ 100�� ���̰��� �־�� �մϴ�.";
		return message;
	}
	
	
	
}
public class Exam_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		
			try {
				
				System.out.println("�������� �Է� : ");
				int n = in.nextInt();
				if(n < 0 || n > 100) {
					throw new Mex("����");
				}
				System.out.println("�Է��Ͻ� ���� ���� : "+n);
			}catch(Mex e) {
				System.err.println(e.getMessage());
			}catch(Exception e) {
				e.printStackTrace();
				//���ܹ߻��� ���ܹ߻��� �������� ���� ��� �޼ҵ带 ��ȯ���ش�
			}
		
		
		
	
	}

}
