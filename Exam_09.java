class Point2d{
	int x;
	int y;
	public Point2d() {
		x = 100;
		y = 125;
	}
	public void disp() {
		System.out.println("��ǥ : ["+x+","+y+"]");
	}
}
class Point3d extends Point2d{
	int z;
	public Point3d() {
		z = 150;
	}
	public void disp() {
		System.out.println("��ǥ : ["+x+","+y+","+z+"]");
	}
}
public class Exam_09 {
	public static void main(String[] args) {
		Point3d p2 = new Point3d();
		Point2d p3 = p2;
		p2.disp();
		//�ڽ��� �����ڷ� �θ��� ��ü�� ���� �� �ִ�.
		//��ĳ���� : �ڵ�����ȯ
		
		/*
		Point2d ap = new Point2d();
		Point2d bp = ap; //���� Ŭ�����̹Ƿ� ���Կ����� �����ϴ�
		//ap.x�� bp.x�� ������ �޸𸮿� �ִ� ������
		
		ap.x = 1000; 
		//ap.y�� bp.y�� ������ �޸𸮿� �ִ� ������
		bp.y = 2000;
		ap.disp();
		bp.disp();*/
	}

}
