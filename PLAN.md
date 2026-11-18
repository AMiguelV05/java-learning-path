# Plan de aprendizaje: Java → prácticas profesionales

**Inicio:** 17 nov 2026 · **Meta:** entrar a prácticas ~marzo 2027 · **Ritmo:** ~2 h/día, lunes a sábado

## La idea en una frase

Mientras las empresas revisan tu solicitud (dic–feb), aprendes Java, practicas los problemas que te van a poner en las entrevistas y construyes **un proyecto real** que une lo que te gusta: IoT, nube y datos.

## Regla de oro: primero a mano, luego la herramienta

Antes de usar cualquier herramienta que haga "magia", la construyes en versión mini, a mano, para entender qué hace por dentro. Cada clase trae una sección **"Bajo el capó"**.

| Antes de usar… | …construyes a mano |
|---|---|
| `ArrayList` / `HashMap` | Tu propia lista dinámica y tu tabla hash |
| Spring Boot (servidor web) | Un servidor HTTP mínimo con `ServerSocket`: lees el request a mano y escribes la respuesta |
| Inyección de dependencias de Spring | Conectas tus objetos a mano en `main` y ves el problema que Spring resuelve |
| JPA / Hibernate | SQL directo con JDBC: conexión, `PreparedStatement`, transacciones |
| Docker | Corres la app "a pelo" en una VM Linux y ves todo lo que Docker te ahorra |
| MQTT / HTTP desde el ESP32 | Lees el tráfico con Wireshark/curl para ver los bytes reales |

Al final debes poder contestar en una entrevista **"¿y eso cómo funciona por dentro?"** de cualquier cosa que hayas usado. Usar IA no está prohibido, pero en este plan **primero lo entiendes y después la usas**.

## Rutina diaria (2 h)

| Bloque | Tiempo | Qué haces |
|---|---|---|
| 🧠 Algoritmos | 30 min | Un problema de estructuras de datos en Java (a partir de la semana 2) |
| 📘 Tema / clase | 30–45 min | Lees la clase interactiva del tema y tomas apuntes |
| 🛠️ Práctica | 45–60 min | Ejercicios cortos del tema o avance del proyecto |
| **Sábado** | 2 h | Avance del proyecto grande + revisión de código conmigo |

## El proyecto grande: **Telemetría IoT**

Un sistema que recibe lecturas de sensores (temperatura, humedad, etc.), las guarda, detecta valores raros y las muestra. Crece contigo durante todo el plan:

1. **v0.1:** app de consola en Java puro (modelo de clases, POO)
2. **v0.2:** colecciones, streams, lectura/escritura de archivos CSV, pruebas con JUnit
3. **v0.3:** API REST con Spring Boot
4. **v0.4:** base de datos (PostgreSQL u Oracle Database Free)
5. **v0.5:** Docker + GitHub Actions (CI)
6. **v0.6:** despliegue en **Oracle Cloud Free Tier** (sí, de Oracle, a propósito 😉)
7. **v1.0:** un **ESP32 real** enviando datos a tu API + detección de anomalías

Al final tienes en GitHub un proyecto que puedes explicar de punta a punta en una entrevista: hardware, backend, base de datos, contenedores y nube.

---

## Fases

### Fase 1 · Java desde C++ y Python (semanas 1–2)
| Semana | Fechas | Temas | Entregable |
|---|---|---|---|
| 1 | 16–21 nov | Instalar JDK 25 + IntelliJ, JVM/JDK/JRE, tipos, `String`, control de flujo, métodos, arreglos, `Scanner` | Ejercicios semana 1 |
| 2 | 23–28 nov | **POO:** clases, encapsulamiento, constructores, `static`, herencia, interfaces, polimorfismo, `record`, `enum` | Telemetría v0.1 (modelo de clases) |

### Fase 2 · Java "de empresa" (semanas 3–5)
| Semana | Fechas | Temas | Entregable |
|---|---|---|---|
| 3 | 30 nov–5 dic | Excepciones, genéricos, colecciones (`List`, `Map`, `Set`, `Deque`) | Ejercicios + v0.1 terminada |
| 4 | 7–12 dic | Lambdas, Streams, `Optional`, archivos (NIO) | Telemetría v0.2 |
| 5 | 14–19 dic | Maven, JUnit 5, Git en equipo (ramas, PR, rebase, conventional commits) | v0.2 con pruebas y ramas |

### Fase 3 · Entrevistas técnicas (semanas 6–7, temporada de fiestas: más ligero)
| Semana | Fechas | Temas |
|---|---|---|
| 6 | 21–26 dic | Patrones de algoritmos: two pointers, sliding window, hash maps, pilas |
| 7 | 28 dic–2 ene | Árboles, grafos (BFS/DFS), recursión, Big-O; simulacro de entrevista en inglés |

### Fase 4 · Backend con Spring Boot (semanas 8–11)
| Semana | Fechas | Temas | Entregable |
|---|---|---|---|
| 8 | 4–9 ene | HTTP, REST, Spring Boot, inyección de dependencias | v0.3: primeros endpoints |
| 9 | 11–16 ene | Validación, manejo de errores, capas (controller/service/repository) | v0.3 completa |
| 10 | 18–23 ene | SQL, JPA/Hibernate, PostgreSQL / Oracle DB Free | v0.4 |
| 11 | 25–30 ene | Pruebas de integración, documentación con OpenAPI/Swagger | v0.4 con pruebas |

### Fase 5 · Nube e IoT (semanas 12–14)
| Semana | Fechas | Temas | Entregable |
|---|---|---|---|
| 12 | 1–6 feb | Docker, docker-compose, GitHub Actions | v0.5 |
| 13 | 8–13 feb | Oracle Cloud Free Tier: VM, redes, despliegue | v0.6 en línea |
| 14 | 15–20 feb | ESP32 → HTTP/MQTT → tu API | v1.0 con hardware |

### Fase 6 · Pulir y destacar (semanas 15–16)
| Semana | Fechas | Temas |
|---|---|---|
| 15 | 22–27 feb | Concurrencia básica (hilos, `ExecutorService`), detección de anomalías, README profesional |
| 16 | 1–6 mar | Revisión de CV y GitHub, simulacros de entrevista (técnica + conductual en inglés) |

---

## Carril de algoritmos (30 min diarios desde la semana 2)
- 1 problema por día en LeetCode o NeetCode, **siempre en Java**.
- Orden: arreglos y hashing → two pointers → sliding window → pila → búsqueda binaria → listas ligadas → árboles → grafos → programación dinámica básica.
- Si en 25 min no sale, ves la solución, la entiendes y **la vuelves a escribir sin verla al día siguiente**.

## Progreso
- [ ] Semana 1: Clase 1 leída · JDK instalado · ejercicios semana 1
