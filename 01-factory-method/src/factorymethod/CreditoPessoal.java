package factorymethod;

import java.util.List;

public class CreditoPessoal extends OperacaoCredito {

    public CreditoPessoal(String cliente, double valor) {
        super(cliente, valor);
    }

    @Override
    public String getModalidade() {
        return "Crédito Pessoal";
    }

    @Override
    public double calcularJurosPrimeiroMes() {
        return valor * 0.035;
    }

    @Override
    public List<String> getDocumentos() {
        return List.of("Documento de identidade", "Comprovante de renda");
    }
}
