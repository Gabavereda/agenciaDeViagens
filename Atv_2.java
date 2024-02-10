
package atv_2;

import java.util.Scanner;


public class Atv_2 {

   
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("======Tela para cadastrar pacote de viagem======");
        System.out.println("Informe o tipo de transporte: ");
        String tipoTransporte = entrada.nextLine();
        System.out.println("O valor do transporte em dólar: ");
        double ValorDoTransporte = entrada.nextDouble();
        
        System.out.println("Informe a descrição da hospedagem desejada: ");
        entrada.nextLine();
        String descricaoHospedagem = entrada.nextLine();
        
        System.out.println("Agora o valor da hospedagem em dólar: ");
        double ValorDiariaHospedagem = entrada.nextDouble();
        
        System.out.println("Informe o destino desejado: ");
        entrada.nextLine();
        String Destino = entrada.nextLine();
        
        System.out.println(" Informe Quantidade de dias da hospedagem:");
        int quantidadeDias = entrada.nextInt();
        
        
        Transporte transporte = new Transporte (tipoTransporte , ValorDoTransporte  );
        Hospedagem hospedagem = new Hospedagem (ValorDiariaHospedagem ,descricaoHospedagem );
        PacoteViagem pacoteViagem = new PacoteViagem(quantidadeDias, Destino, transporte, hospedagem);
        
        System.out.println("===Cadastro de Venda===");
        System.out.print("Informe o nome do cliente: ");
        entrada.nextLine(); 
        String nomeCliente = entrada.nextLine();
        
        System.out.print("Informe a forma de pagamento: ");
        String formaPagamento = entrada.nextLine();

        Venda venda = new Venda(nomeCliente, formaPagamento, pacoteViagem);

        System.out.print("Informe a cotação do dólar no dia: ");
        double cotacaoDolar = entrada.nextDouble();

        System.out.println("=====Informações do Pacote de Viagem=====");
        
        
        System.out.println("Nome do cliente : " +nomeCliente);
        System.out.println("Destino : " + Destino);
        System.out.println("Quantidade de dias : " + quantidadeDias);
        System.out.println("Tipo transporte: " +tipoTransporte);
        
        
        System.out.println("Total em dólar: " + pacoteViagem.TotalPacote(10, 50));
        
        System.out.println("Total em reais: " + venda.ConversorDolarReal(cotacaoDolar));
    
    
    
    
    }
    
    
     
     
       
    }
    

