
public class Exam_07 {
	public static void main(String[] args) {
		star();
		System.out.println("aaaaaaaaaaaaaaaa");
		star(5); star(); star();
		System.out.println("bbbbbbbb");
		star(3.2); star(); star(); star();
		System.out.println("ccccc");
		star();
		System.out.println("ddddd");
		star(10,3);
	}
	public static void star(int a, int b) {
		for(int i=0; i < b ; ++i)
		{
			star(a);
		}
	}
	public static void star() {
		System.out.println("********************");
	}
	public static void star(int a) {
		for(int i=0 ; i<a ; ++i)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	public static void star(double a) {
		for(int i=0 ; i<a ; ++i)
		{
			System.out.print("*");
		}
		System.out.println();
	}

}
