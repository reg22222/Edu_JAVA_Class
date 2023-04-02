class MyThread05 extends Thread{
	public void run() {
		System.out.println("MyThread05 Ŭ������ ���� �� �Դϴ�.");
	}
}

class MyThread06 implements Runnable{
	public void run() {
		System.out.println("MyThread06Ŭ������ ���� �� �Դϴ�.");
	}
}

public class Exam_10 {
	public static void main(String[] args) {
		
		System.out.println("main Ŭ���� ������....");
		MyThread06 mth = new MyThread06();
		Thread th = new Thread(mth);
		//Runnable�� ��ӹ��� Ŭ������  start�޼ҵ尡 ����.
		//�̶�, ThreadŬ���� ��ü�� ���鶧 RunnableŸ���� ��ü�� �޾� Thread��ü�� ���� �� �ִ�.
		//�׷��� ���ο� ThreadŬ������ �����ϰ�, �� ���ο� ThreadŬ������ start�޼ҵ带 �����Ű��
		//Runnable�� ��ӹ޾� ���� Ŭ������ run�޼ҵ带 ���ο� Thread�������� �����Ų��.
		th.start();
		
		/*
		MyThread05 th = new MyThread05();
		//th.run();     //���Ͻ�����
		th.start();		//��Ƽ������� ó���϶�� ���
		// th.start : �� ��ü(Thread�� ��ӹ���)�� ���ο� ������ �������� run�޼ҵ带 ������� �ּ���
		*/
	
		System.out.println("main Ŭ���� ����.....");
		
		/**
		 * ��Ƽ������
		 *  - �ϳ��� ���α׷� �ȿ��� �������� ���α׷��� ���ÿ� �����ϵ��� �ϴ� ��
		 *  
		 *  - Thread(Ŭ����), Runnable(�������̽�) Ŭ������ ���
		 *  - run�޼ҵ带 �������̵�
		 *  - start�޼ҵ带 ����
		 *  
		 *  -Runnable �������̽��� ���
		 *  -run�޼ҵ带 �������̵�
		 *  -ThreadŬ���� ��ü�� �����ϴµ� �׶� �Ű������� �־��ش�
		 *  -���θ��� threadŬ������ start�� ���ָ� �ȴ�
		 */
		
	}

}
