public class CarroBuilder implements VeiculoBuilder {
    private Veiculo veiculo;

    public CarroBuilder() {
        veiculo = new Veiculo();
    }

    public void buildMotor() {
        veiculo.setMotor("Motor 1.0");
    }

    public void buildTransmissao() {
        veiculo.setTransmissao("Automática");
    }

    public void buildCor() {
        veiculo.setCor("Preto");
    }

    public void buildRodas() {
        veiculo.setRodas(4);
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
}