package factorymethod;

public class ConcessaoImobiliario extends ConcessaoCredito {

    @Override
    protected OperacaoCredito criarOperacao(String cliente, double valor) {
        return new CreditoImobiliario(cliente, valor);
    }
}
