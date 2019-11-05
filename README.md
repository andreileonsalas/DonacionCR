# Donación CR

# Introducción

Este trabajo se realiza con la intención de aplicar nuevos conocimientos y fortalecer los ya aplicados anteriormente durante el curso. En él se genera una propuesta a la aplicación requerida para tener un control de las donaciones de sangre que se hacen en el Hospital San Juan de Dios[1].

La aplicación que se genera permite al usuario varias acciones entre las cuales destacan, insertar un donante y  visualizar listas basándose en diferentes métodos de clasificación de información[1].  La aplicación como tal, es desarrollada en Java; esta junto con las bases de datos PostgreSQL y MongoDB, contienen el sistema completo que hace funcionar de forma adecuada la propuesta. 

Dentro de la base de datos se mantiene información en dos "apartados". El primero engloba a los donadores. De ellos el Hospital San Juan de Dios mantiene un expediente que contiene información personal, llámese esta: nombre, cedula, tipo de sangre, fecha de nacimiento, etc. Además, este cuenta con un apartado donde se mantiene información referente a las enfermedades padecidas y los medicamentos que se han tomado para mitigar las mismas[1].

El otro apartado importante de la base de datos es un registro de las enfermedades y medicamentos que existen. Este es mantenido por el hospital junto con un registro de las donaciones, la cantidad de litros de sangre totales y estos clasificados por tipo[1].

# Ambiente de Desarrollo

Las herramientas usadas en el desarrollo de la aplicación son los siguientes:

## [Typora](enlace.com)

Typora es descrito por Abner Lee como un [2] editor de markdown minimalista que provee nuevas formas de leer y escribir markdown. Este es actualmente gratuito ya que se encuentra en fase de desarrollo. Esta abierto a que se hagan actualizaciones y se reporten problemas. 

Para el desarrollo de la asignación actual se utiliza esta aplicación ya que permite la introducción de una tabla de contenidos de forma automática. Además, cuenta con diferentes características que hacen que sea más comodo a la hora de realizar documentacion, de ellas se puede mencionar el hecho de que utiliza un formato similar al utilizado por Github y permite la inserción de HTML(no se contaba con esta en Dillinger).

## [Creately.io](https://creately.com/)

Creately es descrito por sus creadores como [3] la forma mas simple de trabajar de forma visual los diagramas previos a montar un trabajo. Este ofrece opciones para hacer diferentes tipos de diagramas y varias opciones para exportar los mismos. Ya que se permite la creación de diferentes modelos, también se encuentran diferentes formas y elementos , todo en mas de 50 librerías especializadas para diferentes tipos de diagramas.[3]
Dejando por un lado el hecho de que esta herramienta es muy intuitiva. También un aspecto importante es que, permite trabajo en equipo sin necesidad de estar presencialmente los integrantes juntos. En nuestro caso debido a la lejanía, este aspecto es algo que se tuvo en cuenta a la hora de escoger esta herramienta. Esta se uso en conjunto por medio de llamadas y mensajes  para acordar los elementos y distribución de los mismos.

## [pgAdmin4](https://www.pgadmin.org)

PgAdmin4 es la 4ta versión del Software Open Source dedicado a administración para PostgreSQL[6]. Está especialmente hecho para aquellas personas que no tienen una experiencia desde la terminal y para aquellas que quieren tener una mayor facilidad a la hora de generar y administrar una base de datos[6].
En cuanto al uso que se le dio a pgAdmin4 en el proceso de construcción de la base de datos que se llevó a cabo, se puede decir que fue utilizado ya en las etapas finales. Esto ya que el diagramado de la base de datos y el uso de otras herramientas consumió la mayor parte del tiempo. Pero, esta herramienta constituye una parte fundamental del trabajo completo ya que permite la creación de la base de datos como tal. En esta ocación fue especialmente util ya que desde la herramienta obtenemos una vista completa de los elementos que son introducidos desde la aplicación. Representando de esta forma, un excelente método de control sobre los procesos que se están llevando a cabo en determinado momento en la base de datos.

## [Drive](https://drive.google.com)

Drive es una herramienta que se utiliza para almacenar y compartir información. Esta se utiliza debido a que permite compartir y almacenar información. De esta forma se elimina el tener toda la información del trabajo de forma local. Además Drive permite tener cierto tipo de control de versiones, herramienta que resulta útil para recuperar información. Esta herramienta es útil a la hora de hacer documentación y mantener un control sobre los tiempos destinados a realizar el proyecto(bitácora).

## [NetBeans]( https://netbeans.org/ )



## [GitHub]( https://github.com/ )



## [MongoDB]( https://www.mongodb.com/ )



# Estructuras de Datos y Funciones Usadas

## Diagrama E-R 

- Atributo Compuesto

  Este tipo de atributo es único para cada ocurrencia, pero se compone de otros atributos, por ejemplo el nombre y apellidos de una persona.

- Relación

  Esta se da cuando existe cierta dependencia entre entidades. Por tanto cuando una entidad necesita conocer algo de otra se conectan entre ellas, lo que genera una relación.

- Entidad 

  Son los objetos con menor significado en una instancia. Estos tienen una existencia independiente, incluso se diferencian entre entidades del mismo tipo.

## Diagrama de Clases

- Herencia

  En el esquema las clases inferiores, adquieren los atributos de la clase principal. Se utiliza cuando varias clases necesitan los mismos atributos.

- Clase

  Las clases son la forma de representar objetos y sus cualidades, y funciones. Sobre ellas se especifica cual es el identificador y cuáles atributos son públicos, privados o protegidos.

- Atributos

  Los atributos son las cualidades que definen un objeto, estos pueden ser públicos, privados o protegidos.

- Métodos

  Los métodos son las acciones que se pueden realizar sobre los objetos, estas están definidas para cada objeto y se pueden diseñar para ser públicas, privadas o protegidas.

## Base de datos

En la base de datos se utilizan las siguientes tablas. En esta sección se explica el porqué de su uso y su necesidad dentro de la base de datos.

- Donador(Ejemplo): Esta se utiliza debido a la necesidad de tener dentro de la base de datos una estructura de fácil acceso que pueda ser usada para mantener la principal información del donante.

## Aplicación Java

En la aplicación implementada en Java se utilizaron las siguientes clases, estas fueron requeridas para que la base de datos tuviera una manera correcta de conectarse con la aplicación y viceversa. Además se notó la necesidad de implementarlas para un buen funcionamiento de la aplicación.

- Clases utilizadas de implementación propia se explica el por que se crearon.
- Clases utilizadas de 3ros solo se mencionan

## Mongo DB

En cuanto a Mongo DB se cree necesaria la implementación de documentos con la siguiente estructura:

- Identificación: Este es un aspecto importante de la base de datos, ya que es el identificador del documento dentro del sistema.
- Otros...

# Instrucciones para su Programa

Aquí irían las instrucciones para ejecutar el programa desde que se enciende la computadora. Abrir cualquier aplicación u otra acción debe ser especificada aquí.
