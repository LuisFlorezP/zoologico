1- ¿Cuántas clases tiene el proyecto?
R/= Tiene 3 clases: Animal, Familia y Zoologico.

2- ¿En cuál clase se define el programa principal
R/= En la clase Zoologico ya que allí se encuentra el método main.

3- ¿Cuántos objetos de la clase Animal se crean en la clase
principal?
R/= Se crean 2, el "animal1" y "animal2".

4- ¿Cuántos y cuáles son los atributos de la clase Animal?
R/= Contiene 4 atributos, son "nombre", "genero", "peso" y "pareja".

5- ¿Cuáles atributos de la clase Animal no son primitivos?
R/= Estos son "nombre" y "genero" ya que son String y no es considerado un primitivo, tampoco "pareja" al ser de tipo clase Animal.

6- ¿Qué pasa si eliminamos la línea 17 de la clase Zoologico?
R/= Los valores del atributo "pareja" quedan vacíos y al llegar al método imprimirFamilia() en la clase "Familia" será null y presenta error al intentar imprimir a this.hijo.nombre.

7- ¿Cuántos métodos tiene la clase Familia?
R/= Contiene 11 métodos de los cuales 3 son constructores, uno vacío, otro es lleno con atributos "papa", "mama" y "hijo" de tipo Animal y el último con los atributos "papa" y "mama" de tipo Animal; otros 6 son los setters y getters de los 3 atributos, por último los otros 2 son imprimirFamilia() y tenerHijo().

8- ¿Cuántos parámetros tiene el método tenerHijo() de la clase
Familia?
R/= Únicamente 1, este es "nombre" de tipo String.

9- ¿Cuántos atributos inicializa el constructor de la clase Familia?
R/= Inicializa 2, los cuales son "papa" y "mama", pero en mi caso también cree los 2 que son vacío y lleno.

10- ¿Qué tipo de retorno tiene el método tenerHijo()?
R/= No tiene retorno, es de tipo void.
