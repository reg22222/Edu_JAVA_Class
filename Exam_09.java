class Point2d{
	int x;
	int y;
	public Point2d() {
		x = 100;
		y = 125;
	}
	public void disp() {
		System.out.println("좌표 : ["+x+","+y+"]");
	}
}
class Point3d extends Point2d{
	int z;
	public Point3d() {
		z = 150;
	}
	public void disp() {
		System.out.println("좌표 : ["+x+","+y+","+z+"]");
	}
}
public class Exam_09 {
	public static void main(String[] args) {
		Point3d p2 = new Point3d();
		Point2d p3 = p2;
		p2.disp();
		//자식의 생성자로 부모의 객체를 만들 수 있다.
		//업캐스팅 : 자동형변환
		
		/*
		Point2d ap = new Point2d();
		Point2d bp = ap; //같은 클래스이므로 대입연산이 가능하다
		//ap.x와 bp.x는 동일한 메모리에 있는 변수다
		
		ap.x = 1000; 
		//ap.y와 bp.y는 동일한 메모리에 있는 변수다
		bp.y = 2000;
		ap.disp();
		bp.disp();*/
	}

}
