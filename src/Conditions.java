public class Conditions {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int money = 5000;

        // Condition if
        if (x > y) {
            System.out.println("x est plus grand que y");
        }

        // condition multiple if
        if (money >= 10000) {
            System.out.println("Vous avez beaucoup d'argent, sir!");
        } else if (money >= 5000) {
            System.out.println("Vous avez beaucoup d'argent.");
        } else if (money >= 2000) {
            System.out.println("Vous avez un peu d'argent.");
        } else {
            System.out.println("Vous n'avez pas d'argent. Taf!");
        }

        // Condition switch
        switch (money) {
            case 10000:
                System.out.println("Vous avez beaucoup d'argent, sir!");
            break;
            case 5000:
                System.out.println("Vous avez beaucoup d'argent.");
            break;
            case 2000:
                System.out.println("Vous avez un peu d'argent.");
            break;

            default: System.out.println("argent non traité ou manque d'argent.");
        }
    }
}
