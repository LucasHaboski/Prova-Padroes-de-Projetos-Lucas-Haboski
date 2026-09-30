package factorymethod;

import java.util.List;

public class CreditoImobiliario extends OperacaoCredito {

    public CreditoImobiliario(String cliente, double valor) {
        super(cliente, valor);
    }

    @Override
    public String getModalidade() {
        return "Crédito Imobiliário";
    }

    @Override
    public double calcularJurosPrimeiroMes() {
        return valor * 0.008;
    }

    @Override
    public List<String> getDocumentos() {
        return List.of("Matrícula do imóvel", "Comprovante de renda");
    }
}
