package factorymethod;

public class ConcessaoConsignado extends ConcessaoCredito {

    @Override
    protected OperacaoCredito criarOperacao(String cliente, double valor) {
        return new CreditoConsignado(cliente, valor);
    }
}
