/**
 * Geometria
 */
public class Geometria {

    public static int menu() {
        String s;
        int opt;
        System.out.println("MENU");
        System.out.println("1. Quadrado");
        System.out.println("2. Retangulo");
        System.out.println("3. Triangulo");
        System.out.println("4. Losango");
        System.out.println("5. Trapézio");
        System.out.println("6. Círculo");
        System.out.println("0. Sair");
        System.out.print("Que objeto você quer calcular a área? ");
        s = System.console().readLine();
        opt = Integer.parseInt(s);
        return opt;
    }

    public static void main(String[] args) {
        String s;
        int opcao = menu();

        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    double l = 0.0;
                    System.out.print("Digite o tamanho do lado: ");
                    s = System.console().readLine();
                    l = Double.parseDouble(s);
                    double a_qua = Math.pow(l, 2);
                    System.out.println("A área do quadrado é " + a_qua);
                    break;
                case 2:
                    double b_ret = 0.0;
                    double h_ret = 0.0;
                    System.out.print("Digite o tamanho da base: ");
                    s = System.console().readLine();
                    b_ret = Double.parseDouble(s);
                    System.out.print("Digite o tamanho da altura: ");
                    s = System.console().readLine();
                    h_ret = Double.parseDouble(s);
                    double a_ret = b_ret * h_ret;
                    System.out.println("A área do retangulo é " + a_ret);
                    break;
                case 3:
                    double b_tri = 0.0;
                    double h_tri = 0.0;
                    System.out.print("Digite o tamanho da base: ");
                    s = System.console().readLine();
                    b_tri = Double.parseDouble(s);
                    System.out.print("Digite o tamanho da altura: ");
                    s = System.console().readLine();
                    h_tri = Double.parseDouble(s);
                    double a_tri = (b_tri * h_tri) / 2;
                    System.out.println("A área do triangulo é " + a_tri);
                    break;
                case 4:
                    double d_maior = 0.0;
                    double d_menor = 0.0;
                    System.out.print("Digite o tamanho da diagonal maior: ");
                    s = System.console().readLine();
                    d_maior = Double.parseDouble(s);
                    System.out.print("Digite o tamanho da diagonal menor: ");
                    s = System.console().readLine();
                    d_menor = Double.parseDouble(s);
                    double a_lo = (d_maior * d_menor) / 2;
                    System.out.println("A área do triangulo é " + a_lo);
                    break;
                case 5:
                    double b_maior = 0.0;
                    double b_menor = 0.0;
                    System.out.print("Digite o tamanho da base maior: ");
                    s = System.console().readLine();
                    d_maior = Double.parseDouble(s);
                    System.out.print("Digite o tamanho da base menor: ");
                    s = System.console().readLine();
                    d_menor = Double.parseDouble(s);
                    double a_tra = (b_maior * b_menor) / 2;
                    System.out.println("A área do triangulo é " + a_tra);
                    break;
                case 6:
                    double r = 0.0;
                    System.out.print("Digite o tamanho do raio: ");
                    s = System.console().readLine();
                    r = Double.parseDouble(s);
                    r = Math.PI * Math.pow(r, 2);
                    System.out.println("A área do quadrado é " + r);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }

}