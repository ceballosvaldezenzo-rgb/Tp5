public class Nodo {
    //DECLARO LOS ATRIBUTOS DE LA CLASE
    protected Object nodo;//SE USA OBJECT ASI NO LIMITO AL NODO EN ALMACENAR UN TIPO DE DATO
    protected Nodo iz;
    protected Nodo der;

    //Constructor para  el nodo es raiz o hoja
    public Nodo(Object valor){
          this.nodo=valor;
          iz=der=null;
    }
    //Constructor para un nodo con su/s hijo/s
    public Nodo(Nodo iz,Object valor,Nodo der ){
        this(valor);
        this.iz=iz;
        this.der=der;
    }
    //Operaciones con los nodos
    public Object valorNodo(){ return nodo; }//Retorno el valor del dato del nodo
    public Nodo subarbolIzdo(){ return iz; }//Muestro el hijo izquierdo
    public Nodo subarbolDcho(){ return der; }//Muestro el hijo derecho
    public void nuevoValor(Object d){ this.nodo = d; }//Le carga un nuevo valor al nodo
    public void ramaIzdo(Nodo n){ this.iz = n; }//Cambio el nodo izquierdo al que apunta por n
    public void ramaDcho(Nodo n){ this.der = n; }//Cambio el nodo derecho al que apunta por n


}

