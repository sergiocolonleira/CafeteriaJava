# CafeteriaJava

Proyecto Java que simula el funcionamiento básico de una cafetería, permitiendo gestionar productos, clientes, camareros y tickets de compra.

## Funcionalidades

El proyecto permite:

- Crear productos de cafetería.

- Diferenciar entre bebidas y comidas.

- Asociar clientes y camareros a un ticket.

- Añadir productos a un ticket de compra.

- Calcular el importe de los productos.

- Aplicar descuentos a los productos.

- Mostrar por pantalla la información de un ticket.

## Requisitos

Para utilizar el proyecto es necesario disponer de:

- Java JDK 25.

- Apache Maven 3.9 o superior.

- Un IDE compatible con Java, como IntelliJ IDEA.

## Compilación

El proyecto utiliza Maven para gestionar la compilación y las dependencias.

Para compilar el proyecto desde una terminal con el Maven:

- mvn clean compile

También puede compilarse utilizando las herramientas de Maven integradas en IntelliJ IDEA.

## Ejecución

La aplicación puede ejecutarse desde la clase:

- src/Main.java

Desde IntelliJ IDEA se puede ejecutar directamente el método main de la clase Main.

Después de compilar el proyecto con Maven, también puede ejecutarse desde terminal mediante:

- java -cp target/classes Main

## Pruebas

El proyecto utiliza JUnit 5 para realizar pruebas unitarias.

Las pruebas se encuentran en la carpeta:

- test/

Para ejecutar las pruebas con Maven:

- mvn test

También pueden ejecutarse desde el panel Maven de IntelliJ IDEA mediante:

- Lifecycle → test

## Documentación

Las clases y métodos públicos del proyecto estan documentados utilizando Javadoc.

La documentación HTML generada se encuentra en:

- docs/

## Estructura del proyecto

CafeteriaJava/ --> src/ --> test/ --> docs/ --> .gitignore --> pom.xml --> README.md

## Tecnologías utilizadas

- Java 25

- Maven

- JUnit 5

- Git

- GitHub

- IntelliJ IDEA

## Autor

Sergio Colón Leira

## Licencia

Este proyecto se distribuye bajo la licencia MIT.