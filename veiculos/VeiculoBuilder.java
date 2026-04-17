public interface VeiculoBuilder {
    void buildMotor();
    void buildTransmissao();
    void buildCor();
    void buildRodas();
    Veiculo getVeiculo();
}