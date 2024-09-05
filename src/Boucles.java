public class Boucles {
    public static void main(String[] args) {

        String pseudoz = "George,Kevin,Edouard, Jérémy,Guy";
        String[] pseudos = pseudoz.split(",");

        int x = 0;
        int j = 10;

        // Boucle for
        for (int i = 0; i < 10; i++) {
            System.out.println("Le conteur est à : " + i);
        }

        // Boucle foreach
        for (String pseudo : pseudos) {
            System.out.println(pseudo);
        }

        // Boucle while
        while (x != 20) {
            x++;
            System.out.println("La valeur de x est : " + x);
        }

        // Boucle do While
        do {
            j--;
            System.out.println("La valeur de j est : " + j);
        } while (j !=0);
    }
}
