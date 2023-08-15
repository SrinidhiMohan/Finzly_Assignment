package assignmentJava;

public class Hello{
    void show(String p){
        System.out.println(111);
    }
    void show(Object p){
        System.out.println(222);
    }
    public static void main(String[] args){
        Hello h = new Hello();
        // By casting the null to object we can invoke the object method
        h.show((Object)null);
    }
}
