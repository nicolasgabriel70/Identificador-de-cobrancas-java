import java.math.BigDecimal;
import java.time.LocalDate;

public class Transacao {

    private BigDecimal valor;
    private LocalDate data;
    private String estabelecimento;

    public Transacao(BigDecimal valor, LocalDate data, String estabelecimento){
        this.valor = valor;
        this.data = data;
        this.estabelecimento = estabelecimento;
    }

    public BigDecimal getValor() {
        return valor;
    }
    public LocalDate getData() {
        return  data;
    }
    public String getEstabelecimento() {
        return estabelecimento;
    }


}


