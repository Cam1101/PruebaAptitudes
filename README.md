# PruebaAptitudes

## Indique su framework de desarrollo favorito independiente de la tecnología, pros y contras.

Considero que mi framework favorito puede ser Spring en desarrollo web y Flutter para desarrollo móvil, pero me centraré más en Spring ya que es el que más he usado de los dos. Abarcando un poco los pros que tiene esta tecnología partiendo desde mi propia experiencia.

El punto principal para que sea mi favorito es que usa Java, un lenguaje de programación con el que me siento cómodo a la hora de trabajar, y eso siempre va a ser un factor importante a la hora de escoger un framework u otro. En mi caso, aquellos que usan lenguajes como JS no se me facilitan tanto ya que no manejo bien el lenguaje.

Además, he tenido la oportunidad de usar Spring y Jakarta EE para algunos proyectos en la universidad y creo que uno de los factores a favor más grandes que tiene Spring es la cantidad de frameworks y librerías que puede adoptar (como Spring Boot, Spring Security, etc.) ya que facilitan mucho el trabajo a la hora de desarrollar y desplegar las aplicaciones. El hecho de que Spring Boot ya tenga un servidor TomCat integrado ayuda bastante y ahorra mucho tiempo de configuración, a diferencia de JEE donde todas estas configuraciones se hacen a mano. Este proceso no es difícil, pero a veces se vuelve tedioso, por lo que contar con ayuda a la hora de realizarlo se agradece.

Otra parte muy positiva es la cantidad de documentación que se puede encontrar en línea sobre este framework. Al ser uno de los más usados a nivel mundial es más sencillo encontrar mucha información sobre prácticamente cualquier tema relacionado y cuenta con una comunidad muy grande, por lo que en plataformas como Stackoverflow se pueden encontrar muchas dudas y errores comunes resueltos, lo que permite desarrollar de una forma más sencilla.

Entrando un poco en las partes “malas” o “contras” del framework podría empezar con la curva de aprendizaje. Recuerdo que cuando usé por primera vez esta tecnología me costó bastante aprender ya que hay muchos conceptos que son un poco complicados de entender y si no se tienen buenas bases se torna algo realmente retador. El aspecto positivo de esto es que hay muchos tutoriales y cursos en línea para este, entonces esto se compensa bastante bien.

Ya en aspectos técnicos, se me ocurre mencionar la dificultad que puede tener modificar los archivos de configuración que tiene el framework, a veces olvidar un pequeño detalle de configuración puede llevar a un error que puede ser tedioso de identificar.


# Manual de instalación

## Descripción
Este proyecto es una aplicación Spring Boot que maneja información de departamentos y ciudades. Permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre estas entidades.

## Tecnologías Utilizadas
- **Java 17**: Lenguaje de programación
- **Spring Boot**: Framework para desarrollo de aplicaciones Java
- **MySQL**: Base de datos relacional
- **Maven**: Herramienta de gestión de proyectos y dependencias

## Requisitos del Sistema
Para ejecutar este proyecto, necesitas tener instaladas las siguientes tecnologías en tu máquina:

1. **Java Development Kit (JDK) 17**
   - Puedes descargarlo desde: https://www.oracle.com/co/java/technologies/downloads/

2. **Apache Maven**
   - Puedes descargarlo desde: https://maven.apache.org/download.cgi
   - Asegúrate de que `mvn` esté en tu PATH

3. **MySQL Server**
   - Puedes descargarlo desde: https://dev.mysql.com/downloads/mysql/


## Configuración

Asegurate de modificar el archivo **application.propperties** en el directorio **resources** para que la información de la base de datos sea coherente con tu base de datos:

spring.application.name=pruebaAptitudes

spring.datasource.url=jdbc:mysql://localhost:3306/aptitudes  //Asegurate de revisar el puerto

spring.datasource.username=<**USUARIO**>

spring.datasource.password=<**CONTRASEÑA**>

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

## Pantalla:

Para acceder a la pantalla, correr el proyecto y dirigirse a la url: 
**localhost:8080/departamentos**
