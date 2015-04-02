import javax.swing.JOptionPane;

public class PessoaCalculoIMC {

    public static void main(String args[]) {
        IMC a = new IMC();

        float ResultadoIMC;
        String Peso = JOptionPane.showInputDialog("Digite o Peso");

        float peso = Float.parseFloat(Peso);
        String Altura = JOptionPane.showInputDialog("Digite a Altura");

        float altura = Float.parseFloat(Altura);
        ResultadoIMC = a.CalculoImc(peso, altura);
        System.out.println(ResultadoIMC);

        if (ResultadoIMC <= 18.5) {
            System.out.println("Abaixo do peso normal");
        } else if (18.5 < ResultadoIMC && ResultadoIMC <= 25) {
            System.out.println("Peso normal");
        } else if (25.0 < ResultadoIMC && ResultadoIMC <= 30.0) {
            System.out.println("Acima do peso normal");
        } else {
            System.out.println("Obesidade");
        }

    }
}
