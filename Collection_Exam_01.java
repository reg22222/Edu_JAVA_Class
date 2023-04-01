import java.util.*;
public class Collection_Exam_01 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("유재석");		// add() : 데이터 삽입
		set.add("김종국");
		set.add("송지효");
		set.add("전소민");
		set.add("하하");
		set.add("지석진");
		set.add("양세찬");
		set.add("유재석"); // 중복되면 그냥 하나만 나옴(덮어씀)
		
		set.remove("양세찬");			//특정 데이터 삭제!!
		
		Iterator it = set.iterator();
		while(it.hasNext()) { 			//현재 데이터가 존재하는지 안하는지
			Object obj = it.next();		// 업캐스팅
			String name = (String)obj;	// 다운캐스팅
			System.out.println(name);
		}
		
		
		/*
		
		String[] name = new String[set.size()];  
		set.toArray(name);							//String 배열로 바꿔서 씀
		for(int i=0; i<name.length; ++i) {
			System.out.println(name[i]);
		}
		
		/*
		String name = "유재석";
		
		if(set.contains(name)) {		// contains : 해당하는 객체가 존재하는지 찾아주는 
			System.out.println(name+"은 런닝맨 멤버!!");
		}else {
			System.out.println(name+"은 런닝맨 멤버가 아닙니다.");
		}
		
		/*
		//System.out.println(set);
		
		//System.out.println("set의 크기 : "+set.size());	// size() : 크기를 나타내줌
		
		set.clear();			//데이터 모두 비우기(지우기)
		//System.out.println("clear 한 후set의 크기 : "+set.size());
		
		if(set.isEmpty()) {		//데이터가 없는지, 있는지
			System.out.println("데이터 없다");
		}
		else {
			System.out.println("데이터 있다.");
		}
		*/
	}
}
