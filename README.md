# DonaciónCR

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

PgAdmin4 es la 4ta versión del Software Open Source dedicado a administración para PostgreSQL[4]. Está especialmente hecho para aquellas personas que no tienen una experiencia desde la terminal y para aquellas que quieren tener una mayor facilidad a la hora de generar y administrar una base de datos[4].
En cuanto al uso que se le dio a pgAdmin4 en el proceso de construcción de la base de datos que se llevó a cabo, se puede decir que fue utilizado ya en las etapas finales. Esto ya que el diagramado de la base de datos y el uso de otras herramientas consumió la mayor parte del tiempo. Pero, esta herramienta constituye una parte fundamental del trabajo completo ya que permite la creación de la base de datos como tal. En esta ocación fue especialmente util ya que desde la herramienta obtenemos una vista completa de los elementos que son introducidos desde la aplicación. Representando de esta forma, un excelente método de control sobre los procesos que se están llevando a cabo en determinado momento en la base de datos.

## [Drive](https://drive.google.com)

Drive es una herramienta que se utiliza para almacenar y compartir información. Esta se utiliza debido a que permite compartir y almacenar información. De esta forma se elimina el tener toda la información del trabajo de forma local. Además Drive permite tener cierto tipo de control de versiones, herramienta que resulta útil para recuperar información. Esta herramienta es útil a la hora de hacer documentación y mantener un control sobre los tiempos destinados a realizar el proyecto(bitácora).

## [NetBeans]( https://netbeans.org/ )

NetBeans [5] es descrito como un ambiente integrado de desarrollo para aplicaciones en Windows, Mac, Linux y Solaris. Este simplifica el desarrollo web, para empresas y de escritorio, junto con otras aplicaciones que usan Java y HTML 5 como plataforma.  Además NetBeans tiene la facilidad de que se puede trabajar  y hacer updates a GitHub lo que permite que el código sea compartido por diferentes miembros del equipo. Sin que estos necesiten estar presentes.

En el caso del desarrollo del presente proyecto, este se utiliza debido a la facilidad que ofrece este entorno de desarrollo, tanto para aplicaciones de escritorio, como la conectividad que tiene con GitHub. Características importantes para el desarrollo del mismo ya que todo el desarrollo de la interfaz de la aplicación, es hecho directamente en el IDE. Para finalizar, este entorno de desarrollo permite trabajar tanto la parte gráfica como la parte programada, aspecto a destacar ya que como se implementa un modelo Vista-Controlador, es preferible realizar el desarrollo de todo este dentro del mismo IDE.

## [GitHub]( https://github.com/ )

GitHub es un sistema de control de versiones que se encuentra en la red[6]. Sobre este sistema se monta una "red social" en la que se puede compartir código y trabajar sobre el mismo entre diferentes personas. Además permite a los usuarios del mismo hacer updates/upgrades a los proyectos que se encuentren en la plataforma. GitHub trabaja mediante git, obteniendo las funciones principales del mismo, con lo que se puede llamar a este un Sistema de Control de Versiones [6]. 

En el desarrollo del proyecto actual, es un aspecto a destacar debido a que permite que los desarrolladores del mismo, compartan el mismo código. Además tiene conectividad con NetBeans, lo que facilita el desarrollo y control del avance del proyecto. Otra de las ventajas que trae GitHub respecto al control de versiones es que permite hacer actualizaciones del código, y en caso de haber conflictos permite a la persona que los encuentra, que los solucione antes de hacer el update. La última ventaja de la que se saca partido, es el que se encuentre en la nube y sea accesible desde diferentes puntos, este aspecto simplifica el hecho de tener que reunirse en equipo para hacer una actualización.

## [AWS RDS]( https://aws.amazon.com/es/rds/ )

Esta, segun la descripción brindada en su sitio web, es un sistema que emula varias bases de datos relacionales[7]. En el caso de uso de este proyecto es usado para simular Postgres 10 y mantener la base de datos en la Nube. Además [7]este servicio suministra capacidad para automatizar tareas que en servicios locales llevaría mas tiempo. Entre otras de sus cualidades destacan: un acceso a la administración de los datos que se encuentran en ella de una forma sencilla, permite generar réplicas de la base de datos por medio de llamadas a la API, tiene un alto nivel de fiabilidad ya que replica los datos en varias instancias dentro de una zona de disponibilidad distinta, es segura, rápida y asequible[7].

