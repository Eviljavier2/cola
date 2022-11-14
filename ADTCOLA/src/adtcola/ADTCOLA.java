/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adtcola;

/**
 *
 * @author ernst
 */
public class Cola_ADT {
     LSL_ADT kola;
    
    public Cola_ADT(){
        this.kola = new LSL_ADT();
    }
    
    public boolean estaVacia(){
        return this.kola.estaVacia();
    }
    
    public int getRozmiar(){
        return this.kola.getRozmiar();
    }
    
    public void enqueue(T valor){
        this.kola.agregarAlFinal(valor);
    }
    
    public T dequeue(){
        Object Ayuda = this.kola.regresarInicio();
        kola.eliminarElPrimero();
        return (T)Ayuda;
    }
    
    public void transversal(){
        this.kola.transversal();
    }

    @Override
    public String toString() {
        return "Cola_ADT{" + "kola=" + (T)kola + '}';
    }
    
    
    
    public static void main(String[] args) {
        Cola_ADT Prueba = new Cola_ADT();
        Prueba.enqueue(18);
        Prueba.enqueue("HOLLLLLLLA");
        Prueba.enqueue('¿');
        Prueba.enqueue("kabsdbasj");
        Prueba.enqueue(70);
        Prueba.enqueue(70 + "'s");
        System.out.println(Prueba.getRozmiar());
        Prueba.transversal();
        System.out.println(Prueba.toString());
        System.out.println(Prueba.dequeue());
        System.out.println(Prueba.toString());
        System.out.println(Prueba.dequeue());
    }
}