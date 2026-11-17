import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        List<String> linhas = Files.readAllLines(
                Path.of("extrato.csv")
        );
        ArrayList<Transacao> transacoes = new ArrayList<>();


        for(int i = 1; i < linhas.size(); i++){
            String linha = linhas.get(i);
            String[] dados = linha.split(";");


            //Transformando em dados reais

            LocalDate data = LocalDate.parse(dados[0]);
            String Estabeleciamento = dados[1];
            BigDecimal valor = new BigDecimal(dados[2]);

            Transacao transacao = new Transacao(valor, data, Estabeleciamento);
            transacoes.add(transacao);

        }

        AnalisadorTransacoes analisador = new AnalisadorTransacoes();
        analisador.analisarTransacoes(transacoes);



    }
}
