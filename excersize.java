public class Main {
    public static void main(String[] args) {
        //1
        //  String name[]=new String[3];
        // name[0]="Saleh";
        // name[1]="Khalid";
        //  name[2]="Majed";

        // for (int i=0;i<name.length;i++){
        //   System.out.println(name[i]);
        // }


        //________
        //2
        // for(int i=0;i<=33;i++){
        //      if (i%5==0){
        //       continue;
        //   }
        //    System.out.print(i);
        //
        //}
//---------------------------
        //3
        //    String name[] = new String[5];
        //  name[0] = "Saleh";
        // name[1] = "Khalid";
        //    name[2] = "Majed";
        //  name[3] = "NOrah";
        //    name[4] = "Sarah";
        //   for (int i = name.length - 1; i >= 0; i--) {
        //       System.out.println(name[i]);
        //   }
        //___________________________________________________________________
        //4
        //   String name[] = new String[10];
        //   name[0] = "Saleh";
        //name[1] = "Khalid";
        //name[2] = "Majed";
        //name[3] = "NOrah";
        //name[4] = "Sarah";
        // name[5] = "Alla";
        // name[6] = "Ahmed";
        //name[7] = "Ameera";
        // name [8] = "reem";
        // name [9] = "deema";


        //   for (int i=0;i<name.length;i++){
        //      if (name[i].startsWith("A")){
        //          continue;
        //  }
        //     System.out.println(name[i]);
        //   }


        //____________________________
        //5

        //  String name[] = new String[5];
        //   name[0] = "Saleh";
        //  name[1] = "Khalid";
        //    name[2] = "Majed";
        //     name[3] = "NOrah";
        //   name[4] = "Sarah";

        //     printarray(name);


        //6

        // createarr(1,2,4);

        //7
        // name(" leenah" ," alkhuraiji");

        //8

       // System.out.println("the avg of 1+2+3+4 is"+avg(1,2,3,4));

        // 9
         int array []=new int[]{10,50,60,-100};
         System.out.println("the max of array is"+maxarr(array));


    }

    //5
    // static public void printarray ( String []array){
    // for (int i=0;i<array.length;i++){
    //    System.out.println(array[i]);
    // }
//6
    // static public int[] createarr(int a, int b, int c){
    //    int num[]=new int[3];
    //     num[0]=a;
    //      num[1]=b;
    //      num[2]=c;

    //    return num;


    //7
    // public static void name(String Fname,String Lname) {

    //    System.out.print("hello"+Fname+Lname);


    //    }

    //8
   // public static int avg(int a, int b, int c, int d) {

     //    return (a+b+c+d)/4;

   // }

    //9

    public static int maxarr(int[]array){
        int max=array[0];
        for (int i=0;i< array.length;i++){
            if (array[i]>max) {
                max=array[i];

            }

        }
        return max;
    }
}

