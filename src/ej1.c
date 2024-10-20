#include <stdio.h>

int main() {
    char nombre[50]; // Capacidad para almacenar carácteres en nombre

    printf("¿Cuál es tu nombre? "); // Preguntamos el nombre
    scanf("%49s", nombre); // Leemos el nombre y lo guardamos

    printf("Hola %s", nombre); // Imprimir en pantalla
    printf("\nEste programa está hecho en el lenguaje de programación: c\n"); 
    // He intenado hacer este código en una sola línea con sprint pero me da fallo de desbordamiento asin que lo he simplificado.

    return 0;
}