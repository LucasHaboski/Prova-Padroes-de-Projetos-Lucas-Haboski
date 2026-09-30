package factorymethod;

public class Main {
    public static void main(String[] args) {
        ConcessaoCredito pessoal = new ConcessaoPessoal();
        ConcessaoCredito consignado = new ConcessaoConsignado();
        ConcessaoCredito imobiliario = new ConcessaoImobiliario();

        pessoal.conceder("Kelvi Moacir", 15000.0);
        consignado.conceder("Guilherme Enache", 20000.0);
        imobiliario.conceder("CHristian Andrade", 400000.0);
    }
}
