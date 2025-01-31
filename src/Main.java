/*Instructions
C'est le très classique Fizz Buzz.

Sujet
Affichez les nombres entre 1 et N en suivant les règles :

si le nombre peut être divisé par 3 : afficher Fizz ;
si le nombre peut être divisé par 5 : afficher Buzz ;
si le nombre peut être divisé par 3 ET 5 : afficher FizzBuzz ;
sinon : afficher le numéro.

Lignes directrices :
Écrivez-le dans votre langue préférée (l'une des suivantes : javascript, php)
Transférez votre code vers un référentiel Github ou dans n'importe quel environnement sandbox comme codesandbox
Préparez-vous à justifier certains de vos choix pour l'entretien
Évaluation
Qualité du code
Évolutivité de l'algorithme
Utilisation de bonnes pratiques et de fonctionnalités de langage de programmation moderne*/

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        fizzBuzz(100);
    }

    public static HashMap<Integer, String> getConfig() {
        HashMap<Integer, String> result = new HashMap<Integer, String>();

        result.put(3, "Fizz");
        result.put(5, "Buzz");

        return result;
    }

    public static boolean isDivisible(int value, int modulo) {
        return value % modulo == 0;
    }

    public static String fizzBuzzStringBuilder(HashMap<Integer, String> config, int value) {
        StringBuilder result = new StringBuilder();

        for (Integer key : config.keySet()) {
            if (isDivisible(value, key)) {
                result.append(config.get(key));
            }
        }
        if (result.isEmpty()) {
            result.append(value);
        }

        return result.toString();
    }

    public static void fizzBuzz(int n) {
        HashMap<Integer, String> config = getConfig();

        for (int i = 1; i <= n; i++) {
            System.out.println(fizzBuzzStringBuilder(config, i));
        }
    }
}