
import java.util.Scanner; 

public class demo9_3_3{
	public static void main(String[] args){
		System.out.println("this is 19-9-3 ���룬���");
		
		getSum(1,4);
		
		getNum();
	}
	
	public static int getSum(int a, int b){
		int result = a+b;
		System.out.println(result);
		return result;
	}
	
	public static void getNum(){
		System.out.println("�������֣�");
		
		// �Ӽ��̽�������
	    Scanner scan = new Scanner(System.in);
       
		
		// next��ʽ�����ַ���
		int sc = scan.nextInt();
        
        System.out.println(sc+" ����������");
	}
}