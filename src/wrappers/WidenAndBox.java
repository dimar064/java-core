package wrappers;

public class WidenAndBox {
    static void go(Long x) {
        System.out.println("Long");
    }

    public static void main(String[] args) {
        byte b = 5;
        // go(publicVar); // нужно расширить до long и упаковать, что невозможно
    }
}
