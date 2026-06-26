import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayDeque;
public class Main{
    public static void main(String[] args){
     Scanner scanner=new Scanner(System.in);

     ArbolBinario arbol;
     Nodo a1, a2, a;
     ArrayDeque<Nodo> pila=new ArrayDeque<>();

     a1=ArbolBinario.nuevoArbol(null,"Esteban",null);//Esto es igual a hacer new Nodo(....)solo
                                                                             //que con un metodo de la clase ArbolBinario
     a2=ArbolBinario.nuevoArbol(null,"Ariel",null);
     a=ArbolBinario.nuevoArbol(a1,"Esperanza",a2);

     pila.push(a);//Apila el arbol con Esperanza como raiz y como subarbol.iz a Esteban y subarbol.der a Ariel

        a1 = ArbolBinario.nuevoArbol(null,"Diego",null);
        a2 = ArbolBinario.nuevoArbol(null,"Astor",null);
        a = ArbolBinario.nuevoArbol(a1,"M Jose",a2);
        pila.push(a);

       a1=(Nodo)pila.pop();//Extrae el arbol con M jose como raiz y lo coloca en a1
       a2=(Nodo)pila.pop();//Extrae el arbol con Esperanza como raiz y lo coloca en a2
        a = ArbolBinario.nuevoArbol(a1,"Ester",a2);//Crea un arbol con a1 como subarbol.iz y a2 como subarbol.der
      arbol=new ArbolBinario(a);//Crea el arbol final con Ester como raiz y a1 como subarbol.izq y a2 como subarbol.der

    }
}
