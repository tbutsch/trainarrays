package digital.jgh;

public class Main {

    public static void ausgabe(int[] ausgabearray){
        for(int zahl : ausgabearray) {
            System.out.print(zahl+", ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] liste = new int[]{4,8,2,7,9,1,3,5};
        ausgabe(liste);
    }
}