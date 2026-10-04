import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // https://github.com/JesusGonzalez7777/Practica-I-PracticaParadigmas.git

        List<Integer> numeros = List.of(10, 5, 8, 3, 15, 20, 7, 12, 4, 9);

        // 9.1 PROGRAMACIÓN ESTRUCTURADA

        System.out.println(" 9.1 PROGRAMACIÓN ESTRUCTURADA ");

        System.out.println("Ejercicio 1: Mostrar todos los números");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("\n");

        System.out.println("Ejercicio 2: Mostrar únicamente los números mayores que 10");
        for (int numero : numeros) {
            if (numero > 10) {
                System.out.print(numero + " ");
            }
        }
        System.out.println("\n");

        System.out.println("Ejercicio 3: Mostrar únicamente los números pares");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println("\n");

        System.out.println("Ejercicio 4: Mostrar únicamente los números impares");
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println("\n");

        System.out.println("Ejercicio 5: Multiplicar cada número por 2 y mostrar el resultado");
        for (int numero : numeros) {
            System.out.print((numero * 2) + " ");
        }
        System.out.println("\n");



        // 10. LAMBDAS Y STREAMS

        System.out.println(" LAMBDAS Y STREAMS ");

        // Ejercicio 6: Obtener una nueva colección que contenga únicamente los números mayores o iguales a 8
        List<Integer> mayoresOIgualesA8 = numeros.stream()
                .filter(n -> n >= 8)
                .collect(Collectors.toList());
        System.out.println("Ejercicio 6 (Mayores o iguales a 8): " + mayoresOIgualesA8);
        System.out.println("\n");

        // Ejercicio 7: Obtener una nueva colección con los números pares
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Ejercicio 7 (Números pares): \n" + pares);
        System.out.println("\n");

        // Ejercicio 8: Ordenar los números de menor a mayor
        List<Integer> ordenadosMenorAMayor = numeros.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Ejercicio 8 (Ordenados de menor a mayor): \n" + ordenadosMenorAMayor);
        System.out.println("\n");

        // Ejercicio 9: Ordenar los números de mayor a menor
        List<Integer> ordenadosMayorAMenor = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Ejercicio 9 (Ordenados de mayor a menor): \n" + ordenadosMayorAMenor);
        System.out.println("\n");

        // Ejercicio 10: Obtener el valor máximo de la lista
        int maximo = numeros.stream()
                .max(Integer::compareTo)
                .orElseThrow();
        System.out.println("Ejercicio 10 (Valor máximo): \n" + maximo);
        System.out.println("\n");

        // Ejercicio 11: Obtener el valor mínimo de la lista
        int minimo = numeros.stream()
                .min(Integer::compareTo)
                .orElseThrow();
        System.out.println("Ejercicio 11 (Valor mínimo): \n" + minimo);
        System.out.println("\n");

        // Ejercicio 12: Calcular la suma de todos los números
        int suma = numeros.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Ejercicio 12 (Suma total): \n" + suma);
        System.out.println("\n");

        // Ejercicio 13: Calcular el promedio de los números
        double promedio = numeros.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Ejercicio 13 (Promedio): \n" + promedio);
        System.out.println("\n");

        // Ejercicio 14: Contar cuántos números son mayores que 10
        long mayoresQue10 = numeros.stream()
                .filter(n -> n > 10)
                .count();
        System.out.println("Ejercicio 14 (Cantidad de números > 10): \n" + mayoresQue10);
        System.out.println("\n");

        // Ejercicio 15: Obtener una lista de números impares y ordenarla de menor a mayor
        List<Integer> imparesOrdenados = numeros.stream()
                .filter(n -> n % 2 != 0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Ejercicio 15 (Impares ordenados de menor a mayor): \n" + imparesOrdenados);
        System.out.println("\n");


    }


}