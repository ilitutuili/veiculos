public class Veiculo {
    private String motor;
    private String transmissao;
    private String cor;
    private int rodas;

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Veiculo {" +
                "\n Motor: " + motor +
                "\n Transmissao: " + transmissao +
                "\n Cor: " + cor +
                "\n Rodas: " + rodas +
                "\n}";
    }
}