<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
</div>


<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Pilas y Colas</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>03</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA INICIO::</td><td>16-May-2022</td><td>FECHA FIN:</td><td>20-May-2022</td><td>DURACIÓN:</td><td>02 horas</td>
</tr>
<tr><td colspan="6">INTEGRANTES:
    <ul>
        <li>Durand Obando, Eduardo Franshua</li>
        <li>Galvez Quilla, Henry Isaias</li>
        <li>Alvarez Astete, Kevin Jheeremy</li>
        <li>Centeno Quispe, Marco Edmundo E.</li>
    </ul>
</td>
</<tr>
<tr><td colspan="6">DOCENTES:
<ul>
<li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
</ul>
</td>
</<tr>
</tdbody>
</table>

# Pilas y Colas

[![License][license]][license-file]
[![Downloads][downloads]][releases]
[![Last Commit][last-commit]][releases]

[![Debian][Debian]][debian-site]
[![Git][Git]][git-site]
[![GitHub][GitHub]][github-site]
[![Vim][Vim]][vim-site]
[![Java][Java]][java-site]

#

## OBJETIVOS TEMAS Y COMPETENCIAS

### OBJETIVOS

- Realizar ejercicios en temas de Estructuras de datos, Pilas, Colas.

### TEMAS
- Pilas
- Colas

<details>
<summary>COMPETENCIAS</summary>

- C.m. Construye responsablemente soluciones haciendo uso de estructuras de datos y algoritmos, siguiendo un proceso adecuado para resolver problemas computacionales que se ajustan al uso de los recursos disponibles y a especificaciones concretas.

</details>

## EJERCICIOS PROPUESTOS Y EXPLICACIÓN

1. Pilas iguales (6 puntos)
    -   Tiene tres pilas de cilindros donde cada cilindro tiene el mismo diámetro, pero pueden variar en altura. Puede cambiar la altura de una pila quitando y descartando su cilindro superior tantas veces como desee.
    -   Encuentre la altura máxima posible de las pilas de modo que todas las pilas tengan exactamente la misma altura.
    -   Esto significa que debe eliminar cero o más cilindros de la parte superior de cero o más de las tres pilas hasta que tengan la misma altura y luego devolver la altura.

    -   Ejemplo:
        -   Dado h1 = [1,2,1,1], h2 = [1,1,2] y h3 = [1,1].
        -   Hay cilindros en las tres pilas, con sus alturas en las tres matrices.
        -   Retire los 2 cilindros superiores de h1 (alturas = [1, 2]) y de h2 (alturas = [1, 1])para que las tres pilas tengan 2 unidades de altura.
        -   Devuelve 2 como respuesta.
        -   Nota: una pila vacía sigue siendo una pila.

    -   Complete la función equalStacks. equalStacks tiene los siguientes parámetros:
        -   int h1[n1]: el primer arreglo de alturas
        -   int h2[n2]: el segundo arreglo de alturas
        -   int h3[n3]: el tercer arreglo de alturas

    -   Retorno
        -   int: la altura de las pilas cuando se igualan

    -   Explicación ilustrativa
        -   Dadas 3 pilas: h1 = [1,1,1,2,3], h2 = [2,3,4] y h3 = [1,4,1,1]. Se ven así:
        -   ![Cilindros](imagenes/cilindros01.png)

        -   Para igualar sus alturas, retire el primer cilindro de las pilas y dos cilindros de la pila, y luego quitar la parte superior(como se muestra a continuación).

        -   ![Cilindros](imagenes/cilindros02.png)
        -   Las alturas de pila se reducen de la siguiente manera:
            -   8 − 3 = 5
            -   9 − 4 = 5
            -   7 − 1 − 1 = 5
            -   Las tres pilas ahora tienen altura = 5, el valor a devolver.

