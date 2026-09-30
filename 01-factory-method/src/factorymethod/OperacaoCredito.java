package factorymethod;

import java.util.List;

public abstract class OperacaoCredito {

    protected String cliente;
    protected double valor;

    public OperacaoCredito(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    public abstract String getModalidade();

    public abstract double calcularJurosPrimeiroMes();

    public abstract List<String> getDocumentos();

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }
}
