/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.cebycam.accesodatos;

public class Parametro {
    private int posicion;
    private Object valor;

    public Parametro(){
    }

    public Parametro(int posicion, Object valor){
        this.posicion = posicion;
        this.valor = valor;
    }

    public Object getValor(){
        return valor;
    }

    public void setValor(Object valor){
        this.valor = valor;
    }

    public int getPosicion(){
        return posicion;
    }

    public void setPosicion(int posicion){
        this.posicion = posicion;
    }
}