2.  Pilas (6 puntos)
    -   Implementa una pila usando POO con tipos genéricos siguiendo los estándares de Java (los métodos para una pila) verifique:
    -   https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
        #
        ### EXPLICANDO CARPETA 2_Pilas
        Dentro de esta carpeta encontramos 4 archivos:
        - **EmptyStackException:** Es usada por la clase Stack para lanzar excepciones en caso la pila esté vacía.
        - **Node:** La clase genérica Node representa a cada elemento contenido en la pila. Cuenta con 2 atributos: *data* que tiene la información del elemento y *next* que es la referencia al siguiente elemento.
        - **Stack:** Esta es nuestra clase que representa la pila, posee un atributo llamado *root* que es el tope de la pila (el último elemento en ser añadido). Cuenta con 5 métodos representantes de toda pila, además de *toString* que muestra los elementos que Stack contenga. Los 5 métodos importantes son:
            - ***Push:*** Agrega elementos a la pila, como si fuera una torre de platos.
            - ***Empty:***: Indica si la pila está vacía.
            - ***Pop:*** Devuelve el último elemento en ser agregado y luego lo elimina. Si la pila está vacía arroja una excepción.
            - ***Peek:*** Devuelve el último elemento en ser agregado. Si la pila está vacía arroja una excepción.
            - ***Search:*** Busca un elemento dentro de la pila y retorna su posición contando desde 1 empezando por el último elemento agregado. Si el elemento no es encontrado retorna -1.
        - **Test:** Esta clase es usada para testear el funcionamiento de nuestra pila. El resultado de la implementación es el siguiente:
         #
         ```sh
            // Cuando la pila está vacía
            Usando empty: ¿La pila está vacía? : true

            // Vamos agregando elementos con push
            23,
            15, 23,
            2, 15, 23,
            11, 2, 15, 23,
            17, 11, 2, 15, 23,
            26, 17, 11, 2, 15, 23,
            3, 26, 17, 11, 2, 15, 23,
            14, 3, 26, 17, 11, 2, 15, 23,

            // Ahora que la pila no está vacía
            Usando empty: ¿La pila está vacía? : false


            USANDO POP
            14
            3, 26, 17, 11, 2, 15, 23,

            USANDO PEEK
            3
            3, 26, 17, 11, 2, 15, 23,

            // Usando search
            ¿Está el número 17? - Retorna posición: 3

            ¿Está el número 578? - Retorna posición (-1 si no encontró): -1
        ```
        #


3.  Colas (6 puntos)
    -   Implementa una cola usando POO con tipos genéricos siguiendo los estándares de Java (los métodos para una cola) verifique:
    -   https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
        #
        ### EXPLICANDO CARPETA 3_Colas
        Dentro de esta carpeta encontramos 5 archivos:
        - **EmptyQueueException:** Es usada por la clase Queue para lanzar excepciones en caso la cola esté vacía.
        - **FullQueueException:** Es usada por la clase Queue para lanzar excepciones en caso la cola esté llena.
        - **Node:** La clase genérica Node representa a cada elemento contenido en la cola. Cuenta con 2 atributos: *data* que tiene la información del elemento y *nextNode* que es la referencia al siguiente elemento.
        - **Queue:** Esta es nuestra clase que representa la cola, posee cuatro atributos:
            - ***Root:*** Nodo cabeza de la cola.
            - ***Last:*** Ultimo Nodo agregado.
            - ***Size:*** Tamaño o capacidad máximo de la cola.
            - ***NumElementos:*** Número actual de elementos presentes en la cola.
        - Cuenta con 6 métodos representantes de toda cola, además de *isEmpty* que evalua si la cola esta vacía y *getLast* que retorna el ultimo nodo de la cola. Los 6 métodos importantes son:
            - ***Offer:*** Añade un elemento a Queue sin sobrepasar la capacidad de la cola.
            - ***Add:*** Funciona igual que offer() con la diferencia que lanza la excepción de FullQueueException por capacidad máxima alcanzada.
            - ***Peek:*** Retorna, pero no elimina, la cabeza de la cola, o devuelve null si la cola está vacía.
            - ***Element:*** Este método difiere de peek() debido a que lanza la excepcion de EmptyQueueException si la cola está vacía.
            - ***Poll:*** Retorna y elimina la cabeza de la cola, o devuelve null si la cola está vacía.
            - ***Remove:*** Este método difiere del poll() debido a que lanza una mensaje si la cola está vacía.
        - **Test:** Esta clase es usada para testear el funcionamiento de nuestra pila. El resultado de la implementación es el siguiente:
        #
        ```sh
           //Se añade los primeros 5 elementos a Queue, ademas se imprime que elemento es el ultimo
           15
           20
           25
           30
           10
           //Al intentar añadir el 6to elemento se muestra el mensaje de la excepción FullQueueException
           Actualmente no hay espacio disponible
           //Se empieza a quitar elementos de la cola (estrategia FIFO) y se imprime que elemento ocupa la cabeza de la cola
           20
           25
           30
           10
           //Al intentar mostrar el primer elemento (cabeza) luego de que la cola se encuentre vacia se muestra el mensaje de la excepción EmptyQueueException
           La cola esta vacia
           //Al intentar eliminar luego de que la cola se encuentre vacia se muestra el mensaje de la excepción EmptyQueueException
           La cola esta vacia
       ```
       #

