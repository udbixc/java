public class demo9_3_4{
	public static void main(String[] args){
		System.out.println("this is 19-9-3");
	}
	//�����ǿ��������
	class hello{}
}

//��main�����Ϳ���ͨ���������룬java lala�����lalala
class lala{
	public static void main(String[] args){
		System.out.println("lalala");
	}
}

class test{
	public static void main(String[] args){
		System.out.println("this is test");
		
		int a = 1;
		String name = "zhengh";
		
		System.out.println(name);
		
		for(int i=1; i<10; i++){
			if(i % 2 != 0){
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("===============================");
		int count = 1;
		
		//���forѭ����forѭ���������ڣ�whileѭ���ڻ�������
		while(count < 10){
			if(count % 2 ==0){
				break;
			}
			System.out.println(count);
			count ++;
		}
	}
}
