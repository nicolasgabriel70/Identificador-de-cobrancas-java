import java.util.ArrayList;

public class AnalisadorTransacoes {

    public void analisarTransacoes(ArrayList<Transacao> transacoes) {

        int quantidadeDuplicidades = 0;

        for (int i = 0; i < transacoes.size(); i++) {
            Transacao primeira = transacoes.get(i);

            for (int j = i + 1; j < transacoes.size(); j++) {
                Transacao segunda = transacoes.get(j);

                boolean mesmoEstacionamento = primeira.getEstabelecimento().equalsIgnoreCase(segunda.getEstabelecimento());
                boolean mesmoSaldo = primeira.getValor().compareTo(segunda.getValor()) == 0;
                boolean mesmaData = primeira.getData().equals(segunda.getData());


                if (mesmaData && mesmoEstacionamento && mesmoSaldo) {
                    quantidadeDuplicidades++;
                    System.out.println("=====CAÇA-COBRANÇAS=====\n");
                    System.out.println("Total de transações: " + transacoes.size());
                    System.out.println();
                    System.out.println("POSSÍVEL COBRANÇA DUPLICADA! \n");
                    System.out.println("Estabeleciemento: " + transacoes.get(i).getEstabelecimento());
                    System.out.println("Data: " + transacoes.get(i).getData());
                    System.out.println("Saldo: R$ " + transacoes.get(i).getValor());
                    System.out.println();
                    System.out.println("Possíveis duplicadas: " + quantidadeDuplicidades);
                }
            }
        }
        if(quantidadeDuplicidades == 0) {

            System.out.println("=====CAÇA-COBRANÇAS=====\n");
            System.out.println("Total de transações: " + transacoes.size());
            System.out.println();
            System.out.println("===== RESULTADO DA ANÁLISE =====");
            System.out.println("Possíveis duplicadas: " + quantidadeDuplicidades);
            System.out.println();
            System.out.println("Nenhuma cobrança suspeita encontrada!");
        }
    }
}