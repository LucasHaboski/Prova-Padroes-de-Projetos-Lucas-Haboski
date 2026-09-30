package factorymethod;

public abstract class ConcessaoCredito {

    protected abstract OperacaoCredito criarOperacao(String cliente, double valor);

    public final void conceder(String cliente, double valor) {
        OperacaoCredito operacao = criarOperacao(cliente, valor);
        double juros = operacao.calcularJurosPrimeiroMes();
        System.out.println("------------------------------------------");
        System.out.println("Modalidade : " + operacao.getModalidade());
        System.out.println("Cliente    : " + operacao.getCliente());
        System.out.println("Juros 1º mês: R$ " + String.format("%.2f", juros));
        System.out.println("Documentos : " + String.join(", ", operacao.getDocumentos()));
        System.out.println("------------------------------------------");
    }
}
