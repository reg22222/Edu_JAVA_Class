import java.util.*;
public class Exam_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("방의 갯수를 입력 : ");
		int room = in.nextInt();
		
		System.out.println("1.입실 2.퇴실 3.보기 4.종료 : ");
		int n = in.nextInt();
		
		String roomarr[] = new String[room];
		String tsilarr[] = new String[room];
		
		switch(n) {
		case 1: ipsil(room);
		case 2:
		case 3:
		case 4:
		default:
		}
	}
	public static int ipsil(int su1) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("입실하실 방의 번호 : ");
		int roomnum = in.nextInt();
		if(roomnum > su1)
		{
			System.out.println("1호실부터"+su1+"호실까지만 입력 가능합니다.");
			continue;
		}
		//else if(roomarr[roomnum-1] == "사용중")
		{
			System.out.println("이미 입실되어있는 호실입니다.");
			continue;
		}
		//roomarr[roomnum-1] = "사용중";
		System.out.println(roomnum+"호실에 입실하셨습니다.");
	}
	
	//만들다 포기요 시간없음;;

}
