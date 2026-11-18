import java.util.Scanner;

public class Ej01Temperatura {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f_mal = 9 / 5 * c + 32; // Falla debido a que por defecto, la división arroja entero
        double f_bien = 9.0 / 5 * c + 32;
        System.out.printf("Resultado erroneo °F: %.2f %n", f_mal);
        System.out.printf("Resultado correcto °F: %.2f %n", f_bien);
        System.out.printf("Resultado correcto K: %.2f %n", c + 273.15);
        sc.close();
    }
}


/* Respuestas a preguntas
    1. ¿Qué es System.in? ¿Es texto o bytes?
    En Java, System.inn es un flujo de entrada estándar (InputStream) que lee bytes.

    2. ¿Qué trabajo hace Scanner para convertir lo que tecleas en un double?
    Lee los bytes desde System.in y lo divide en tokens usando un delimitador
    (por defecto, cualquier espacio en blanco: espacios, tabuladores, saltos de línea)
    para separar la entrada en tokens de texto.
    Interpreta el token como número al llamar a nextDouble() usando un NumberFormat para interpretar el formato,
    intenta convertirlo a double utilizando Double.parseDouble(token). Al final, valida y lanza excepciones si falla.
Ejemplo:
*/
