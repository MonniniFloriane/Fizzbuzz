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

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FizzBuzz(100);
    }

    public static void FizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            String s = "";
            if (i % 3 == 0) {
                s += "Fizz";
            } if (i % 5 == 0) {
                s += "Buzz";
            } if (s.isEmpty()) {
                s = String.valueOf(i);
            }
            System.out.println(s);
        }
    }
}