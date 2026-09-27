# Kata 4 - Visualización de Histogramas con JFreeChart

## Descripción

Esta práctica amplía la kata anterior para incorporar la visualización gráfica de los datos mediante la biblioteca JFreeChart.

Se ha integrado una capa de presentación independiente de la lógica de negocio, permitiendo representar visualmente los histogramas generados en memoria. Además, se ha utilizado Maven para la gestión de dependencias y se ha mantenido una clara separación entre las distintas capas del proyecto.

---

## Estructura del proyecto

```
src/main/java
├── app
│   └── Main.java
├── io
│   ├── CSVSongParser.java
│   ├── CSVSongReader.java
│   ├── SongParser.java
│   └── SongReader.java
├── model
│   └── Song.java
├── tasks
│   └── HistogramBuilder.java
├── view
│   └── MainFrame.java
└── viewmodel
    └── Histogram.java
```

---

## Objetivos de la práctica

- Incorporar la visualización gráfica de los datos mediante JFreeChart.
- Integrar una capa de presentación separada de la lógica del programa.
- Utilizar Maven para la gestión de dependencias.
- Mantener una arquitectura organizada y modular.
- Representar gráficamente los histogramas generados en memoria.
- Mantener una clara separación entre modelos, lógica y presentación.

---

## Clases del proyecto

### Main.java
Punto de entrada de la aplicación.

### Song.java
Clase inmutable que representa una canción y sus atributos.

### SongReader.java
Interfaz que define la lectura de canciones.

### CSVSongReader.java
Clase encargada de leer el archivo CSV.

### SongParser.java
Interfaz que define cómo convertir una línea del archivo en un objeto `Song`.

### CSVSongParser.java
Clase encargada de transformar cada línea del CSV en un objeto `Song`.

### HistogramBuilder.java
Clase encargada de generar histogramas en memoria a partir de una colección de objetos y del atributo seleccionado.

### Histogram.java
Clase view model que almacena los valores y las frecuencias observadas en el histograma.

### MainFrame.java
Clase responsable de la interfaz gráfica y de la representación visual del histograma mediante JFreeChart.

---

## Uso de Git

Se han realizado commits durante el desarrollo para registrar los cambios del proyecto y facilitar el seguimiento de la práctica.


---

## Nota

Esta práctica forma parte del aprendizaje sobre visualización de datos y arquitectura por capas. Se ha mantenido una separación clara entre el modelo de datos, la lógica de procesamiento y la representación gráfica.
