
package Clases;

import java.io.Serializable;


class Dato implements Serializable{
    Object valor;

    public Dato(Object valor) {
        this.valor = valor;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }
    
    
}
