# 🌳 Implementación de un Árbol Binario en Java

## 📖 Descripción

Este proyecto implementa la estructura de datos **Árbol Binario** utilizando programación orientada a objetos en Java.

El objetivo es comprender cómo se representa un árbol binario mediante nodos enlazados, cómo se construye manualmente un árbol y cómo se organizan las relaciones padre-hijo entre los nodos.

El proyecto está compuesto por tres clases principales:

* `Nodo.java`
* `ArbolBinario.java`
* `Main.java`

---

# 📂 Estructura del proyecto

```
📦 ArbolBinario
 ├── Main.java
 ├── Nodo.java
 └── ArbolBinario.java
```

---

# 📌 Clase `Nodo`

Representa un nodo del árbol.

Cada nodo almacena:

* Un dato (`Object`)
* Referencia al hijo izquierdo
* Referencia al hijo derecho

### Atributos

```java
Object nodo;
Nodo iz;
Nodo der;
```

### Métodos principales

* `valorNodo()`
* `subarbolIzdo()`
* `subarbolDcho()`
* `nuevoValor()`
* `ramaIzdo()`
* `ramaDcho()`

---

# 📌 Clase `ArbolBinario`

Representa el árbol completo.

Su único atributo es la referencia a la raíz.

### Atributo

```java
Nodo raiz;
```

### Métodos

* Constructor vacío
* Constructor con raíz
* `raizArbol()`
* `esVacio()`
* `nuevoArbol()`

El método estático

```java
nuevoArbol(...)
```

permite crear un nodo junto con sus subárboles en una única llamada.

---

# 📌 Clase `Main`

En esta clase se construye un árbol binario utilizando una pila (`ArrayDeque`).

Primero se crean pequeños árboles:

```
Esperanza
├── Esteban
└── Ariel
```

```
M Jose
├── Diego
└── Astor
```

Luego ambos árboles se unen bajo una nueva raíz llamada **Ester**.

---

# 🌳 Árbol generado

```
                Ester
               /     \
         M Jose     Esperanza
         /    \      /      \
     Diego   Astor Esteban  Ariel
```

---

# 🚀 Cómo ejecutar

1. Clonar el repositorio.

```bash
git clone <URL_DEL_REPOSITORIO>
```

2. Abrir el proyecto en cualquier IDE Java (IntelliJ IDEA, Eclipse, NetBeans o VS Code).

3. Compilar los archivos.

```bash
javac *.java
```

4. Ejecutar el programa.

```bash
java Main
```

---

# 💻 Tecnologías utilizadas

* Java
* Programación Orientada a Objetos (POO)
* Estructuras de Datos
* Árboles Binarios
* ArrayDeque (como pila)

---

# 📚 Conceptos aplicados

* Árbol binario
* Nodo
* Raíz
* Subárbol izquierdo
* Subárbol derecho
* Constructor de objetos
* Encapsulamiento
* Referencias entre objetos
* Uso de pilas (`ArrayDeque`)
* Composición de árboles

---

# 🎯 Objetivo educativo

Este proyecto fue desarrollado con fines académicos para comprender el funcionamiento interno de los árboles binarios, la creación de nodos enlazados y la construcción manual de una estructura jerárquica en Java.

---

## 👨‍💻 Autor

Desarrollado como práctica de la materia **Estructuras de Datos** utilizando Java.
