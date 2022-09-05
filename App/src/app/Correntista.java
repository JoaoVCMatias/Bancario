/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author joao
 */
public class Correntista {
    private String nome;
    private ContaCorrente conta;


    public Correntista(String nome, ContaCorrente conta) {
        this.nome = nome;
        this.conta = conta;
    }
    
    

    public String getNome() {
        return nome;
    }

    public ContaCorrente getContaCorrente() {
        return conta;
    }

    
    
}
