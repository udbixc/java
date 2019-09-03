public class demo9_3 {
    public static void main(String[] args) {
        System.out.println("this is 19-9-3");
		
		echo_hello();
		
		//都失败了，函数(方法调用的三种方式)
		
		//String result = echo_hello();
		//System.out.println(result);
		
		//System.out.println(echo_hello());
    }
	
	public static void echo_hello(){
		String name = "zhenghong";
		System.out.println(name);
	}
}

