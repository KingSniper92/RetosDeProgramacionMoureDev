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

    public static void main(String[] args) {




    }
}
