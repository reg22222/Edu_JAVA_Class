import java.util.*;
public class Exam_13 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		int arr2[] = new int[3]; //[] : 배열첨자연산자
		int arr3[];
		arr3 = new int[3];
		arr3[0] = 100;
		
		int arr4[] = new int[] {1,2,3,4};
		
		int arr5[] = {1,2,3,4}; //JVM가 알아서 int[]를 붙혀 실행
		
		int arr6[];
		//arr6 = {1,2,3,4} //오류발생! 반드시 선언과 동시에 초기값을 줄때만 사용 가능
		
		int arr7[] = new int[] {1,2,312,321,312,3,123,123,13,12,3};
		System.out.println("배열의 크기"+ arr7.length);
		
		int a = 10;
		int arr8[] = new int[a]; //상수 및 변수도 선언 가능
		
		
		
		
		
	}

}
