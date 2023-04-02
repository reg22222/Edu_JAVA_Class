import java.util.*;
public class Exam_01 {
	public static void main(String[] args) {
		// JSP에서 LIST형식으로 정말 많이 씀
		ArrayList<String> list = new ArrayList<>();
		
		//Generic : Collection에서 내가 저장할 자료형을 미리 선언해주는 것
		
		list.add("유재석");
		list.add("김종국");
		list.add("하하");
		list.add("송지효");
		list.add("전소민");
		list.add("양세찬");
		list.add("양세찬");
		list.add("유재석");
		
		
		
		
		/*
		
		list.remove(5)
		System.out.println(list); //값으로 지울수도 있음
		
		list.remove("전소민");
		System.out.println(list);
		
		/*
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			String name = (String)obj;
			System.out.println(name);
		}
		
		/*

		String[] name = new String[list.size()];
		list.toArray(name);
		for(int i = 0; i<name.length; ++i) {
			System.out.println(name[i]);
		}
		
		/*
		
		System.out.println(list.indexOf("유재석"));		//값을 넣어서 위치가 어디인지 알려주는 것
		System.out.println(list.lastIndexOf("유재석"));	//값을 넣어서 위치가 어디인지 알려주는 것
		*/
		
		// List타입의 Coolection은 index로 데이터를 꺼내서 사용 가능
		
		
		
		for(String name : list) {			//list의 0번째부터 끝까지 하나씩 obj에 넘겨준다.
			//확장 for문
			System.out.println(name);
			
			//확장 for문은 List타입에서만 사용가능
			//Set이나 Map은 순서대로 나오지 않아서 for문으로 데이터를 못꺼냄
			
			
			//JSP가면 Array타입으로 만들어서 확장 for문으로 데이터 뽑아냄
			
			
			
		}
		for(int i= 0 ; i<list.size(); ++i) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.get(1));
		
		/*
		System.out.println(list); // set이랑 모양이 비슷함, 배열처럼 넣은 순서대로 들어감
		list.add(1,"지석진");
		System.out.println(list);
		
		*/
		
		
	}
}
