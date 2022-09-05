/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author joao
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco banco1 = new Banco("Joao", new ContaCorrente(),"Maria", new ContaCorrente(),"Jose", new ContaCorrente());
        if(banco1.getCorrentista("Joao") != null){
            System.out.println("Joao cadastrado");
        }
        banco1.getCorrentista("Joao").getContaCorrente().setValor(35000);
        banco1.debitar("Joao", 1257);
        System.out.println(banco1.getCorrentista("Joao").getContaCorrente().getSaldoAtual());
        banco1.creditar("Joao", 178);
        System.out.println(banco1.getCorrentista("Joao").getContaCorrente().getSaldoAtual());
        banco1.transferir("Joao", "Maria", 2050);
        System.out.println(banco1.getCorrentista("Joao").getContaCorrente().getSaldoAtual());
        System.out.println(banco1.getCorrentista("Maria").getContaCorrente().getSaldoAtual());
        banco1.transferir("Joao", "Jose", 1000);
        System.out.println(banco1.getCorrentista("Joao").getContaCorrente().getSaldoAtual());
        System.out.println(banco1.getCorrentista("Jose").getContaCorrente().getSaldoAtual());
        
     
    }
    
}
