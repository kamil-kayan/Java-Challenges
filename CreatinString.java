public class CreatinString {
    public static void main(String[] args) {
        String k = new String("Kamil");
        char [] c = {'K','A','M','I','L', ' ', 'H','O','D','A','N'};

        String t = new String(c);

        String ami = new String(c, 1,4);//Displays only fro Chara
        String h = new String (c,6,5);
        
        System.out.print(ami+"\t"+h);
        System.out.println();

        for (int i = 0; i < 5; i++){
            System.out.print(c[i]);
        }
        System.out.println("  "+h);

//
        int ar[] = {5, 1, 15, 20};
        int i, j, m;
        i = ++ar[1];
        j = ar[1]++;
        m = ar[i++];
        System.out.println("Result = "+i+j+m);
    }
}
