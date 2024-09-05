# Les Bases de Java

## Introduction

Java est un language de programmation orienté objet largement utilisé pour le développement d'applications, de logiciels d'entreprise, de jeux, et bien plus encore. Ce cours couvree les bases de la programmation en Java, y compris les variables, les conditions, les boucles et les fonctions.

## Variables

### Déclaration et Initialisation

Une variable est un espace de mémoire qui stocke des valeurs. En Java, les variables doivent être zdéclarées avec un type avant de pouvoir être utilisées.
```java
public class Main {
    public static void main(String[] args) {
        // Déclaration et initialisation d'une variable entière
        int age = 25;

        // Déclaration et initialisation d'une variable chaîne de caractères
        String nom = "Alice";

        // Déclaration et initialisation d'une variable flottante
        double prix = 19.99;

        // Affichage des valeurs des variables
        System.out.println("Nom : " + nom);
        System.out.println("Age : " + age);
        System.out.println("Prix : " + prix);
    }
}
```

### Types de Variables

- **Primitifs** : `int`, `double`, `float`, `char`, `boolean`, `byte`, `short`, `long`
- **Objets** : `String`, `Date`, etc.

## Conditions

### Structure `if-else`

La structire `if-else` permet d'exécuter du  code en fonction de conditions spécifiques.
```java
public class Main {
    public static void main(String[] args) {
        int age = 20;

        if (age >= 18) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes mineur.");
        }
    }
}
```

### Structure `switch`

La structure `switch` permet de sélectionner une branche de code en fonction de la valeur d'une variable.
```java
public class Main {
    public static void main(String[] args) {
        int jour = 3;

        switch (jour) {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            default:
                System.out.println("Autre jour");
        }
    }
}
```

## Boucles

### Boucle `for`

La boucle `for` permet de répéter une séquence d'instructions un nombre déterminé de fois.
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
```

### Boucle `while`

La boucle `while` permet de répéter une séquence d'instructions tant qu'une condition est vraie.
```java
public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }
    }
}
```

### Boucle `do-while`

La boucle `do-while` garantit que la séquence d'instructions est exécutée au moins une fois avant de vérifier la condition.
```java
public class Main {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);
    }
}
```

## Fonctions

### Déclaration et Appel de Fonctions

Une fonction (ou méthode) est un bloc de code qui effectue une tâche spécifique. En Java, les fonctions sont définies à l'intérieur de classes.
```java
public class Main {
    public static void main(String[] args) {
        afficherMessage("Bonjour, monde!");
    }

    public static void afficherMessage(String message) {
        System.out.println(message);
    }
}
```

### Fonction avec Retour

Une fonction peut retourner une valeur à l'appelant en utilisant le mot-clé `return`.
```java
public class Main {
    public static void main(String[] args) {
        int resultat = addition(5, 3);
        System.out.println("Résultat : " + resultat);
    }

    public static int addition(int a, int b) {
        return a + b;
    }
}
```

## Conclusion

Ce cours sommaire couvre les bases de la programmation en Java, y compris les variables, les conditions, les boucles et les fonctions. Ces concepts sont essentiels pour comprendre et écrire du code en Java. En maîtrisant ces bases, vous serez bien préparé pour explorer des concepts plus avancés et développer des applications plus complexes.