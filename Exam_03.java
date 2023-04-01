import java.util.*;

public class Exam_03 {
	public static void main(String[] args) {
		
		String data = "홍길동@123-1234@서울강남구";
		
		/*
		Scanner in = new Scanner(data).useDelimiter("\\s*@\\s*"); // s* : 0개이상
		// \\s*@\\s*  : @를 중심으로 앞에 공백, 뒤에 공백은 구별자이다.
		System.out.println("이름 : "+in.next());
		System.out.println("전화번호 : "+in.next());
		System.out.println("주소 : "+in.next());
		/*
		String[] member = data.split("@");
		for(int i = 0 ; i<engtmember.lh; ++i) {
			System.out.println(member[i]);
		}
		
		/*요즘은 잘 사용하지 않는 유산클래스 (옛날엔 썼지만 지금은 안쓰니 알아만 두자)
		StringTokenizer st = new StringTokenizer(data);
		//첫번째 매개변수에 data를 넣고, 두번째 매개변수엔 구별자를 넣는다.
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		
		/*
		String str = "Hello, java!!";
		String str2 = "             Hello, Java!!           ";
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str2.trim().equals(str)); //메소드 체인(웹에서 많이쓰임)(trim:공백제거 후 equals:비교)
		//str2의 앞뒤의 쓸데없는 공백을 지우고 str과 비교한다
		
		/*
		System.out.println(str.toUpperCase()); //전부 대문자로 바꿔줌
		System.out.println(str.toLowerCase()); //전부 소문자로 바꿔줌
		/*
		System.out.println("str.substring(7) = "+ str.substring(7));
		// 매개변수가 하나일때 => 해당위지부터 끝까지
		System.out.println("str.substring(7,11) = "+str.substring(7,11));
		//매개변수가 두개일때 => 처음위치부터 두번째 되기 전까지
		/*
		
		System.out.println("Hello로 시작합니까?"+ str.startsWith("Hello")); //
		System.out.println("Java로 끝이 납니까?"+ str.endsWith("Java")); // 이메일(gmail,naver등등)을 구분할때 많이 쓰임
		byte[] by = str.getBytes();
		for(int i=0; i<by.length; ++i); // 문자열을 byte배열로 바꾸기
		{
			System.out.println(by[i]); //네트워크 전송중  UDP는 BYTE형식으로밖에 못보내서 이렇게 바꾸는거
		}
		
		
		String str2 = new String(by); // byte배열을 문자열로 바꾸기
		System.out.println(str2);
			
		/*

		for(int i = 0 ; i<str.length(); ++i)
		{
			System.out.println(str.charAt(i)); //charAt : 해당되는 인덱스 값을 꺼내와서 char형으로 바꾸는것
		}
		
		/*
		String a = "aaa";
		String b = "aaa";
		String c = new String("aaa");
		String d = new String("aaa");
		
		System.out.println(a.equals(b)); // equals : a와 b가 같냐 물어보는것
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(c.equals(d));
		
		/*
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(c==d);
		*/
	}

}
