package _00Telusko._00wAbstractClassAndInterface;

interface Computer{
    void code();
}
class Laptop implements Computer {
    public void code(){
        System.out.println("code, compile, run");
    }
}
class Desktop implements Computer {
    public void code(){
        System.out.println("code, compile, run");
    }
}
class Developer{
    public void devApp(Computer comp){
        comp.code();
    }
}
public class _08NeedOfInterface {
    public static void main(String[] args) {
        Computer desk = new Desktop();
        Computer lap=  new Laptop();
        Developer dev = new Developer();
        //developer develops application on computer (which can be laptop, desktop etc..)
        dev.devApp(desk);
        dev.devApp(lap);
    }
}
