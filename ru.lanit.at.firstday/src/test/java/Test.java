import somepackage.Other;
import somepackage.Some;

public class Test {
    public static void main(String[] args) {
        System.out.println("Этот класс создан во имя великой цели!");
        Some some = new Some("Это уже не секрет");
        System.out.println(some.getClass());
        System.out.println(some.getSecret());
        System.out.println(some.getДаТакТожеМожно());
        System.out.println(some.getNoMoreSecrets());
        System.out.println(some.getSecret());
        System.out.println(some.toString());
        Other.saySomthing();
        
    }
}
