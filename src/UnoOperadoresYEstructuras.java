public class UnoOperadoresYEstructuras {
    public static void main(String[] args) {


        //Operadores de JAVA, se realizara un ejemplo por cada uno de ellos

        //Operadores aritmeticos...

        int suma = 4 + 4;
        int resta = 3 - 5;
        int multiplicacion = 3 * 4;
        int division = 8 / 2;
        int modulo = 8 % 3;

        //Operadores unarios...

        /*  + = Valor positivo
            - = Valor negativo
            ++ = ++1 -> Pre incremento  // 1++ -> Post incremento
            -- = --1 -> Pre decremento // 1-- -> Post decremento
            ! = negracion !true = false Negacion de true es igual a false
         */

        //Operadores de relacion

        int a = 5;
        int b = 4;

        boolean igual = a == b;
        boolean diferente = a != b;
        boolean mayorQue = a > b;
        boolean menorQue = a < b;
        boolean mayorIgual = a >= b;
        boolean menorIgual = a <= b;

        //Opertadores logicos

        boolean operadorUno = a == b && b < a; //Operador and, ambos resultados deben ser verdaderos para arrojar true
        boolean operadorDos = a >= b || b > a; //Operador or, uno de los resultados debe ser verdad para arrojar true
        boolean negadorLogico = !operadorDos; // Cambiara el resultado que se asigne en la variable operadorDos

        //Operadores de asignacion

        int c = 1; // se asigna a c el dato numerico 1
        c += 8; // c suma  1 + 8 = 9
        c -= 3; // c resta  9 - 3 = 6
        c *= 2; // c se multiplica 6 * 2 = 12
        c /= 2; // c se divide 12 / 2 = 6
        c %= 4; // c modulo 6 / 4 = 2

        //Operador ternario

        String datoTernario = (a > b) ? "SI es mayor" : "NO, es menor";
        String datoTernarioDos = (a == b) ? "SI, es igual" : "NO, es diferente";

        /*Programa para imprimir por consolatodos los números comprendidos
         entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.*/

       for (int i = 10; i <= 55 ; i++ ){

           if (i % 2 == 0 && i % 3 != 0 && i != 16){
               System.out.println("Numero: " + i);
           }

        }

    }
}
