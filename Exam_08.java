import java.util.*;
public class Exam_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("À½½ÄÀ» ÀÔ·Â : ");
		String name = in.next();
		
		switch(name) {
		case "Â¥Àå¸é": System.out.println("Â¥Àå¸éÀ» ½ÃÅ°¼Ì½À´Ï´Ù. "); break;
		case "Â«»Í": System.out.println("Â«»ÍÀ» ½ÃÅ°¼Ì½À´Ï´Ù. "); break;
		case "¿ìµ¿": System.out.println("¿ìµ¿À» ½ÃÅ°¼Ì½À´Ï´Ù. "); break;
		case "ººÀ½¹ä": System.out.println("ººÀ½¹äÀ» ½ÃÅ°¼Ì½À´Ï´Ù. "); break;
		default: System.out.println("Àß¸øÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
		}
		/*
		System.out.println("1Â¥Àå¸é 2Â«»Í 3¿ìµ¿ 4ººÀ½¹ä : ");
		int select = in.nextInt();
		
		switch(select) {
		case 1:		System.out.println("Â¥Àå¸éÀ» ½ÃÅ°¼Ì½À´Ï´Ù. "); break;
		case 2:		System.out.println("Â«»ÍÀ» ½ÃÅ°¼Ì½À´Ï´Ù. "); break;
		case 3:		System.out.println("¿ìµ¿À» ½ÃÅ°¼Ì½À´Ï´Ù. "); break;
		case 4:		System.out.println("ººÀ½¹äÀ» ½ÃÅ°¼Ì½À´Ï´Ù. "); break;
		default :	System.out.println("Àß¸øÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");*/
		
		}
	}


