import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();

        System.out.println("Escolha o veículo:");
        System.out.println("1 - Carro");
        System.out.println("2 - Caminhão");
        System.out.println("3 - Moto");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String tipoVeiculo = "";
        switch (opcao) {
            case 1:
                tipoVeiculo = "Carro";
                veiculo.setRodas(4);
                break;
            case 2:
                tipoVeiculo = "Caminhão";
                veiculo.setRodas(8);
                break;
            case 3:
                tipoVeiculo = "Moto";
                veiculo.setRodas(2);
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }

        // Escolher motor
        System.out.println("Escolha o motor:");
        System.out.println("1 - Motor 1.0");
        System.out.println("2 - Motor 2.0");
        System.out.println("3 - Motor Diesel");
        System.out.println("4 - Motor 150cc");
        int motorOp = scanner.nextInt();
        scanner.nextLine();
        switch (motorOp) {
            case 1: veiculo.setMotor("Motor 1.0"); break;
            case 2: veiculo.setMotor("Motor 2.0"); break;
            case 3: veiculo.setMotor("Motor Diesel"); break;
            case 4: veiculo.setMotor("Motor 150cc"); break;
            default: veiculo.setMotor("Motor Padrão");
        }

        // Escolher transmissão
        System.out.println("Escolha a transmissão:");
        System.out.println("1 - Manual");
        System.out.println("2 - Automática");
        System.out.println("3 - Manual Pesada");
        int transOp = scanner.nextInt();
        scanner.nextLine();
        switch (transOp) {
            case 1: veiculo.setTransmissao("Manual"); break;
            case 2: veiculo.setTransmissao("Automática"); break;
            case 3: veiculo.setTransmissao("Manual Pesada"); break;
            default: veiculo.setTransmissao("Manual");
        }

        // Escolher cor
        System.out.println("Escolha a cor:");
        System.out.println("1 - Preto");
        System.out.println("2 - Branco");
        System.out.println("3 - Vermelha");
        System.out.println("4 - Azul");
        int corOp = scanner.nextInt();
        scanner.nextLine();
        switch (corOp) {
            case 1: veiculo.setCor("Preto"); break;
            case 2: veiculo.setCor("Branco"); break;
            case 3: veiculo.setCor("Vermelha"); break;
            case 4: veiculo.setCor("Azul"); break;
            default: veiculo.setCor("Preto");
        }

        System.out.println("\nVeículo construído:");
        System.out.println("Tipo: " + tipoVeiculo);
        System.out.println(veiculo);

        scanner.close();
    }
}