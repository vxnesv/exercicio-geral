package br.fiap.controle;
import br.fiap.assento.Assento;
import br.fiap.cliente.Cliente;
import br.fiap.reserva.Reserva;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;

public class Controle {
    private static List<Cliente> listaCliente = new ArrayList<>();
    private static List<Assento> listaAssento = new ArrayList<>();
    private List<Reserva> listaReserva = new ArrayList<>();

    static{
        listaCliente.add(new pessoaFisica("Ana", "011", "033"));
        listaCliente.add(new pessoaJuridica("Abcd", "013", "123"));
        listaCliente.add(new pessoaFisica("Lucas", "015", "075"));
        listaCliente.add(new pessoaJuridica("XYZ Ltda", "081", "515"));

        //Lista de Assentos
        for(int i= 0 <= 10; i++){
            listaAssento.add(new Assento(i));
        }
    }

    public void menu() {
        int opcao;

        while(true) {
            try{
            opcao = parseInt(showInputDialog(gerarMenu()));
            switch (opcao){
                case 1:
                    reservar();
                    break;
                case 2:
                    pesquisar();
                    break;
                case 3:
                    cancelar();
                    break;
                case 4:
                    return;

            }
        }
    }


}

    private void cancelar() {
    }

    private void pesquisar() {
    }

    private void reservar() {
        Random random = new Random();
        int numeroAssento;
        double valorOriginal;
        String id = showInputDialog("Qual o CPF ou CNPJ para a reserva?");

        for(Cliente cliente : listaCliente){
            if(cliente.getIdentificador().equals(id)) {
                numeroAssento = parseInt(showInputDialog(listarAssento()));
                valorOriginal = random.nextDouble(100, 1000);
                assento = listaAssento.get(numeroAssento);
                listaReserva.add(new Reserva(cliente, valorOriginal, assento));
                assento.setDisponivel(false);
                return;
            }
        }
    }

    private String listarAssento() {
        String aux = "";
        for (Assento assento : listaAssento) {
            ;

            aux += assento;
            aux += "------------\n";
        }
        return aux;
    }


    private String gerarMenu() {
        String aux = "SISTEMA DE RESERVA DE PASSAGEM AÉREA\n";
        aux += "1. Reservar\n";
        aux += "2. Pesquisar br.fiap.reserva\n";
        aux += "3. Cancelar br.fiap.reserva\n";
        aux += "4. Finalizar";
        return aux;
    }

    }
