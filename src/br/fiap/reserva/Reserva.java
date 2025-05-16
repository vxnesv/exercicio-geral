package br.fiap.reserva;

import br.fiap.cliente.Cliente;
import br.fiap.assento.Assento;
import br.fiap.cliente.PessoaFisica;
import br.fiap.desconto.Desconto;


public class Reserva {
    private Assento assento;
    private Cliente cliente;
    private PessoaFisica pessoaFisica;
    public double valorOriginal;
    private Desconto desconto;


    public Reserva(Cliente cliente, double valorOriginal, Assento assento){
        this.Cliente = cliente;
        this.valorOriginal = valorOriginal;
        this.Assento = assento;

    }

      private void aplicarDesconto(double valorOriginal){
        if(cliente instanceof Desconto){
            Desconto desconto = (desconto) cliente;
        }
        elese{
            valorFinal = valorOriginal;
        }


    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#, ##0.00");
        String aux = "";
        aux += "Cliente: " + cliente.getNome() + "\n";
        aux += "Assento: " + assento.getNumero() + "\n";
        aux += "Valor Original: R$ " + valorOriginal + "\n";
        aux += "Valor Final: R$ " + valorFinal + "\n";
        return aux;
    }

}
