
package atv_2;


public class Venda {
    
    String nomeCliente;
    String formaPagamento; 
    PacoteViagem pacoteViagem;

    public Venda(String nomeCliente, String formaPagamento, PacoteViagem pacoteViagem) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacoteViagem = pacoteViagem;
    }
 
    public double ConversorDolarReal (double cotacaoDolar){
        
        return pacoteViagem.TotalPacote(10,50) * cotacaoDolar;
    
    
    
    }
       
}
