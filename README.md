# Examen Practico - Ordenamiento y Busqueda de Torneos

## Enunciado

Se tiene una estructura de datos con tres modelos:

- `Tournament` (torneo), que contiene un arreglo de `Club`.
- `Club` (club), que contiene un arreglo de `Athlete`.
- `Athlete` (atleta), con nombre, puntos y estado de titular.

## Estructura y Atributos Exactos

### Clase `Athlete`
Atributos obligatorios:

- `private String name;`
- `private int points;`
- `private boolean isStarter;`

### Clase `Club`
Atributos obligatorios:

- `private String name;`
- `private Athlete[] athletes;`

### Clase `Tournament`
Atributos obligatorios:

- `private String name;`
- `private Club[] clubs;`

Adicionalmente, `Tournament` debe implementar el campo calculado:

```java
public int getTotalStarterPoints()
```

Este metodo debe sumar los puntos de todos los atletas con `isStarter = true` en todos los clubes del torneo.

---

## Requerimientos

### 1. Campo calculado en Tournament (OBLIGATORIO)

Este campo calculado permite obtener rapidamente el total de puntos titulares de un torneo para poder comparar torneos al ordenar y para usar ese valor como criterio en la busqueda binaria.

Implementar correctamente:

```java
public int getTotalStarterPoints() {
    // Implementar aqui
}
```

### 2. Metodo de ordenamiento segun fila

Implementar el metodo de ordenamiento correspondiente:

| Fila | Algoritmo      | Orden       | Nombre exacto del metodo |
|------|----------------|-------------|--------------------------|
| A    | Bubble Sort    | Descendente | `sortBubbleDesc`         |
| B    | Selection Sort | Descendente | `sortSelectionDesc`      |

### 3. Busqueda binaria segun fila

Cada fila debe ejecutar la busqueda usando exactamente los parametros asignados en la tabla (Fila A o Fila B) e imprimir en consola, para cada busqueda, si el torneo fue encontrado o no.

Implementar metodos de busqueda binaria para cada fila (arreglo previamente ordenado en descendente):

```java
// FILA A
public Tournament binarySearchByTotalStarterPointsFilaA(Tournament[] tournaments, int totalStarterPoints)

// FILA B
public Tournament binarySearchByTotalStarterPointsFilaB(Tournament[] tournaments, int totalStarterPoints)
```

Tabla de busquedas por fila:

| Fila | Busqueda 1 | Busqueda 2 |
|------|------------|------------|
| A    | 61 puntos  | 50 puntos  |
| B    | 70 puntos  | 33 puntos  |

### 4. Salida en consola

Implementar `main` para mostrar, segun la fila asignada:

Fila A:
1. Listado original.
2. Listado ordenado para Fila A.
3. Resultado de las 2 busquedas de Fila A.

Fila B:
1. Listado original.
2. Listado ordenado para Fila B.
3. Resultado de las 2 busquedas de Fila B.

Adicionalmente, deben tomar una captura (o capturas) de la salida de consola y agregarla(s) al final de este README como evidencia. En la captura debe verse claramente:

1. Listado original.
2. Listado ordenado para Fila X.
3. Resultado de las 2 busquedas de Fila X.

---

## Configuracion Obligatoria

En `student.env`:

```env
STUDENT_NAME=SU-NOMBRE-COMPLETO
STUDENT_EMAIL=su.email@est.ups.edu.ec
FILA_ESTUDIANTE=A
```

Cambiar `FILA_ESTUDIANTE` a `A` o `B` segun corresponda.

---

## Compilacion y Pruebas Locales

```bash
mkdir -p bin
javac -cp "lib/*" -d bin $(find src -name "*.java")
```

```bash
java -cp "tools/junit-platform-console-standalone-1.7.0.jar:bin:lib/*" \
  org.junit.platform.console.ConsoleLauncher \
  --select-class "test.TournamentControllerTest" \
  --details tree
```

---

## Rubrica

| Requerimiento                              | Puntos |
|--------------------------------------------|--------|
| Campo calculado                            | 2.6    |
| Ordenamiento por fila                      | 2.6    |
| Busqueda binaria por fila                  | 2.6    |
| Salida en consola Capturas en README       | 2.0    |
| **Total**                                  | **10** |


