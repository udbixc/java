public class demo1 {
    public static void main(String[] args) {
        System.out.println("封装");

        f f1 = new f();

        //set方法重新赋值
        f1.setName("zzzz");

        //输出get方法的值
        System.out.println(f1.getName());
    }
}

class f{

    //对属性进行封装，所以不赋值
    private String name;
    private int age;

    //使用set方法
    void setName(String name){
        this.name = name;
    }

    //使用get方法
    String getName(){
        return name;
    }
}
