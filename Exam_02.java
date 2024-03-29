import java.util.Hashtable;

public class Exam_02 {
		public static void main(String[] args) {
		Hashtable<String, String> map = new Hashtable<>();
		
		map.put("유재석","개그맨");
		map.put("류현진","야구선수");
		map.put("손흥민","축구선수");
		map.put("김종국","가수");
		
		
		
		if(map.containsKey("손흥민")) {
			System.out.println("손흥민의 저희 멤버입니다.");
		}
		
		
		
		Enumeration<String> enu = map.keys();   	//키값을 모두 가져오기
		while(enu.hasMoreElements()) {		//hasNext() 과 동일한 명령
			Object obj = enu.nextElement();
			String key = (String)obj;
			Object obj2 = map.get(key);		//업캐스팅
			String value = (String)obj2;	//다운캐스팅
			System.out.println(key+"님의 직업 : "+ value);
		}
		
		/*
		System.out.println("김종국의 직업 : "+ map.get("김종국")); //map.get(키값) : 그 키의 해당되는 밸류값이 나옴
		
		/*
		System.out.println("map의 크기 : " +map.size());
		map.remove("김종국");			//삭제
		System.out.println("map = "+map);
		
		/*
		System.out.println("map = "+map);
		map.put("김종국","개그맨");
		System.out.println("map = "+map);		//키값이 같고 밸류값이 다르면 밸류값이 수정이 된다
		*/
	}

}
