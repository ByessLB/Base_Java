public class Fonctions {
    public static void main(String[] args) {

        int money = 2000;
        int pricePhone = 2200;
        boolean hasPhone = false;

        sendMessage("Il vous restera : " + getResult(money, pricePhone, hasPhone), money);

    }

        //! Une fonction est composée ainsi :
        /*
         * Private : Le mot-clé `private` est un modificateur d'accès qui signifie que la méthode
         * ou la variable est accessible uniquement dans la classe où elle est définie. En d'autres
         * termes, les mérthodes ou varible privées ne peuvent pas être accédées directement depuis
         * une autre classe.
         * 
         * Static : Le mot-clé `static` signifie que la méthode ou la variable est partagé par toutes
         * les instances de la classe. Les méthodes statiques peuvent être appelées sans créer une 
         * instance de la classe, et les variables statiques sont partagées par toutes les instances
         * de la classe.
         * 
         * Void ou Int : Le type de retour d'une méthode indique le type de valeur que la méthode
         * renvoie. Dans notre exemple, nous avons 2 types de retour :
         * - Void : signifie que la méthode ne renvoie aucune valeur. C'est le cas de la méthode
         * sendMessage(), qui imprime simplement un message sur la console sans renvoyer de valeur.
         * - Int : Signifie que la méthode renvoie une valeur entière. C'est le cas de la méthode
         * getResult(), qui renvoie la différence entre le montant d'argent et le prix du téléphone.
         * 
         * Pour plus d'info, se référer à la Doc.
         */


    private static void sendMessage(String message, int number) {
        System.out.println("ceci est votre budget : " + number + "\n" + message);
    }

    private static int getResult(int sous, int prix, boolean hasTel) {
        if (sous >= prix && !hasTel) {
            System.out.println("Vous pouvez acheter le téléphone d'une valeur de : " + prix);
        } else {
            System.out.println("Vous ne pouvez pas acheter le téléphone d'une valeur de : " + prix);
        }
        return sous - prix;
    }
}
