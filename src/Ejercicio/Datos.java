package Ejercicio;

public class Datos {
    public static void main(String[] args) {
        // Cadenas de texto
        System.out.println("-----------------------------------------------");
        System.out.println("---------- Cadenas de texto -------------------");
        System.out.println("-----------------------------------------------");
        // Cadenas de caracteres
        String nombre = "Cecilia";
        System.out.println("Esto es un string: " + nombre);

        // Character
        char character1 = 'a';
        System.out.println("Esto es un char: " + character1);

        // Enteros
        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        System.out.println("--------------- Enteros -----------------------");
        System.out.println("-----------------------------------------------");
        byte number1 = 1;   // 1byte
        System.out.println("Esto es un byte: " + number1);
        short number2 = 2;  // 2byte
        System.out.println("Esto es un short: " + number2);
        int number3 = 3;    // 4byte
        System.out.println("Esto es un int: " + number3);
        long number4 = 4;   // 8byte
        System.out.println("Esto es un long: " + number4);

        // Punto Flotante
        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        System.out.println("--------------- Flotantes ---------------------");
        System.out.println("-----------------------------------------------");
        float decimal1 =4.9f;       // La f indica que es float
        System.out.println("Esto es un float: " + decimal1);
        double decimal2 = 9.99d;    // La d indica que es double
        System.out.println("Esto es un double: " + decimal2);

        // Booleans
        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        System.out.println("--------------- Booleanos ---------------------");
        System.out.println("-----------------------------------------------");
        boolean verdadero = true;
        System.out.println("Esto es un boolean: " + verdadero);
        boolean falso = false;
        System.out.println("Esto es un boolean: " + falso);

        // Tipos envoltorios
        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        System.out.println("--------------- Envoltorios -------------------");
        System.out.println("-----------------------------------------------");
        Integer numero = null;  // Nos permite que el valor sea nulo, con los tipos primitivos no se puede
        System.out.println("Esto es un Integer: " + numero);
        Long numero2 = 2L;
        System.out.println("Esto es un Long: " + numero2);


        // Aritmeticos : ==> + - / * %
        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        System.out.println("--------------- Aritmeticos -------------------");
        System.out.println("-----------------------------------------------");

        int numero1 = 1;
        int numero3 = 2;

        int resultado1 = numero1 + numero3;
        System.out.println("La suma de: " + numero1 + " + " + numero3 + " es igual a: " + resultado1);
        int resultado2 = numero3 - numero1;
        System.out.println("La resta de: " + numero3 + " - " + numero1 + " es igual a: " + resultado2);
        int resultado3 = numero3 * numero1;
        System.out.println("La multiplicación de: " + numero3 + " * " + numero1 + " es igual a: " + resultado3);
        int resultado4 = numero3 / numero1;
        System.out.println("La división de: " + numero3 + " % " + numero1 + " es igual a: " + resultado4);

    }
}
