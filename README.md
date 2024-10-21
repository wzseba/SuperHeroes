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