Para la realización del presente proyecto, se utiliza esta instancia de la base de datos ya que permite un acceso del mismo modo que se haría hacia una base de datos local.  También se piensa en que a futuro esta base de datos tiene que ser puesta en algún servicio que permita fiabilidad y rapidez a la hora de hacer consultas desde aplicaciones en diferentes locaciones. Por último, se cree necesario para el desarrollo de la base de datos y la aplicación, que los integrantes del proyecto tengan una versión actualizada de los datos y funciones que se realizan dentro de la base de datos y este es un excelente método para que ello ocurra.

## [MongoDB Compass](https://www.mongodb.com/products/compass)

MongoDB Compass es una herramienta para manejar, administrar y conectar isntancias de mongoDB ya sean locales o en la nube[8]. Se utiliza para poder guardar y manejar la información personal de los donadores.

## [MongoDB Atlas](https://www.mongodb.com/cloud/atlas)

MongoDB Atlas es un servicio en la nube, que [9]permite crear de manera sumamente fácil un cluster de MongoDB. Se utiliza ya que su paquete gratuito permite tener una instancia facilmente manejable en la nube, y asá poder accederla de forma simultánea mientras se trabaja. 

## [Dataedo](https://dataedo.com/education-licenses)

Dataedo es una herramienta para crear documentacion de bases de datos, cuya función más interesante es la de crear un diccionario de base de datos[10]. Se utilizo esta herramienta ya que facilita crear un diccionario de calidad empresarial, ademas de poder conectarse no solo a postgresql, sino tambien a otros tipos de bases de datos. Se utilizo ya que la licencia de estudiantes se podia utilizar por un año y podiamos utilizar todas sus funciones.

# Estructuras de Datos y Funciones Usadas

## Diagrama E-R 

- Atributo 

  Este se puede describir como una característica de una entidad.

- Atributo Compuesto

  Este tipo de atributo es único para cada ocurrencia, pero se compone de otros atributos, por ejemplo el nombre y apellidos de una persona.

- Relación

  Esta se da cuando existe cierta dependencia entre entidades. Por tanto cuando una entidad necesita conocer algo de otra se conectan entre ellas, lo que genera una relación.

- Entidad 

  Son los objetos con menor significado en una instancia. Estos tienen una existencia independiente, incluso se diferencian entre entidades del mismo tipo.

## Base de datos

En la base de datos se utilizan las siguientes tablas. En esta sección se explica el porqué de su uso y su necesidad dentro de la base de datos.

- Donador: Esta se utiliza debido a la necesidad de tener dentro de la base de datos una estructura de fácil acceso que pueda ser usada para mantener la principal información del donante.
- Registro_Donacion: En la base de datos se registra una entrada en esta tabla cada vez que se realiza una donación de sangre por parte de algún donador. Esta tabla permite hacer un recuento de la cantidad de sangre total que se encuentra en el banco de sangre, así como hacer diferentes tipos de consultas, las cuales permiten obtener información valiosa para la empresa.
- Registro_medicamentos: En esta sección de la base de datos se lleva un registro de todos los medicamentos que consume cada persona, incluye los principales detalles de consumo del mismo por parte de la persona. 
- Medicamento: Ya que se menciona la tabla anterior como una relación entre los medicamentos y los donantes. La tabla medicamentos viene a contener toda la información referente a cada medicamento.
- Registro_enfermedades: Aquí se almacena la información correspondiente a las enfermedades que han sufrido los donadores, en que año tuvieron la misma y en que medida se presentó en dicho caso. Este es necesario para tener un control de las personas que llegan a donar y tienen en su historial alguna enfermedad.
- Enfermedad: Esta tabla guarda toda la información perteneciente a una enfermedad, es la que permite que se haga una relación entre estas y los donantes. 

Además de lo anteriormente mencionado se pueden destacar una función almacenada y un trigger los cuales son de suma importancia ya que a la hora de hacer consultas sobre la base de datos se requiere que esta esté siempre actualizada. 

-  **Trigger**: trig_actlitros : Este fue implementado ante la necesidad de que se actualizara la cantidad de litros que ha donado una persona, pertenece a la tabla Registro_Donacion y se ejecuta una vez se inserta un elemento en esta tabla. Es el encargado de llamar a la/el funcion/proceso almacenado/a " fn_actlitros() ", el cual se encarga de actualizar el campo de la tabla respectiva.
-  **Proceso Almacenado**: fn_actlitros() : Esta función u proceso, trabaja sobre las tablas Registro_Donacion y Donador. En la primera es llamada cada vez que se hace una inserción en dicha tabla. Su proceso es sencillo, para la persona que se hace una nueva donación, se hace una suma de todas las cantidades donadas previamente y se incluye la cantidad actual. Este resultado se actualiza en la tabla Donador, donde se mantiene actualizada la cantidad de litros de sangre donada por cada persona.  

