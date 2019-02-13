class HelloWorld {		//这是程序的类的声明，类名是Helloworld,关键字class 的意思是类。Java是面向对象的语言，所有代码必须位于类里面
						//一个源文件中至多只能声明一个public的类，其它类的个数不限，
						//如果源文件中包含一个public 类，源文件名必须和其中定义的public的类名相同，且以“.java”为扩展名。
	public static void main(String[] args) {		//这是程序的主方法，是程序的入口,main方法是Java应用程序的入口方法，它有固定的书写格式
			System.out.println(1);		//这是程序的输出

			// System.out.println("za");		//这也是程序的输出
			// System.out.println('4');			//ln是换行输出
			// System.out.println("d");
			// System.out.println(true);
			// System.out.println(false);
			int a = 13;
			System.out.println(a);
			String b = "zh";
			System.out.println(b);
			double c = 0.3f;
			System.out.println(c);
			boolean d = false;
			System.out.println(d);
			String e;
			e = "Hello World";
			System.out.print(e);
	}
}