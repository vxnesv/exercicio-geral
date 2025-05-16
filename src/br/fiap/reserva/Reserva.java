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


    }

}
