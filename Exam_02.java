import java.util.*;
public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("방의 갯수를 입력 : ");
		int room = in.nextInt();
		
		String roomarr[] = new String[room];
		String tsilarr[] = new String[room];
		
		for(int i = 0 ; i < room ; ++i)
		{
			roomarr[i] = "빈방";
		}
		while(true)
		{
			System.out.println("1.입실 2.퇴실 3.보기 4.종료 : ");
			int n = in.nextInt();
			
			if(n == 1)
			{
				System.out.println("입실하실 방의 번호 : ");
				int roomnum = in.nextInt();
				if(roomnum > room)
				{
					System.out.println("1호실부터"+room+"호실까지만 입력 가능합니다.");
					continue;
				}
				else if(roomarr[roomnum-1] == "사용중")
				{
					System.out.println("이미 입실되어있는 호실입니다.");
					continue;
				}
				roomarr[roomnum-1] = "사용중";
				System.out.println(roomnum+"호실에 입실하셨습니다.");
			}
			else if(n == 2)
			{
				System.out.println("퇴실하실 방의 번호 : ");
				int tsil = in.nextInt();
				if(tsil > room)
				{
					System.out.println("1호실부터"+room+"호실까지만 입력 가능합니다.");
					continue;
				}
				
				if(roomarr[tsil-1] == "빈방")
				{
					System.out.println(tsil + "호실은 현재 빈방입니다.");
				}
				
				if(roomarr[tsil-1] == "사용중")
				{
					System.out.println(tsil+"호실에서 퇴실하셨습니다.");
					roomarr[tsil-1] = "빈방";
				}
			}
			else if(n == 3)
			{
				for(int i = 0; i < room; ++i)
				{
					System.out.println(i+1+"호실 - "+roomarr[i]);
				}
			}
			else if(n == 4)
			{
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); //프로그램 종료시켜라
			}
			else
			{
				System.out.println("잘못입력했습니다. 다시입력해주세요");
				continue;
			}
		}
	}

}