Además existen consultas que son hechas desde la aplicación en java por medio de una conexión con la base de datos.

## Aplicación Java

En la aplicación implementada en Java se utilizan las siguientes clases, estas son requeridas para que la base de datos tenga una manera correcta de conectarse con la aplicación y viceversa. Esta, en sí misma, se implementa haciendo uso de NetBeans utilizando un Modelo Vista-Controlador el cual se encarga de ejecutar de manera correcta la conexión, ya sea con una base de datos almacenada en línea, o una base de datos local. Además, se encarga de llevar la información desde la base de datos y mostrarla de una manera amigable al usuario. Las principales clases que se utilizan se explican a continuación. 

- Vistas
  Se ve la necesidad de crear varias vistas para hacer el ambiente mas amigable con el usuario, esto ya que los tamaños de todas no coinciden (ya que realizan diferentes tareas). 

   Dentro de la aplicación existe una vista principal, la cual da acceso a las diferentes funciones que tiene la aplicación. Estas funciones van, desde simples consultas, como puede ser la cantidad de litros de sangre que existen en el banco de sangre o los donantes que han sido registrados. Hasta realizar inserciones en la base de datos, lo cual requiere más cuidado, pero se logra optimizar para que sea sencillo el proceso.

  Las vistas en general se comunican por medio de mensajes con el controlador, encargado de que se muestre siempre una vista al usuario y que las funciones se ejecuten para desplegar la información correspondiente en pantalla.

- Controlador
  El controlador es una parte importante del modelo utilizado para hacer la aplicación ya que se encarga de, como su nombre lo indica, ser el centro de control de todo lo que ocurre en la aplicación. 

  Más a profundidad, es el encargado de mostrar las vistas correspondientes a las acciones realizadas por el usuario en cada una de ellas. Además, tiene la responsabilidad de pasar mediante mensajes la información necesaria al modelo, para que este realice las operaciones solicitadas desde la vista de la aplicación. Finalmente, se encarga de utilizar la información/resultados obtenidos por el modelo, en la vista. Dando al usuario una respuesta rápida a sus requerimientos.

- Modelo

  El modelo de la aplicación es el encargado de realizar las consultas a la base de datos y mostrar los resultados de estas al usuario, mediante el controlador y finalmente la vista. Este recibe mensajes del controlador y ejecuta las funciones que se encuentran dentro de el las cuales permiten que se lleven a cabo acciones dentro de la aplicación.

  Algunas de las funciones mas importantes del modelo de la aplicación son las consultas que se hacen a la base de datos. Java permite ejecutar código SQL desde la aplicación, haciendo consultas a una base de datos a la que se conecta cada vez que se hace una operación. En este caso obteniendo una respuesta adecuada a lo solicitado.

  También, es importante mencionar que desde el modelo se hacen inserciones en la base de datos, del mismo modo que se hace con las consultas, se ejecuta el código SQL necesario para hacer la inserción dentro de la base de datos. La diferencia en este caso es que no se obtiene información de la base de datos sino solo una confirmación o fallo al ingresar la información.

## Mongo DB

En cuanto a Mongo DB se cree necesaria la implementación de un documento Jason que mantiene todos los campos correspondientes a la informacion personal del donante. Esta se relaciona por medio de la identificacion con la base de datos en Postgres y a su vez con la aplicación en Java, lo que permite hacer consultas cruzadas a través de las bases de datos en conjunto. 

# Instrucciones para su Programa

- El primer paso a seguir es definir donde se va a encontrar la base de datos a la que se va a conectar la aplicación. Esta se define dentro de la misma donde se encuentran las constantes.

  - Una posibilidad es que la base de datos se encuentre de manera local, de este modo lo que habría que hacer es restaurar la base de datos en pg admin, con el archivo sql que se encuentra en la carpeta de la entrega

  - La otra posibilidad es que la base de datos se encuentre en una instancia de postgres 10 en la nube, actualmente se escogió Aws, pero a futuro se puede escoger cualquier servicio que sea compatible. 

