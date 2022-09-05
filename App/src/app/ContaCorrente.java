/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author joao
 */
public class ContaCorrente {
    private double valor;
    
    public void executarOperacao(Operacao opr){
        setValor(opr.operar()+ valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getSaldoAtual(){
        return getValor();
    }
    
}
