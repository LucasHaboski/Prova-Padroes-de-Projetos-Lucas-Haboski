package factorymethod;

import java.util.List;

public class CreditoConsignado extends OperacaoCredito {

    public CreditoConsignado(String cliente, double valor) {
        super(cliente, valor);
    }

    @Override
    public String getModalidade() {
        return "Crédito Consignado";
    }

    @Override
    public double calcularJurosPrimeiroMes() {
        return valor * 0.018;
    }

    @Override
    public List<String> getDocumentos() {
        return List.of("Contracheque ou extrato de benefício");
    }
}
