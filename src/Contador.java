import java.util.Scanner;
// Alguns cenários de entrada ínvalida foram propositalmente ignorados.

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int parametroDois = scanner.nextInt();
         try {
             if (parametroUm > parametroDois) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro", parametroUm,parametroDois);
             int valorIteracao = contar(parametroUm,parametroDois);
             for (int iterator = 1; iterator <= valorIteracao; iterator++) {
                 System.out.println("Número : " + iterator);
             }
         } catch (ParametrosInvalidosException e) {
             throw new RuntimeException(e);
         }

    }

    static int contar( int parametroUm, int parametroDois){
        int contagem = parametroDois - parametroUm;
        return contagem;
    }
}
