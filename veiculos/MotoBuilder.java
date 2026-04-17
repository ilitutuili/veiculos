public class MotoBuilder implements VeiculoBuilder {
    private Veiculo veiculo;

    public MotoBuilder() {
        veiculo = new Veiculo();
    }

    public void buildMotor() {
        veiculo.setMotor("Motor 150cc");
    }

    public void buildTransmissao() {
        veiculo.setTransmissao("Manual");
    }

    public void buildCor() {
        veiculo.setCor("Vermelha");
    }

    public void buildRodas() {
        veiculo.setRodas(2);
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
}