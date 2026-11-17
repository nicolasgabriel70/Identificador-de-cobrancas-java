import java.util.ArrayList;

public class AnalisadorTransacoes {

    public void analisarTransacoes(ArrayList<Transacao> transacoes) {

        int quantidadeDuplicidades = 0;

        System.out.println("=====IDENTIFICADOR-DE-COBRANÇAS=====");
        System.out.println("Total de transações: " + transacoes.size());
        System.out.println();

        for (int i = 0; i < transacoes.size(); i++) {
            Transacao primeira = transacoes.get(i);

            for (int j = i + 1; j < transacoes.size(); j++) {
                Transacao segunda = transacoes.get(j);

                boolean mesmoEstacionamento = primeira.getEstabelecimento().equalsIgnoreCase(segunda.getEstabelecimento());
                boolean mesmoSaldo = primeira.getValor().compareTo(segunda.getValor()) == 0;
                boolean mesmaData = primeira.getData().equals(segunda.getData());

                if (mesmaData && mesmoEstacionamento && mesmoSaldo) {
                    quantidadeDuplicidades++;
                    System.out.println("POSSÍVEL COBRANÇA DUPLICADA! \n");
                    System.out.println("Estabeleciemento: " + transacoes.get(i).getEstabelecimento());
                    System.out.println("Data: " + transacoes.get(i).getData());
                    System.out.println("Valor: R$ " + transacoes.get(i).getValor());
                    System.out.println("\n=================================");
                }
            }
        }
        System.out.println("Possíveis duplicadas: " + quantidadeDuplicidades);

        if(quantidadeDuplicidades == 0) {
            System.out.println("Nenhuma cobrança suspeita encontrada!");
        }
    }
}