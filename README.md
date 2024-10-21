# SuperHeroes
* Se pide realizar una aplicacion para un empresa que vende figuras de superheroes. Para ello, tendra que modelar todos los daos relativos a estas figuras. Asi pues, se pide que programe las siguentes clases:

#### Clase SuperHeroe
##### Propiedades <br/> #####
* nombre(nombre del superheroe)
* descripcion(cadena para describir brevemente su aspecto)
* capa(boolean que indica si lleva capa o no)

##### Constructor <br/> #####
* Un constructor con parametros que reciva solo el nombre del superheroe. La descripcion se inicializara a vacio(cadena vacia) y la capa se inicializara al valor false(sin capa)

##### Metodos get y set <br/> #####
* Programe los get y set para cada propiedad

##### Metodo toString <br/> #####
* Programe el metodo toString de forma que devuelva una cadena con todas sus propiedades

#### Clase Dimension
##### Propiedades <br/> #####
* Alto - Ancho - Profundidad todos devuelven double

##### Constructor <br/> #####
* Haga un constructor sin parametros que inicialice todas las propiedades a 0.
* Haga un constructor que reciba como parametro un alto, un ancho y una profundidad y asigne los valores a sus respectivas propiedades

##### Metodos get y set <br/> #####
* Programe los get y set para cada propiedad

##### Metodo de calculo <br/> #####
* Programe un metodo llamado getVolumen() que devuelva el volumen maximo que ocuparia el objeto(alto * ancho * profundidad)

##### Metodo toString <br/> #####
* Programe el metodo toString de forma que devuelva una cadena con alto, ancho, profundidad y volumen maximo del objeto

#### Clase Figura
##### Propiedades <br/> #####
* Codigo(id), formado por letras y numeros. Dos figuras distintas no tendran el mismo codigo
* Precio. Un double con el precio de la figura

* Ademas, puesto que la figura representa a un superheroe, sera necesario que la clase figura contenga un objeto de la clase superheroe que describa las caracteristicas de este.

* Pro otro lado, para definir las dimensiones de la figura, la clase figura contendra un objeto de la clase Dimension

##### Cosntructor <br/> #####
* Programe un constructor que reciba como parametro el codigo identificativo de la figura, su precio, un objeto Dimension, un objeto Superheroe. Estos valores se asignaran a cada propiedad

##### Metodos get y set <br/> #####
* Programe los get y set para cada propiedad

##### Metodo toString <br/> #####
* Programe el metodo toString de forma que devuelva una cadena con todas las caracteristicas de la figura

##### Metodo modificardor adicional <br/> #####
* Programe un metodo subirPrecio(double cantidad) que reciba una cantidad de dinero. Este metodo subira el precion actual de la figura en la cantidad indicada como parametro

#### Clase Coleccion
* La emprea vende a veces colecciones de figuras, que basicamante son un conjunto de figuras con una tematica relacionada. Por ejemplo una coleccion "El hombre mucielago" que consta de una serie de figuras relacionadas con batman, o una coleccion "Marvel", con figuras de superheroes de marvel, etc.

##### Propiedades <br/> #####
* nombreColeccion, que sera el nombre de la coleccion ("Marvel")
* Un objeto listaFiguras, que sera un arrayList que contendra las distintas figuras que formn la coleccion

##### Cosntructor <br/> #####
* Programe un constructor que reciba como parametro el nombre de la coleccion. Este constructor construira el arrayList listaFiguras, (que estara vacio inicialmente)

##### Metodos get y set <br/> #####
* Programe los get y set para cada propiedad

##### Metodos modificadores <br/> #####
* Programe un metodo añadirFigura(Figura fig), que reciba como parametro una figura y la añada al listado de figuras de la coleccion
* Programe un metodo subirPrecio(double cantidad, String id) que reciba una cantidad de dineroy el identificador de una de las figuras de la coleccion. El metodo subira el precio de dicha figura en la cantidad pasada como parametro

##### Metodos toString y similares <br/> #####
* Programe el metodo toString, de forma que devuleva una cadena con el listado de todas las figuras de la coleccion con todas las caracteristicas de cada uno.
* Programe un metodo conCapa() que devuelva una cadena con el listado de aquellas figuras de la coleccion que tengan capa

##### Metodos observadores <br/> #####
* Programe un metodo masValioso() que devuleva la figura que tenga el precio mayor de la coleccion
* Programe un metodo getValorColeccion(), que devuelva un double con el precio total de la coleccion ( es la suma de los precios de cada figura de la coleccion)
* Programe un metodo getVolumenColeccion(), que devuelva un double con el volumen aproximado que ocuparia toda la coleccion de figuras. Para hacer este calculo se deben sumar los volumenes de cada figura, y añadirle al resultado el valor de 200

##### Testing <br/> #####
* Testear todas las clases





