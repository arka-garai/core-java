package _00Telusko._00xEnumToStreamAPI;

//custom exception
class ArkaException extends Throwable{
    public ArkaException(String str){
        super(str);
    }
}
class Arka6fxException extends Exception{
    public Arka6fxException(String message) {
        super(message);
    }
}
public class _10ThrowUserDefinedException {
    public static void main(String[] args) {
        int i=9;
        int j=0;

        try{
            //critical statements
            j = 18/i;
            if(j == 0)
                throw new ArkaException("I don't want to print zero");
            else if(j == 2)
                throw new Arka6fxException("my custom exception lol😂🤩");
        } catch (ArkaException e) {
            j = 18 / 1;
            System.out.println("that's the default output " + e);
        }catch (Arka6fxException e) {
            j = 18/1;
            System.out.println("that's the default output "+ e);
        } catch (Exception e){
            System.out.println("Something went wrong !"+ e);
        }
        System.out.println(j);
        System.out.println("bye idc");
    }
}
