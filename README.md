# Ejercicio 01 - Hackademy
---
## Suma múltiplos de 3 o 5
---
Si enlistamos todos los números naturales debajo de 10 que son múltiplos de 3 o 5, obtenemos 3,5,6 y 9. 

La suma la suma de estos múltiplos es 23.
Encuentra la suma de todos los múltiplos de 3 o 5 debajo de 1000

---
# Como resolver el problema

Creamos una variable sumatoria para almacenar
las sumas de los múltiplos de 3 o 5
```java
        int sumatoria = 0;
```
Iteramos a través de los números del 1 al 999 (debajo de 1000).
```java
      for( int i = 1; i < 1000; i++ ){
```
---

Un numero X es múltiplo de Y si y solo si
el residuo después de dividir X entre Y es 0.
Usamos el operador modulo para hacer esa operación.

---

Encontrando los múltiplos de 3 o 5 y sumándolos
```java
      if( i % 3 == 0 || i % 5 == 0 ) {
         sumatoria = sumatoria + i;
      }
```

---

Mostramos la suma de los múltiplos de 3 o 5 debajo de 1000

```java
System.out.println("La suma de los multiplos de 3 o 5 debajo de 1000 es: "+sumatoria);
```
---

En este caso la el resultado de la suma de los múltiplos de 3 o 5 debajo de 1000 es: **233168**

