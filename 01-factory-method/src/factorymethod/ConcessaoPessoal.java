package factorymethod;

public class ConcessaoPessoal extends ConcessaoCredito {

    @Override
    protected OperacaoCredito criarOperacao(String cliente, double valor) {
        return new CreditoPessoal(cliente, valor);
    }
}
