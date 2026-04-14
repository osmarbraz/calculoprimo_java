
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        //Variáveis
        int n;
        boolean ePrimo = true;

        // Entrada
        // Leitura do número
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        // Processamento
        // Números menores que 2 não são primos.
        // 0 e 1 não são primos.
        if (n <= 1) {
            ePrimo = false;
        } else {
            // O número 2 é primo (e é o único primo par).
            if (n == 2) {
                ePrimo = true;
            } else {
                // Pares maiores que 2 não são primos
                if (n % 2 == 0) {
                    ePrimo = false;
                } else {
                    // Verifica divisores de 3 até n, apenas ímpares
                    int contaDivisores = 0;
                    for (int i = 1; i <= n; i += 2) {
                        if (n % i == 0) {
                            contaDivisores = contaDivisores + 1;
                        }
                    }
                    if (contaDivisores > 2) {
                        ePrimo = false;
                    }
                }
            }
        }

        // Saída
        if (ePrimo) {
            JOptionPane.showMessageDialog(null, n + " é um número primo.");
        } else {
            JOptionPane.showMessageDialog(null, n + " não é um número primo.");
        }
    }
}
