import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pedido> pedidos = new ArrayList<>();
        int indice = 0, opcao = 0, botijoes, cartao, totalpedidos, pedido;
        String endereco;
        char opcdados;
        do {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Fazer pedido");
            System.out.println("2 - Confirmar entrega");
            System.out.println("3 - Ver pedidos confirmados");
            System.out.println("4 - Ver pedidos entregues");
            System.out.println("0 - Encerrar sistema");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Fazer pedido");
                    LocalTime horaatual = LocalTime.now();
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
                    String horapedido = horaatual.format(formato);
                    LocalTime somaentrega = horaatual.plusHours(6);
                    String horaentrega = somaentrega.format(formato);
                    System.out.println("Endereço");
                    endereco = input.nextLine();
                    do {
                        System.out.println("endereço "+ endereco);
                        System.out.println("Os dados estão corretos? s/n");
                        opcdados = input.next().charAt(0);
                        if (opcdados!='s'){
                            System.out.println("Digite o endereço correto");
                            endereco = input.nextLine();
                            input.nextLine();
                        }
                    }while (opcdados!='s');
                    System.out.println("Detalhes do pedido");
                    System.out.println("hora "+horapedido);
                    System.out.println("Endereço "+endereco);
                    System.out.println("Qual a Quantidade de botijões?");
                    botijoes = input.nextInt();
                    pedidos.add(new Pedido(horapedido,horaentrega,endereco,botijoes));
                    System.out.println("Total"+pedidos.get(indice).getTotal());
                    System.out.println("Hora da entrega"+horaentrega);
                    System.out.println("Digite o numero do cartão de credito");
                    cartao = input.nextInt();
                    pedidos.get(indice).setCartão(cartao);
                    pedidos.get(indice).setStatusPedido("Confirmado");
                    System.out.println("codigo do pedido "+pedidos.get(indice).getNumeroPedido());
                    indice++;
                    totalpedidos = pedidos.size();
                    break;
                case 2:
                    System.out.println("Digite o numero do pedido");
                    pedido = input.nextInt();
                    System.out.println(Pedido.pedidoEntrega(pedido, indice, pedidos));
                    break;
                case 3:
                    System.out.println(Pedido.confirmaPedido(indice, pedidos));
                    break;
                case 4:
                    System.out.println(Pedido.confirmaEntrega(indice, pedidos));
                    break;
                case 0:
                    System.out.println("Até a proxima vez...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }

        }while (opcao!=0);
    }
}