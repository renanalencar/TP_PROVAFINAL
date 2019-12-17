/**
 * Primo
 */
public class Primo {

    public static boolean chk_primo(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int num = 0;
        String s;
        System.out.print("Digite um número inteiro e positivo: ");
        s = System.console().readLine();
        num = Integer.parseInt(s);

        if (chk_primo(num)) {
            System.out.println("Número informado é primo!");
        } else {
            System.out.println("Número informado não é primo!");
        }
    }
}