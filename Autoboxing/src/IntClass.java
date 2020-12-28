import java.util.ArrayList;

class IntClass {

    private int myInt;

    IntClass(int i){
        this.myInt = i;
    }
    public void setMyInt(int k){
        this.myInt = k;
    }
    public int getMyInt (){
        return myInt;
    }

}
 class AutoB {
     public static void main(String[] args) {

         //Normal array declaration;
         int[] intArr = new int[5];
         String[] sArray = new String[5];

         //ArrayList Declaration using IntClass;
         ArrayList<IntClass> intClassArrayList = new ArrayList<>();
         intClassArrayList.add(new IntClass(56));
         intClassArrayList.add(new IntClass(23));

         //Using Wrapper Classes;
         ArrayList<Integer> intWrapper = new ArrayList<>();
         intWrapper.add(23);

         for (int i = 0; i < 45; i++) {
             intWrapper.add(Integer.valueOf(i));//Converting an int value to Integer Value: Autoboxing;

         }
         //Displaying the ArrayL;
         for (int i = 0; i < 45; i++) {
             if (i < 21) continue;
             System.out.println((i - 1) + " --> " + intWrapper.get(i));       //intWrapper.get(i).intValue;
             if (i > 30) break;
         }

         //For Double Wrapper classes;
         ArrayList<Double> myDouble = new ArrayList<>();
         for (double dbl = 21.5; dbl < 22.5; dbl += 0.5) {
             myDouble.add(Double.valueOf(dbl));     //Autoboxing;
         }
         System.out.println("Galtiano");
         for (int i = 1; i < myDouble.size(); i++) {
             double values = myDouble.get(i).doubleValue(); //Unboxing;
             System.out.println(i + "--> " + values);
//           System.out.println(i + " --> " + myDouble.get(i).doubleValue());
         }

            //For long Values;
         ArrayList<Long> longArrayList = new ArrayList<>();

         for (long l = 98765; l < 98775; l++){
             longArrayList.add(Long.valueOf(l));    //Converting The Wrapper class Long to primitive long
         }
         for (int i = 1; i < longArrayList.size(); i++){
             long num = longArrayList.get(i).longValue();
             System.out.println(i+" --> "+num);
         }

     }
 }
