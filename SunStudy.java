package quiz;
import java.util.Scanner;

public class SunStudy {
/*�Է��� ���ڷ� ������ ���� �ݺ��� �ϳ��� �����
	1 4 7
	2 5 8
	3 6 9
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num =0;
		int y = 1;
		int x = 0;
		int size =0;
		size = sc.nextInt();
		while(y<=size&&x<size*size) {
			if(x>=size) {
				System.out.println();
				y = y+1;
				x = 0;
			}
			else {
				num = (x*size)+y;
				System.out.print(num+" ");
				x = x+1;
			}
		}
	}

}
