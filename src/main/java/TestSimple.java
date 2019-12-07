public class TestSimple {
    public static void main(String s[]){
        System.out.println("Test Maven!!!");
        sayHello("Test");
    }

    public String sayHello1(String name){
        return name;
    }

    public static void sayHello(String name){
        System.out.println("Hi:::::"+name);
        System.out.println("Hi:::::"+name);
        System.out.println("Hi:::::"+name);
        sayHello2("MADHU");
        System.out.println("Hi:::::"+name);
    }
    public static void sayHello2(String name){
        System.out.println("Hi:::::"+name);
        System.out.println("Hi:::::"+name);
        System.out.println("Hi:::::"+name);
        System.out.println("Hi:::::"+name);
    }
}
