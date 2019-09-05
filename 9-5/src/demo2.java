public class demo2 {
    public static void main(String[] args) {
        System.out.println("继承");

        son s1 = new son();
        s1.name = "zzz";
        s1.age = 24;
        s1.print_info();
    }
}


class father{
    int age = 54;
    String name = "mko";

    void print_info(){
        System.out.println(name+" name... age "+age);
    }

    void sleep(){
        System.out.println(name +" is sleep");
    }
}

class son extends father{
    int age = 24;
    String name = "mko";

    void print_info(){
        System.out.println(super.name+" name... age "+super.age);
    }

    void run(){
        System.out.println(this.name+" is running...");
    }
}