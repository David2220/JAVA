package quiz;
import java.util.Scanner;

public class SunStrudyQ01 {
	
	//3���� �� �Է¹޾� �ִ밪�� �ּҰ�, ���� ��(���) ���ϱ�
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a=0; int b=0;
	        for(int count=1;count<=5;count=count+1) {
	            
	            System.out.print(count+"��° �����Է�: ");
	            int num=sc.nextInt();
	            if(count==1) {
	                a=num;
	                b=num;
	            }
	            if(num>a) {
	                a=num;
	            }
	            if(num<b) {
	                b=num;
	            }
	        }
	        sc.close();
	        System.out.println("�ִ밪: "+a);
	        System.out.println("�ּҰ�: "+b);
	        System.out.println("��: "+(a-b));
	    }
	}
