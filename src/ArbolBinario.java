public class ArbolBinario {
    //Declaro atributos
    protected Nodo raiz;

    //Inicializo el arbol utilizando el constructor para que la raiz apunte a null
    public ArbolBinario(){
        raiz = null;
    }

    //Contrusctor con raiz
    public ArbolBinario(Nodo raiz){
        this.raiz=raiz;// árbol con una raíz ya existente
    }

    //Metodos
    public Nodo raizArbol(){
        return raiz; // getter de la raíz
    }

    boolean esVacio(){
        return raiz == null; // true si el árbol no tiene nada
    }

    public static Nodo nuevoArbol(Nodo ramaIzqda, Object dato, Nodo ramaDrcha){
        return new Nodo(ramaIzqda, dato, ramaDrcha);
    }



}
