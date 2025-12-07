package _00Telusko._00packagesDemo.MyPack;
public class Balance{
    public String name;
    double bal;

     public Balance(String n, double b){
        name=n;
        bal=b;
     }

    public void show(){
        if(bal<0)
            System.out.print("--> ");
        System.out.println(name + ": $" + bal);
    }
}
//
//class AccountBalance{
//    public static void main(String[] args){
//        Balance[] current =new Balance[3];
//        current[0]=new Balance("S.Dutta",200.50);
//        current[1]=new Balance("S.Das",500.75);
//        current[2]=new Balance("S.Bose",800.50);
//
//        for(int i=0;i<3;i++)
//        {
//            current[i].show();
//        }
//    }
//}