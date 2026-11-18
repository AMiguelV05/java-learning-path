import java.util.Scanner;

public class Ej01Temperatura {
    static final double CERO_ABSOLUTO = 213.15;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura en celsius a evaluar: ");
        double celsius = sc.nextDouble();

        double farenheitIncorrecto = 9 / 5 * celsius + 32; // Falla debido a que por defecto, la división entre enteros arroja entero
        double farenheitCorrecto = 9.0 / 5 * celsius + 32;

        System.out.printf("Resultado erroneo °F: %.2f %n", farenheitIncorrecto);
        System.out.printf("Resultado correcto °F: %.2f %n", farenheitCorrecto);
        System.out.printf("Resultado correcto K: %.2f %n", celsius + CERO_ABSOLUTO);

        sc.close();
    }
}


/* Respuestas a preguntas
    1. ¿Qué es System.in? ¿Es texto o bytes?
    En Java, System.in es un flujo de entrada estándar (InputStream) que lee bytes.

    2. ¿Qué trabajo hace Scanner para convertir lo que tecleas en un double?
    Lee los bytes desde System.in, convierte los bytes en caracteres y lo divide en tokens usando un delimitador
    (por defecto, cualquier espacio en blanco: espacios, tabuladores, saltos de línea)
    para separar la entrada en tokens de texto.
    Interpreta el token como número al llamar a nextDouble() usando un NumberFormat para interpretar el formato,
    intenta convertirlo a double utilizando Double.parseDouble(token). Al final, valida y lanza excepciones si falla.

    3. Con la fórmula mala, ¿por qué 0 °C da el resultado correcto (32.00)? ¿Qué te enseña eso sobre cómo elegir valores para probar tu código?
    La división (que es la que nos da problema al dar resultado entero) ya no tiene peso en la formula al ser multiplicada por cero.
    Para comprobar una solución, se deben tener múltiples casos de prueba que abarquen todos los posibles resultados.
*/