#
¿Cómo empezar?

*  Implemente una clase Node<T> donde T es un tipo genérico, esta clase debe contener al menos dos propiedades.
*   Para obtener más información sobre la verificación genérica: https://docs.oracle.com/javase/tutorial/java/generics/types.html

    1. Datos T: la información almacenada en el nodo.
    2. Node<T> nextNode: una referencia al siguiente nodo.

*   Implementar las clases Stack<T> y Queue<T> deberían contener al menos esta propiedad
    1. Node<T> root: la referencia sobre el nodo inicial

#

## CUESTIONARIO
###¿Qué similitudes hay entre una Lista Enlazada y una Pila? ( 1 pt)
	-Ambas son una serie de nodos, conectados entre sí a través de una referencia y que contienen su propia interfaz de metodos y que a diferencia de una lista normal no es necesario definir su capacidad en su creacion
### ¿En que casos seria favorable/desfavorable utilizar Pila/Cola?  ( 1 pt)
	-En la usabilidad entre la pila y la cola son que la pila usa el método LIFO (último en entrar, primero en salir) para acceder y agregar elementos de datos, mientras que Queue usa el método FIFO (primero en entrar, primero en salir) para acceder y agregar elementos de datos
	-Entonces los casos varían en cuanto al manejo de datos cuando uno quiera agregar datos o recibirlos
#

## REFERENCIAS
    - https://www.w3schools.com/java/
    - https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers
    - https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
    - https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
#

[license]: https://img.shields.io/github/license/rescobedoq/pw2?label=rescobedoq
[license-file]: https://github.com/rescobedoq/pw2/blob/main/LICENSE

[downloads]: https://img.shields.io/github/downloads/rescobedoq/pw2/total?label=Downloads
[releases]: https://github.com/rescobedoq/pw2/releases/

[last-commit]: https://img.shields.io/github/last-commit/rescobedoq/pw2?label=Last%20Commit

[Debian]: https://img.shields.io/badge/Debian-D70A53?style=for-the-badge&logo=debian&logoColor=white
[debian-site]: https://www.debian.org/index.es.html

[Git]: https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white
[git-site]: https://git-scm.com/

[GitHub]: https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white
[github-site]: https://github.com/

[Vim]: https://img.shields.io/badge/VIM-%2311AB00.svg?style=for-the-badge&logo=vim&logoColor=white
[vim-site]: https://www.vim.org/

[Java]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white
[java-site]: https://docs.oracle.com/javase/tutorial/


[![Debian][Debian]][debian-site]
[![Git][Git]][git-site]
[![GitHub][GitHub]][github-site]
[![Vim][Vim]][vim-site]
[![Java][Java]][java-site]

[![License][license]][license-file]
[![Downloads][downloads]][releases]
[![Last Commit][last-commit]][releases]
