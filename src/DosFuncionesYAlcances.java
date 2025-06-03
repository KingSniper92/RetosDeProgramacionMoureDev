import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class DosFuncionesYAlcances {


        /*Una funcion en programacion, es un bloque de codigo que realiza una tarea en especifico, estas no puede
        estas no pueden ser definidas dentro del metodo main*/

        //1. Funcion sin parametros y sin retorno.
        public static void  sinRetorno(){
                System.out.println("sinRetorno");
        }
        //Uso >> sinRetorno();


        //2.Funcion con parametros pero sin valor de retorno.
        public static void parametroNumero(int numero){
                System.out.println("Este es el numero: " + numero);
        }
        //Uso >> parametroNumero(2);


        //3.Funciones con varios parametros y sin funcion de retorno.
        public static void variosParametros(String nombre, int edad){
                System.out.println("Tu nombre es = " + nombre);
        }
        //uso >> variosParametros("Mario", 32);


        //4.Funcion sin parametros y con valor de retorno
        public static int obtenerAleatorio(){
                return (int)(Math.random() *100);
        }
        //uso >> int numero = obtenerAleatorio(); -- soutv("Numero aleatorio = " + numero);

        //5. Funcion con parametros y con valor de retorno
        public static  int resultadoSuma(int a, int b){
                return a + b;
        }
        //Uso >> int suma = resultadoSuma(3,5); soutv(suma);

        //6. Funcion con varios parametros y retorno booleano
        public static boolean esMayorDeEdad(int edad, String nombre){
                System.out.println("Analizando el dato de " + nombre + "...");
                return edad >= 18;
        }
        //Uso >> boolean mayor = esMayorDeEdad(22, "Mario");    System.out.println(mayor);

        /* En java no se permite crear una funcion dentro de otra, debe crearse entre la clase y la instancia main*/


        //Dificultad extra

        public static int valoresASumar(String a, String b){
                int numeroUno = Integer.parseInt(a);
                int numeroDos = Integer.parseInt(b);
                return numeroUno + numeroDos;
        }

        public static void numerosDeUnoACien(String a, String b){
                int contadorDeNumero=0;

                for (int i = 0 ; i <= 100 ; i++){
                        boolean multiploTres = i % 3 == 0;
                        boolean multiploCinco = i % 5 ==0;

                        if (multiploTres && multiploCinco){
                                System.out.println(a + b);
                        }else if (multiploTres){
                                System.out.println(a);
                        }else if (multiploCinco){
                                System.out.println(b);
                        }else {
                                System.out.println(i);
                                contadorDeNumero++;
                        }
        }

        }
        

    public static void main(String[] args) {


        //Algunas funciones creadas en el lenguaje

            String nombreCompleto = "Mario Cesar Deossa Leal";

            nombreCompleto.length(); //Analiza la cantidad de caracteres.
            nombreCompleto.toUpperCase(); //Todo el texto en mayusculas.
            nombreCompleto.toLowerCase(); //Todo el texto en minusculas.
            nombreCompleto.contains("Cesar"); //Valida si la cadena de texto se encuentra.
            nombreCompleto.substring(0,5);

        //Algunas funciones matematicas

            Math.random(); //Genera un numero aleatorio.
            Math.abs(-5); //Valor absoluto.
            Math.sqrt(16); //Raiz cuadrada del parametro.
            Math.pow(2,5); //Potencia.
            Math.max(20,50); //Valor mas alto entre los dos parametros.

        //Funciones para definir el tiempo

            LocalDate fecha = LocalDate.now(); //Fecha actual
            LocalTime hora = LocalTime.now(); //Hora actual
            LocalDate.of(2025,6,1); //Crea una fecha a tu antojo

        //Funciones para arreglos

            int[] numeros = {5,9,7,5,1,3,2};

            Arrays.sort(numeros); //Ordena los numeros de menos a mayor
            Arrays.toString(numeros); //Convierte los numeros a cadena de texto

        //Utilidades basicas generales

            Integer.parseInt("123215"); //Covierte cadena de texto a numeros
            Double.parseDouble("3.14"); //Convierte cadena de tecto a double o decimal
            String.valueOf(50); //Convierte numero a cadena de texto.

        //Impresion de cada uno de los ejemplos.

            System.out.println(obtenerAleatorio());
            System.out.println("La suma de los valores da como resultado = " + resultadoSuma(50, 20));
            System.out.println(esMayorDeEdad(32, "Mario"));

            System.out.println(nombreCompleto.length());
            System.out.println(nombreCompleto.toUpperCase());
            System.out.println(nombreCompleto.toLowerCase());
            System.out.println(nombreCompleto.contains("Cesar"));
            System.out.println(nombreCompleto.substring(0,5));

            System.out.println(Math.random());
            System.out.println(Math.abs(-520));
            System.out.println(Math.sqrt(81));
            System.out.println(Math.pow(2,10));
            System.out.println(Math.max(1525,1528));

            System.out.println(fecha);
            System.out.println(hora);
            System.out.println(LocalDate.of(2022,11,12));

            System.out.println(Arrays.toString(numeros));

            System.out.println(Integer.parseInt("60876682"));
            System.out.println(Double.parseDouble("2.45"));
            System.out.println(String.valueOf(156));

            //Dificultad extra.

            int resultadoDeSuma = valoresASumar("8","15");
            System.out.println(resultadoDeSuma);

            numerosDeUnoACien("fizz","buzz");

    }
}
