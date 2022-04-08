# Practica Maco Wins

[Enunciado](https://docs.google.com/document/d/1mjWKl9YH9Bb39iIUl1bQj_xhx_-CjCAMpcAXRqKhVjU/edit)


Diagrama de clases
![diagrama](diagrama.PNG)


### Explicacion


* Decidi delejar la responsabilidad de como hacer el cobro de la venta en una interfaz "MetodoDepago" asi si en el futuro se requiere hacer un calculo distinto cuando se pague en efectivo o si se agrega un nueva manera de pagar queda desacoplado de la clase Venta

* Decidi crear una interfaz "Estado" y no una clase para luego heredar de  "Nuevo", "Promicion" y "Liquidacion" debido a que no tenian estados en comun, solo tenian que entender el mensaje precio



