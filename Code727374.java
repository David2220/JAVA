package saengcoStartJava;

class Calculator{
    int left, right;//left, right���� ����
    //��ü �������� ���ٰ���
      
    public void setOprands(int left, int right){
    	//()parameter/�Ű�����<�ٸ� ������ ���� ����, ���� left, right�� ��� ���� ����
        this.left = left;
        this.right = right;
      //���� int left, right�� ��⵵�� �ϴ� this.left, right
    }
      
    public void sum(){
        System.out.println(this.left+this.right);
        //class���� �� ó���� int left, right�� �ٷ� ���� this."��
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
} //��ü�� �����ϱ� ���� ���赵: class����  

public class Code727374 {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        //new�پ��ִ°�: ��ü->c1�̶� ������ ���, ������ ���������� ��ü��
        //����c1, ��ü Calculator�� ����ִ� ��������(�ؿ����배��): �ν��Ͻ�(instance)
        c1.setOprands(10, 20);//�ν��Ͻ� ���� ������ ��(����)�� ������ ����
        //�� ���¸� ���� �� ��ü���� �޼ҵ带 ȣ���ϴ� ���� �� ��ü�� ���� ����
        //setOprands: �޼ҵ�, (10,20):����
        c1.sum(); //sum, avg: �޼ҵ�      
        c1.avg();       
          
        Calculator c2 = new Calculator();//�ν��Ͻ� �� ����
        c2.setOprands(20, 40);
        c2.sum();       
        c2.avg();
    }
  
}