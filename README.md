# 🧪 EDD – Prácticas 9 y 10: Pruebas con JUnit en Eclipse

> **Módulo:** Entornos de Desarrollo (EDD) · DAM 1º  
> **Contenido:** Testing unitario en Java usando **JUnit** desde **Eclipse IDE**

---

## 📋 Descripción

Este repositorio contiene el código fuente y los casos de prueba correspondientes a las **prácticas 9 y 10** del módulo de **Entornos de Desarrollo** del primer curso del Ciclo Formativo de Grado Superior en **Desarrollo de Aplicaciones Multiplataforma (DAM)**.

El objetivo principal de estas prácticas es aprender a **diseñar, implementar y ejecutar pruebas unitarias** sobre aplicaciones Java, utilizando el framework **JUnit** integrado en el entorno de desarrollo **Eclipse**.

---

## 🎯 Objetivos de aprendizaje

- Entender qué son las pruebas unitarias y para qué sirven.
- Conocer el ciclo de vida de un test: `@BeforeEach`, `@Test`, `@AfterEach`.
- Escribir aserciones con `assertEquals`, `assertTrue`, `assertThrows`, etc.
- Organizar los casos de prueba en clases de test separadas.
- Ejecutar las pruebas desde Eclipse y leer el informe de resultados (barra verde / roja).
- Detectar y corregir errores gracias a los mensajes de fallo de JUnit.

---

## 🛠️ Tecnologías y herramientas

| Herramienta | Versión recomendada |
|-------------|---------------------|
| Java (JDK)  | 17 o superior       |
| Eclipse IDE | 2023-06 o superior  |
| JUnit       | 5 (Jupiter)         |

---

## 🚀 Configuración del proyecto en Eclipse

### 1. Importar el proyecto

1. Abre **Eclipse IDE**.
2. Ve a **File → Import → General → Existing Projects into Workspace**.
3. Selecciona la carpeta raíz de este repositorio y pulsa **Finish**.

### 2. Añadir JUnit 5 al proyecto

1. Haz clic derecho sobre el proyecto en el **Package Explorer**.
2. Selecciona **Build Path → Add Libraries…**
3. Elige **JUnit** y selecciona **JUnit 5**, luego pulsa **Finish**.

> **Alternativa:** Si el proyecto ya incluye el archivo `pom.xml` (Maven) o `build.gradle` (Gradle), Eclipse gestionará las dependencias automáticamente al importar.

### 3. Ejecutar los tests

1. Haz clic derecho sobre la clase de test (o sobre el proyecto para ejecutar todos).
2. Selecciona **Run As → JUnit Test**.
3. La vista **JUnit** mostrará el resultado:
   - 🟢 **Barra verde** → todos los tests han pasado.
   - 🔴 **Barra roja** → al menos un test ha fallado; revisa el mensaje de error.

---

## 📁 Estructura del proyecto

```
EDD-DAM-1-PRACTICAS-9-Y-10/
├── src/
│   ├── main/          # Código fuente de la aplicación
│   │   └── java/
│   └── test/          # Clases de prueba (JUnit)
│       └── java/
└── README.md
```

> *La estructura exacta puede variar según cómo esté configurado el proyecto en Eclipse (proyecto Java estándar vs. proyecto Maven/Gradle).*

---

## ✍️ Convenciones de nomenclatura

- Las clases de producción siguen el estilo `NombreClase.java`.
- Las clases de test llevan el sufijo `Test`: `NombreClaseTest.java`.
- Cada método de test describe claramente lo que verifica:  
  `debeRetornarSumaCuandoLosDosOperandosSonPositivos()`.

---

## 📖 Recursos útiles

- [Documentación oficial de JUnit 5](https://junit.org/junit5/docs/current/user-guide/)
- [Guía de Eclipse para JUnit](https://www.eclipse.org/community/eclipse_newsletter/2017/october/article5.php)
- [Tutorial JUnit 5 – Baeldung (EN)](https://www.baeldung.com/junit-5)

---

## 👤 Autor

**Camilo Recchia**  
DAM 1º – Módulo Entornos de Desarrollo
