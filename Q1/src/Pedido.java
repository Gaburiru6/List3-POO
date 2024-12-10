import java.util.ArrayList;
import java.util.Random;

public class Pedido{
    private String HoradaCompra;
    private String EnderecoEntrega;
    private Integer QtdBotijoes;
    private Integer Total;
    private String HoraEntrega;
    private Integer Cartão;
    private String StatusPedido;
    private Integer NumeroPedido;

//funções
    public Pedido(String horapedido, String horaentrega, String endereco, int botijoes) {
        Random random = new Random();
        this.HoradaCompra = horapedido;
        this.HoraEntrega = horaentrega;
        this.EnderecoEntrega = endereco;
        this.Total = (botijoes * 100);
        this.NumeroPedido = 100000 + random.nextInt(900000);
    }

    public static String pedidoEntrega(int pedido, int indice, ArrayList<Pedido> pedidos) { // (Static) Para não ser necessario instaciar objeto para realizar esse método.
        if (indice == 0) {
            return "Ainda nao existem pedidos.";
        } else {
            for (int i = 0; i < indice; i++) {
                if (pedido == pedidos.get(i).getNumeroPedido()) {
                    pedidos.get(i).setStatusPedido("entregue");
                    return "Pedido encontrado. Status atualizado para entregue.";
                }
            }
        }
        return "Pedido nao localizado.";
    }

    public static String confirmaPedido(int indice, ArrayList<Pedido> pedidos) {
        int j = 0;
        if (indice == 0) {
            return "Ainda nao existem pedidos.";
        } else {
            for (int i = 0; i < indice; i++) {
                if ("Confirmado".equals(pedidos.get(i).getStatusPedido())) {
                    pedidos.get(i).estado();
                    j++;
                } else if ((i == (indice - 1)) && (j == 0)) {
                    return "Nao ha pedidos confirmados.";
                }
            }
            j = 0;
        }
        return "Pedidos confirmados listados com sucesso.";
    }

    public static String confirmaEntrega(int indice, ArrayList<Pedido> pedidos) {
        int j = 0;
        if (indice == 0) {
            return "Ainda nao existem pedidos.";
        } else {
            for (int i = 0; i < indice; i++) {
                if ("entregue".equals(pedidos.get(i).getStatusPedido())) {
                    pedidos.get(i).estado();
                    j++;
                } else if ((i == (indice - 1)) && (j == 0)) {
                    return "Pedido nao localizado.";
                }
            }
            j = 0;
        }
        return "Pedidos entregues listados com sucesso.";
    }

    public void estado() {
        System.out.println("Codigo do Pedido: " + this.NumeroPedido);
        System.out.println("Hora da compra: " + this.HoradaCompra);
        System.out.println("Hora da entrega: " + this.HoraEntrega);
        System.out.println("Cartao n°: " + this.Cartão);
        System.out.println("Endereco: " + this.EnderecoEntrega);
        System.out.println("Valor da Compra: R$ " + this.Total);
        System.out.println("Status: " + this.StatusPedido);
        System.out.println("-----------------------");
    }



//getters and setters
    public String getHoradaCompra() {
        return HoradaCompra;
    }

    public void setHoradaCompra(String horadaCompra) {
        HoradaCompra = horadaCompra;
    }

    public String getEnderecoEntrega() {
        return EnderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        EnderecoEntrega = enderecoEntrega;
    }

    public Integer getQtdBotijoes() {
        return QtdBotijoes;
    }

    public void setQtdBotijoes(Integer qtdBotijoes) {
        QtdBotijoes = qtdBotijoes;
    }

    public Integer getTotal() {
        return Total;
    }

    public void setTotal(Integer total) {
        Total = total;
    }

    public String getHoraEntrega() {
        return HoraEntrega;
    }

    public void setHoraEntrega(String horaEntrega) {
        HoraEntrega = horaEntrega;
    }

    public Integer getCartão() {
        return Cartão;
    }

    public void setCartão(Integer cartão) {
        Cartão = cartão;
    }

    public String getStatusPedido() {
        return StatusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        StatusPedido = statusPedido;
    }

    public Integer getNumeroPedido() {
        return NumeroPedido;
    }

    public void setNumeroPedido(Integer numeroPedido) {
        NumeroPedido = numeroPedido;
    }
}
