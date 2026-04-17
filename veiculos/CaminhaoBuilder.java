public class CaminhaoBuilder implements VeiculoBuilder {
    private Veiculo veiculo;

    public CaminhaoBuilder() {
        veiculo = new Veiculo();
    }

    public void buildMotor() {
        veiculo.setMotor("Motor Diesel");
    }

    public void buildTransmissao() {
        veiculo.setTransmissao("Manual Pesada");
    }

    public void buildCor() {
        veiculo.setCor("Branco");
    }

    public void buildRodas() {
        veiculo.setRodas(8);
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
}