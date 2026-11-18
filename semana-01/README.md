# Semana 1 · Java desde C++ y Python

📘 **Antes de empezar:** lee la Clase 1 (artifact) o abre `../clases/clase-01-java-desde-cpp-y-python.html`, y haz el quiz.

## Reglas del juego
- **Escribe tú el código.** Nada de pedirle a una IA que lo genere: el objetivo es que tus dedos aprendan Java.
- Antes de ejecutar algo, **predice la salida** en un comentario. Equivocarse en la predicción es justo donde se aprende.
- Un archivo por ejercicio dentro de `semana-01/` (por ejemplo `Ej01Temperatura.java`).
- Un commit por ejercicio: `git commit -m "feat(semana-01): ejercicio 1 temperatura"`.
- Cuando termines (o te atores más de 25 min), dime "revisa el ejercicio N". Lo reviso como en un code review de empresa.

---

## Ejercicio 0 · Preparar tu entorno (≈30 min)
1. Instala el **JDK 25** (LTS). Cualquiera de estas dos opciones sirve:
   - Oracle JDK 25: https://www.oracle.com/java/technologies/downloads/
   - Eclipse Temurin 25 (OpenJDK): https://adoptium.net/
2. Abre una terminal **nueva** y verifica que ambos digan 25:
   ```
   java -version
   javac -version
   ```
   Si `java -version` sigue diciendo 1.8, el Java viejo está antes en el `PATH`. Dímelo y lo arreglamos juntos.
3. Instala **IntelliJ IDEA** (la edición gratuita): https://www.jetbrains.com/idea/
4. Inicializa el repositorio en la carpeta `Aprendiendo Java` (`git init`), crea un repo en GitHub y conéctalo.
5. Escribe `Hola.java` (el de la clase) **en el Bloc de notas o VS Code, no en IntelliJ**, y ejecútalo desde la terminal de las dos formas:
   ```
   javac Hola.java
   java Hola
   ```
   y luego `java Hola.java`. Revisa qué archivo nuevo apareció en la carpeta. Desde el ejercicio 1 ya puedes usar IntelliJ.

---

## Ejercicio 1 · Conversor de temperatura (tipos, `Scanner`, división)
Lee una temperatura en °C desde el teclado e imprime su equivalente en °F y en K con 2 decimales.

```
Temperatura en °C: 36.6
36.60 °C = 97.88 °F = 309.75 K
```
- Usa `Scanner` para leer y `System.out.printf("%.2f", x)` para el formato.
- **Experimento:** escribe la fórmula como `9 / 5 * c + 32` y luego como `9.0 / 5 * c + 32`. Explica en un comentario por qué dan resultados distintos.

## Ejercicio 2 · Estadísticas de un sensor (arreglos, ciclos)
El usuario ingresa **N** y luego N lecturas de temperatura (`double`). Imprime:
- mínimo, máximo y promedio
- cuántas lecturas superan un umbral (otro número que ingresa el usuario)
- el **índice** de la primera lectura que superó el umbral, o `-1` si ninguna lo superó

```
¿Cuántas lecturas? 5
22.5 23.1 30.4 24.0 31.2
Umbral: 30
Min: 22.50 | Max: 31.20 | Prom: 26.24
Lecturas sobre el umbral: 2 (primera en índice 2)
```
- Guarda las lecturas en un `double[]`. **No uses** `ArrayList` todavía.
- Pon el cálculo en métodos `static`: `min(double[])`, `max(double[])`, `promedio(double[])`.

## Ejercicio 3 · Laboratorio de Strings (`String`, `StringBuilder`, `equals`)
Escribe estos métodos y pruébalos desde `main`:
1. `static String invertir(String s)`, usando `StringBuilder`.
2. `static boolean esPalindromo(String s)`, ignorando mayúsculas y espacios ("Anita lava la tina" → `true`).
3. `static int contarVocales(String s)`.
4. **Experimento `==`:** en `main` crea `String a = "hola";`, `String b = "hola";` y `String c = new String("hola");`. Imprime `a == b`, `a == c` y `a.equals(c)`. Predice antes de ejecutar. ¿Por qué `a == b` da `true`? (Pista: investiga el *String pool*.)

## Ejercicio 4 · Métodos y desbordamiento (`int` vs `long`)
1. `static boolean esPrimo(int n)`
2. `static int mcd(int a, int b)`: algoritmo de Euclides, primero iterativo y luego recursivo.
3. `static int factorialInt(int n)` y `static long factorialLong(int n)`. Imprime ambos para n = 1…21.
   - ¿En qué `n` falla el `int`? ¿Y el `long`? Escribe tu explicación en un comentario.
   - Bonus: busca `Math.multiplyExact` y úsalo para que el programa **avise** del desbordamiento en vez de dar un número equivocado.

## Ejercicio 5 · Tu primer problema de entrevista: *Two Sum*
Dado un arreglo de enteros `nums` y un entero `objetivo`, regresa los **índices** de los dos números que suman `objetivo`. Siempre hay exactamente una solución.

```java
static int[] twoSum(int[] nums, int objetivo)
// twoSum(new int[]{2, 7, 11, 15}, 9)  →  [0, 1]
// twoSum(new int[]{3, 2, 4}, 6)       →  [1, 2]
```
- Resuélvelo con dos ciclos anidados (O(n²)). Imprime el resultado con `Arrays.toString(...)`.
- En un comentario responde: ¿cuál es la complejidad en tiempo y en espacio? ¿Se te ocurre una forma de hacerlo en O(n)? (La veremos en la semana 3 con `HashMap`.)
- Después súbelo a LeetCode (problema #1) en Java y ve si pasa.

---

## ✅ Checklist de la semana
- [ ] Clase 1 leída y quiz hecho
- [ ] JDK 25 + IntelliJ instalados
- [ ] Repo en GitHub con un commit por ejercicio
- [ ] Ejercicios 1–5
- [ ] Mándame tu usuario de GitHub para revisar tus repos y tu perfil
