//��������� ����
class MyException extends Exception{			//ExceptionŬ������ ��ӹ޾ƾ��� ����Ŭ������ ��
	private String message;
	
	public MyException(String msg) {
		super(msg);
	}

	@Override			//������̼� : �� �޼ҵ�� �������̵� �� �޼ҵ��� �˷��ִ� ������
	public String getMessage() {	//����Ŭ������ public String getMessage()�� �� �������̵� �ް� �Ǿ�����
		message = super.getMessage() + " :  ���� ���� ����Ŭ����!!";
		return message;
	}
}
public class Exam_08 {
	public static void main(String[] args) {
		
		try {
			throw new MyException("�����ڵ�");		//������ ���ܸ� �߻���Ű�°� (MyException�� ����Ŭ����������)
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		/*
		 * ����Ŭ���� �����
		 * 1. Exception Ŭ������ ��ӹ޴´�
		 * 2. public String getMessage() �޼ҵ带 �������̵� �Ѵ�
		 */
	}

}