- Para poner en línea la base de datos se procede de la misma manera que en la instancia local, con la condición, de que tiene que acceder al servicio escogido y crear una instancia que permita acceder a la base de datos por medio de una dirección URL.
- Una vez montada la base de datos, se procede a descomprimir la carpeta que contiene el proyecto en netbeans con la aplicacion escrita en Java. Esta debe ser abierta y configurada en el archivo de constantes donde se encuentra un string correspondiente a la dirección a la que se va a conectar la app para obtener información de la base de datos.
- Una vez hecho esto se puede correr la app, la cual va a tener acceso a la informacion almacenada en la base de datos

# Comentarios Finales del Proyecto

- El uso de una base de datos conectado a un sistema que permita el uso/manejo de la misma, por cualquier persona, lleva la ingeniería en computación a un campo donde las personas pueden decir que esta es útil. De modo que ya no solo las personas especializadas en bases de datos tienen acceso a la información, sino que cualquier persona con acceso a una computadora con la aplicación puede hacer consultas y obtener información valiosa contenida dentro de la base de datos.

- También cabe resaltar que la carrera en si no solo beneficia campos de estudio e investigación , sino que como se ha visto en ambos proyectos, tiene un gran impacto social en como se hacen diariamente las actividades de todas las personas independientemente del área en el que se desenvuelvan. 

  Este proyecto, le fué mostrado a varias personas del área de medicina y se recibieron buenos comentarios e incentivos a continuar con su desarrollo.  Ya que desde ese punto de vista, lo consideran un gran avance en el control de todos los activos de este tipo que se tienen.

- En cuanto a la parte técnica del proyecto, tiende a requerir más tiempo de investigación ya que ninguno de los integrantes había hecho una conexión Java, Postgres, Mongo. Además de la utilización de la instanciación para Postgres en la nube, se puede mejorar bastante el rendimiento de la base de datos y la aplicación ya que ambas dejan de necesitar estar corriendo en el mismo ordenador.

- Por ultimo, se llega a pensar que este proyecto mas que a nivel universitario, tiene un punto de vista aplicativo hacia la realidad nacional. 

  Ya que actualmente no se cuenta con tecnología suficiente para llevar a cabo un sistema de base de datos elaborado para ciertos controles. Otros mas sencillos, como puede ser un registro de las donaciones hechas en un país, si son metodos implementables. Por lo que se piensa que la proyección de este sistema es bastante amplia. 

# Conclusiones y Recomendaciones del Proyecto

## Conclusiones

- El uso de triggers y procedimientos almacenados es tanto necesario, como útil a la hora de hacer operaciones en una base de datos. Esto ya que permiten ejecutar acciones ligadas a las que se introducen manualmente, ya sea desde la linea de comandos o algún motor de bases de datos. 

  Además, estos permiten automatizar procesos, que, de otro modo llevarían muchas lineas de código y sentencias repetidas. U obtener resultados de forma más rápida y eficiente que lo que normalmete le llevaría a un DBA hacerlo.

- La implementación de una aplicación ligada a la base de datos es necesaria cuando esta está enfocada a mantener información de uso diario. Ya sea por personas que conocen de la estructura de la base de datos, como de personas que solo van a hacer uso de los datos que se encuentran dentro de la misma. 
  Este uso de la base de datos no es necesario cuando la informacion que se maneja es solo para cierto tipo de uso donde la información almacenada no debe ser de conocimiento público. Pero en el caso de la presente asignación se requiere del uso obligatorio de la misma ya que los usuarios finales son personas sin conocimiento de bases de datos. 

- El uso de la nube es posible, y no solo en cuanto a mantener la base de datos almacenada ahí, sino en el uso diario y comunicacion de los equipos de trabajo. Actualmente se utilizan diferentes medios que sirven como métodos de almacenamiento de información en línea que permiten que toda la información que maneja el equipo completo, esté coordinada y se mantenga siempre actualizada.  Se pueden nombrar entre los utilizados, GitHub, Drive y AWS. Además, como punto extra se resalta la comunicación entre los miembros del equipo, debido a que no todos dentro del mismo cuentan con el mismo nivel de experiencia en ciertos campos. Y algunas veces se vuelve necesario que uno u otro de los miembros ponga al tanto, al resto de lo que se está realizando. 

