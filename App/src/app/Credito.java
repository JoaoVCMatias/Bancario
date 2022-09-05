/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author joao
 */
public class Credito extends Operacao {

    public Credito(double valor) {
        super.valor = valor;
    }

    
    
    

    @Override
    public double operar() {
        return (super.valor < 0) ? super.valor * -1 : super.valor;
    }
    
}
