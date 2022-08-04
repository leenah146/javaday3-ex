import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//1
        //boolean prime= prime(12);

//if (prime){
        //System.out.println("a prime");
    //}

//else {
        //System.out.println("not a prime");
//}

//hello
        //2

     //   System.out.println("the tax for 400 price is"+taxcal(10));

        //3



        boolean check = pand("dad");
        System.out.println(check);

    }












//1
   // public static boolean prime (int p) {
     //   boolean prime = true;
    //   if (p<=1){
    //       prime = false;
     //  }
     //  else {
     //      for (int i=2;i<=p/2;++i) {
        //      if (p%i==0){
           //       prime = false;
         //     }
           //}
     //  }

     //   return prime;
  //  }

   //2

//   public static int taxcal(int price){

    //   int t=0;
     //     if (price>=100&&price<=500){
      //        t= price*15/100;

     //     }
      //    else {
       //      System.exit(0);
        //  }
       //   return t;
  // }

//3
public static boolean pand(String name) {
 String storerev="";
    boolean  pand= false;
    for (int i = name.length() - 1; i >= 0; i--) {
        storerev= storerev + name.charAt(i);
    }

    if (name.equals(storerev)) {
        pand = true;
    }
    return pand;
}







}