- Al utilizar la nube, se pudo trabajar al mismo tiempo, casi como si fuese una web application. Se puede incluso hacer trabajo de control de calidad mientras se desarrolla. Ademas de que se podria de este modo, hacer un tipo de selector para lanzar la instancia en modo prueba, control de calidad o ya en produccion, con solo cambiar un parametro a la hora de lanzarlo, y asi conectarse a diferentes instancias en la nube sin tener que cambiar el codigo fuente cada vez que se necesita, facilitando el trabajo a gran escala

- Para un MVC, seria mejor utilizar un enfoque web, ya que al menos java como aplicacion se quedo casi obsoleto, ya que intentar correr la aplicacion de java en los exploradores mas usados, no es posible o es muy complicado.



## Recomendaciones

- Con base en las experiencias vividas durante la realización del presente proyecto, se recomienda a las personas que deseen realizar aplicaciones en conjunto con bases de datos el uso intensivo de procedimientos almacenados, ya que a pesar de estos implicar un poco mas de trabajo a nivel de base de datos. Lleva una recompensa mayor,  y es que a la hora de realizar la aplicación ligada a la base de datos como tal, no tiene que preocuparse por sentencias SQL. Sino que llama a dichas funciones/procesos almacenados que ya se encuentran dentro de la base de datos y que van a arrojar el resultado que probabelmente se busca y necesita. 

  Además los triggers, los cuales no necesitan estar asociados a una aplicacion como tal sino que ellos funcionan bajo instrucciones, movimientos y otros en la base de datos. Se vuelven bastante útiles a la hora de hacer operaciones  repetitivas y que de otro modo llevarían un tiempo de realizacion mucho mayor.

- Las validaciones serian mas faciles utilizando REGEX via html y javascript, que las validaciones a pie que se hacen en un java application. 

- Para trabajo futuro, seria mejor utilizar java como back end de logica, y utilizar web tipo jsp para el front end, para tener una separacion mas semantica del MVC. 

- Para implementar MongoDB en conjunto con PostgreSQL, es mejor hacerlo desde el principio, ya que para poder implementarlo mas tarde, se ocuparia redisenar gran parte de las funciones ya creadas para poder jalar la informacion de ambas fuentes en vez de solamente una.

- Para el manejo de errores, seria mejor tener un mapa de int / strings, para poder asociar los codigos de error que devuelve la base de datos, y mostrar un error customizado mas significativo, en vez de dejar que el sistema se encarge de mostrar el error.

- Para ejecucion de sentencias sql, es mejor utilizar una PreparedStatement en vez de un stirng y ejecutarlo, ya que segun la investigacion, el primero tiene mejor seguridad encontra de ataques de inyeccion sql.

# Bibliografía 

-  [1]W. Álvarez, Diseño e implementación Sistema DonacionCR, 1st ed. 2019. 
-  [2]A. Lee, README.md[Online]. Available: https://github.com/typora/typora-issues. [Accessed: 02 - Nov - 2019]. 
-  [3]"Features", Creately.com, 2019. [Online]. Available: https://creately.com/tour/. [Accessed: 01 - Nov- 2019]. 
-  [4]D. Page, "Getting Started — pgAdmin 4 4.13 documentation", Pgadmin.org, 2019. [Online]. Available: https://www.pgadmin.org/docs/pgadmin4/latest/getting_started.html. [Accessed: 04- Nov- 2019]. 
-  [5] "NetBeans IDE", *Oracle.com*, 2019. [Online]. Available: https://www.oracle.com/tools/technologies/netbeans-ide.html. [Accessed: 05- Nov- 2019]. 
-  [6] Avelino, G., Valente, M.T. and Hora, A., 2015. *What is the Truck Factor of popular GitHub applications? A first assessment* (No. e1683). PeerJ PrePrints. 
-  [7] "Amazon Relational Database Service (RDS)", Amazon Web Services, Inc., 2019. [Online]. Available:  https://aws.amazon.com/es/rds/. [Accesed: 18- Nov- 2019].
-  [8]"MongoDB Atlas",  MongoDB, Inc. 2019.[Online]. Available: https://www.mongodb.com/cloud/atlas. [Accesed: 18-Nov-2019].
-  [9]"MongoDB Compass",  MongoDB, Inc. 2019.[Online]. Available: https://www.mongodb.com/products/compass. [Accesed: 18-Nov-2019].
-  [10]"Catalog, document and understand your data",  Logic Systems sp. z o.o. 2019.[Online]. Available: https://dataedo.com/. [Accesed: 18-Nov-2019].