# CAPUTRA/S DE SOLUCION EN CONSOLA:
lhost:43545 @/tmp/cp_ecdhntzs979da9ii4ek9obonh.argfile AppTournament 
Listado Original:
Tournament [name=Copa Andina, clubs=[Club [name=Condor FC, athletes=[Athlete [name=A. Perez, points=12, isStarter=true], Athlete [name=B. Ruiz, points=8, isStarter=false], Athlete [name=C. Leon, points=9, isStarter=true]]], Club [name=Quito United, athletes=[Athlete [name=D. Mena, points=14, isStarter=true], Athlete [name=E. Lara, points=7, isStarter=false], Athlete [name=F. Ayala, points=10, isStarter=true]]]]]
Tournament [name=Liga del Pacifico, clubs=[Club [name=Manta City, athletes=[Athlete [name=G. Solis, points=20, isStarter=true], Athlete [name=H. Vega, points=9, isStarter=false], Athlete [name=I. Navas, points=12, isStarter=true]]], Club [name=Guayaquil Stars, athletes=[Athlete [name=J. Moya, points=17, isStarter=true], Athlete [name=K. Cedeno, points=6, isStarter=false], Athlete [name=L. Quiroz, points=12, isStarter=true]]]]]
Tournament [name=Torneo Altura, clubs=[Club [name=Sierra Norte, athletes=[Athlete [name=M. Pardo, points=16, isStarter=true], Athlete [name=N. Paz, points=5, isStarter=false], Athlete [name=O. Jara, points=11, isStarter=true]]], Club [name=Volcan Rojo, athletes=[Athlete [name=P. Cora, points=15, isStarter=true], Athlete [name=Q. Rios, points=7, isStarter=false], Athlete [name=R. Neira, points=11, isStarter=true]]]]]
Tournament [name=Supercopa Capital, clubs=[Club [name=Centro Atletico, athletes=[Athlete [name=S. Trujillo, points=10, isStarter=true], Athlete [name=T. Nunez, points=6, isStarter=false], Athlete [name=U. Valle, points=9, isStarter=true]]], Club [name=Metro Club, athletes=[Athlete [name=V. Roma, points=11, isStarter=true], Athlete [name=W. Gale, points=5, isStarter=false], Athlete [name=X. Prada, points=9, isStarter=true]]]]]
Tournament [name=Masters Nacional, clubs=[Club [name=Titanes, athletes=[Athlete [name=Y. Ordonez, points=24, isStarter=true], Athlete [name=Z. Arroyo, points=10, isStarter=false], Athlete [name=AA. Vera, points=15, isStarter=true]]], Club [name=Campeon FC, athletes=[Athlete [name=AB. Bravo, points=18, isStarter=true], Athlete [name=AC. Cano, points=9, isStarter=false], Athlete [name=AD. Duque, points=13, isStarter=true]]]]]
Tournament [name=Copa Costa, clubs=[Club [name=Bahia Norte, athletes=[Athlete [name=AE. Lema, points=9, isStarter=true], Athlete [name=AF. Mora, points=6, isStarter=false], Athlete [name=AG. Soria, points=8, isStarter=true]]], Club [name=Ola Azul, athletes=[Athlete [name=AH. Brito, points=10, isStarter=true], Athlete [name=AI. Vaca, points=4, isStarter=false], Athlete [name=AJ. Toala, points=7, isStarter=true]]]]]
Tournament [name=Liga Metropolitana, clubs=[Club [name=Norte SC, athletes=[Athlete [name=AK. Ulloa, points=13, isStarter=true], Athlete [name=AL. Astudillo, points=7, isStarter=false], Athlete [name=AM. Sanz, points=11, isStarter=true]]], Club [name=Sur Deportivo, athletes=[Athlete [name=AN. Freire, points=12, isStarter=true], Athlete [name=AO. Mite, points=5, isStarter=false], Athlete [name=AP. Mera, points=12, isStarter=true]]]]]
Tournament [name=Copa Frontera, clubs=[Club [name=Oriente FC, athletes=[Athlete [name=AQ. Erazo, points=11, isStarter=true], Athlete [name=AR. Celi, points=6, isStarter=false], Athlete [name=AS. Rada, points=10, isStarter=true]]], Club [name=Occidente FC, athletes=[Athlete [name=AT. Pita, points=11, isStarter=true], Athlete [name=AU. Quito, points=5, isStarter=false], Athlete [name=AV. Pazmino, points=10, isStarter=true]]]]]
Listado Ordenado:
Tournament [name=Copa Andina, clubs=[Club [name=Condor FC, athletes=[Athlete [name=A. Perez, points=12, isStarter=true], Athlete [name=B. Ruiz, points=8, isStarter=false], Athlete [name=C. Leon, points=9, isStarter=true]]], Club [name=Quito United, athletes=[Athlete [name=D. Mena, points=14, isStarter=true], Athlete [name=E. Lara, points=7, isStarter=false], Athlete [name=F. Ayala, points=10, isStarter=true]]]]]
Tournament [name=Liga del Pacifico, clubs=[Club [name=Manta City, athletes=[Athlete [name=G. Solis, points=20, isStarter=true], Athlete [name=H. Vega, points=9, isStarter=false], Athlete [name=I. Navas, points=12, isStarter=true]]], Club [name=Guayaquil Stars, athletes=[Athlete [name=J. Moya, points=17, isStarter=true], Athlete [name=K. Cedeno, points=6, isStarter=false], Athlete [name=L. Quiroz, points=12, isStarter=true]]]]]
Tournament [name=Torneo Altura, clubs=[Club [name=Sierra Norte, athletes=[Athlete [name=M. Pardo, points=16, isStarter=true], Athlete [name=N. Paz, points=5, isStarter=false], Athlete [name=O. Jara, points=11, isStarter=true]]], Club [name=Volcan Rojo, athletes=[Athlete [name=P. Cora, points=15, isStarter=true], Athlete [name=Q. Rios, points=7, isStarter=false], Athlete [name=R. Neira, points=11, isStarter=true]]]]]
Tournament [name=Supercopa Capital, clubs=[Club [name=Centro Atletico, athletes=[Athlete [name=S. Trujillo, points=10, isStarter=true], Athlete [name=T. Nunez, points=6, isStarter=false], Athlete [name=U. Valle, points=9, isStarter=true]]], Club [name=Metro Club, athletes=[Athlete [name=V. Roma, points=11, isStarter=true], Athlete [name=W. Gale, points=5, isStarter=false], Athlete [name=X. Prada, points=9, isStarter=true]]]]]
Tournament [name=Masters Nacional, clubs=[Club [name=Titanes, athletes=[Athlete [name=Y. Ordonez, points=24, isStarter=true], Athlete [name=Z. Arroyo, points=10, isStarter=false], Athlete [name=AA. Vera, points=15, isStarter=true]]], Club [name=Campeon FC, athletes=[Athlete [name=AB. Bravo, points=18, isStarter=true], Athlete [name=AC. Cano, points=9, isStarter=false], Athlete [name=AD. Duque, points=13, isStarter=true]]]]]
Tournament [name=Copa Costa, clubs=[Club [name=Bahia Norte, athletes=[Athlete [name=AE. Lema, points=9, isStarter=true], Athlete [name=AF. Mora, points=6, isStarter=false], Athlete [name=AG. Soria, points=8, isStarter=true]]], Club [name=Ola Azul, athletes=[Athlete [name=AH. Brito, points=10, isStarter=true], Athlete [name=AI. Vaca, points=4, isStarter=false], Athlete [name=AJ. Toala, points=7, isStarter=true]]]]]
Tournament [name=Liga Metropolitana, clubs=[Club [name=Norte SC, athletes=[Athlete [name=AK. Ulloa, points=13, isStarter=true], Athlete [name=AL. Astudillo, points=7, isStarter=false], Athlete [name=AM. Sanz, points=11, isStarter=true]]], Club [name=Sur Deportivo, athletes=[Athlete [name=AN. Freire, points=12, isStarter=true], Athlete [name=AO. Mite, points=5, isStarter=false], Athlete [name=AP. Mera, points=12, isStarter=true]]]]]
Tournament [name=Copa Frontera, clubs=[Club [name=Oriente FC, athletes=[Athlete [name=AQ. Erazo, points=11, isStarter=true], Athlete [name=AR. Celi, points=6, isStarter=false], Athlete [name=AS. Rada, points=10, isStarter=true]]], Club [name=Occidente FC, athletes=[Athlete [name=AT. Pita, points=11, isStarter=true], Athlete [name=AU. Quito, points=5, isStarter=false], Athlete [name=AV. Pazmino, points=10, isStarter=true]]]]]
Primera busqueda null
Primera busqueda null