package interfaces;

public class MyIfImp2 implements MyIf {
    @Override
    public int getNumber() {
        return 1;
    }

    @Override
    public String defaultMethod() {
        return "Другая символьная строка";
    }
}
