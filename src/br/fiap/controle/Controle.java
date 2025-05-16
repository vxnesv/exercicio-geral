package br.fiap.controle;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;

public class Controle {
    private static List<Cliente> listaCliente

    public void menu() {
        int opcao;

        while(true) {
            opcao = parseInt(showInputDialog(gerarMenu()));
        }
    }

    private String gerarMenu() {
        String aux = "SISTEMA DE RESERVA DE PASSAGEM AÉREA";
        aux += "1. Reservar\n";
        aux += "2. Pesquisar br.fiap.reserva\n";
        aux += "3. Cancelar br.fiap.reserva\n";
        aux += "4. Finalizar";
        return aux;
    }
}