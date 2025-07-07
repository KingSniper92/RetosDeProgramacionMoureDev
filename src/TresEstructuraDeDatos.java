import java.util.ArrayList;

public class TresEstructuraDeDatos {

    public static void main(String[] args) {
        
        ///////////////////////////////////////////Array///////////////////////////////////
        
        //Creacion de estructuras
        boolean[] respuesta = {true, false, true, false};
        char[] valores = {'a', 'e', 'i', 'o', 'u'};             
        int[] edades = new int[5];
        String[] nombres = new String[5];
        long[] numerico = {32152, 654894, 6546423, 7891621, 6549871};
        float[] flotante = new float[4];
        short[] corto = new short[3];
        byte[] pequenio = {1,2,3,4};
        double[] doble = {1.1, 2.2, 3.3, 4.4, 5.5};


        //Operaciones de insercion

        edades[0] = 10;
        edades[1] = 20;
        edades[2] = 30;
        edades[3] = 40;
        edades[4] = 50;

        //Verificacion de datos

        for (int i = 0 ; i <= edades.length ; i++){
            System.out.println("Orden de edades: " + i + " edad = " + edades[i]);
        }

        nombres[0] = "Esmeralda";
        nombres[1] = "Suarez";
        nombres[2] = "Carlos";
        nombres[3] = "Juan Pablo";
        nombres[4] = "Andrea";

        for (int i = 0 ; i <= nombres.length ; i++){
            System.out.println("Nombre en indice: " + i + " es igual a = " + nombres[i]);
        }

        for (String i : nombres) {
            System.out.println("Nombres: " + i);
        }

        for (int i : edades) {
            System.out.println("Edades: " + i);
        }                      

        ///////////////////////////////////////////ArrayList///////////////////////////////////
                
        //Creacion de estructuras

        ArrayList<String> nombresPersonas = new ArrayList<>();
        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        ArrayList<Boolean> verdadOMentira = new ArrayList<>();
        ArrayList<Double> numeroDecimal = new ArrayList<>();
      
        //Operaciones de edicion de ArrayList

        nombresPersonas.add("Esmeralda");
        nombresPersonas.add("Luis");
        nombresPersonas.add("Carlos");

        numerosAleatorios.add(10);
        numerosAleatorios.add(20);
        numerosAleatorios.add(30);

        verdadOMentira.add(true);
        verdadOMentira.add(false);

        numeroDecimal.add(2.5);
        numeroDecimal.add(3.5);
        numeroDecimal.add(4.5);

        //Verificacion de datos o acceder a ellos.

        System.out.println(nombresPersonas.get(0));
        System.out.println(nombresPersonas.get(1));

        System.out.println(numerosAleatorios.get(1));
        System.out.println(numerosAleatorios.get(2));
        
        System.out.println(verdadOMentira.get(1));

        System.out.println(numeroDecimal.get(2));
        System.out.println(numeroDecimal.get(1));

        //Modificar los datos asignados.

        nombresPersonas.set(0, "Juan");
        nombresPersonas.set(1, "Miguel");

        numerosAleatorios.set(0,12);
        numerosAleatorios.set(1,44);
        numerosAleatorios.set(2,58);

        verdadOMentira.set(0,true);
        verdadOMentira.set(1,true);

        numeroDecimal.set(0, 2.5);
        numeroDecimal.set(1, 2.9);
        numeroDecimal.set(2, 3.4);

        //Validar tamaño de una ArrayList

        System.out.println(nombresPersonas.size());
        System.out.println(numerosAleatorios.size());
        System.out.println(verdadOMentira.size());
        System.out.println(numeroDecimal.size());

        //Verificar si el ArrayListo contiene un dato.

        System.out.println(nombresPersonas.contains("Esmeralda"));
        System.out.println(numerosAleatorios.contains(25));
        System.out.println(verdadOMentira.contains(true));
        System.out.println(numeroDecimal.contains(3.8));

        //Validar cuantos indices tiene el ArrayList
        

        System.out.println(nombresPersonas.size());
        System.out.println(numerosAleatorios.size());
        System.out.println(verdadOMentira.size());
        System.out.println(numeroDecimal.size());
        
        ///////////////////////////////////////////ArrayList///////////////////////////////////
        
        //Creacion de estructuras
        //Operaciones de insercion
        //Verificacion de datos
    
        ///////////////////////////////////////////ArrayList///////////////////////////////////
         
        //Creacion de estructuras
        //Operaciones de insercion
        //Verificacion de datos 
        
        ///////////////////////////////////////////ArrayList///////////////////////////////////
         
        //Creacion de estructuras
        //Operaciones de insercion
        //Verificacion de datos
        
        ///////////////////////////////////////////ArrayList///////////////////////////////////
    
    
       





    }

}
