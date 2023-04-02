import java.util.*;
import java.text.*;
class MyThread extends Thread{
	
	private Date date;
	private SimpleDateFormat sdf;
	
	public MyThread() {
		sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
	}
	
	
	public void run() {
		//System.out.println("정보 :  "+MyThread.currentThread());
		while(true) {
			date = new Date();
			System.out.println("현재시각 : "+ sdf.format(date));
			try {
				Thread.sleep(1000); //밀리세컨드 단위로 숫자를 넣어준다
			}catch(InterruptedException e) {}
			
		}
		
	}
	
}
public class Exam_11 {
	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.setDaemon(true); 		//main이 끝나면 th객체는 끝난다. -> 대몬관계
		th.setName("홍길동");			//스레드의 이름
		th.setPriority(10); 		//priority  : 1~10 -> 1이 우선순위 제일 느림, 10이 제일 빠름, 5가 default
		th.start();
		try {
			Thread.sleep(5000);
			th.join(5000);	//th객체를 5초간 실행시켜주세요(연결시켜주겠다는것) 
		}catch(InterruptedException e) {}
		
		System.out.println(Thread.currentThread());		//currentThread() : 현재 상태를 보는 것
	}

}
