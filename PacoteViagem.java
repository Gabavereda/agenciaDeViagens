
package atv_2;



public class PacoteViagem {
    
    int QuantidadeDias;   
    String destino;
    Transporte transporte;
    Hospedagem hospedagem;

    public PacoteViagem(int QuantidadeDias, String destino, Transporte transporte, Hospedagem hospedagem) {
        this.QuantidadeDias = QuantidadeDias;
        this.destino = destino;
        this.transporte = transporte;
        this.hospedagem = hospedagem;
    } 
    public double ValorHospedagem (){
        
        return hospedagem.valorDiaria * QuantidadeDias;
         
    } 
    public double CalculoLucro (double MargemLucro){
        
        return transporte.valor + (transporte.valor * MargemLucro / 100);
    
    }
    public double TotalPacote (double MargemLucro , double TaxasAdicionais){
        
        return transporte.valor + ValorHospedagem() + CalculoLucro(MargemLucro) + TaxasAdicionais;
        
        
    
    }
    
    
    
}
