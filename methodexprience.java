package practice1;

public class methodexprience {
	public static String numbering(int init, int limit)//*�Ű�����(parameter)
	{
		int i = init;
		String output = "";
		while (i<limit) {
			output += i;
			i++;
		}
		return output;//��ȯ������ ���� �ڵ�� ��ǰ������ ��ġ���
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = numbering(1,5);//*����(argument)
		System.out.println(result);
	}
}
