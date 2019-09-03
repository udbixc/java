
import java.util.Scanner; 

public class demo9_3_3{
	public static void main(String[] args){
		System.out.println("this is 19-9-3 输入，输出");
		
		getSum(1,4);
		
		getNum();
	}
	
	public static int getSum(int a, int b){
		int result = a+b;
		System.out.println(result);
		return result;
	}
	
	public static void getNum(){
		System.out.println("输入数字：");
		
		// 从键盘接收数据
	    Scanner scan = new Scanner(System.in);
       
		
		// next方式接收字符串
		int sc = scan.nextInt();
        
        System.out.println(sc+" 是输入数字");
	}
}