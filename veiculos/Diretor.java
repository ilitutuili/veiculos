public class Diretor {
    private VeiculoBuilder builder;

    public void setBuilder(VeiculoBuilder builder) {
        this.builder = builder;
    }

    public void construirVeiculo() {
        builder.buildMotor();
        builder.buildTransmissao();
        builder.buildCor();
        builder.buildRodas();
    }

    public Veiculo getVeiculo() {
        return builder.getVeiculo();
    }
}