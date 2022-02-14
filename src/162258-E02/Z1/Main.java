import java.time.LocalTime;

public class Main {
    public static <T extends Comparable<T>> boolean isSorted(T[] tablica){
        for(int i=0; i<tablica.length-1; i++)
        {
            if((tablica[i].compareTo(tablica[i+1]))>0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] ars){
        Integer[] inty = new Integer[5];
        inty[0]=1;
        inty[1]=3;
        inty[2]=5;
        inty[3]=7;
        inty[4]=9;
        System.out.println(isSorted(inty));

        String[] napisy = new String[5];
        napisy[0]="d";
        napisy[1]="d";
        napisy[2]="c";
        napisy[3]="b";
        napisy[4]="a";
        System.out.println(isSorted(napisy));

        LocalTime[] czasy = new LocalTime[3];
        czasy[0]=LocalTime.of(12,15);
        czasy[1]=LocalTime.of(12,25);
        czasy[2]=LocalTime.of(12,15);
        System.out.println(isSorted(czasy));
    }
}
