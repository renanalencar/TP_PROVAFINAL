/**
 * Estacoes
 */
public class Estacoes {

    public static void main(String[] args) {
        String s;
        int dia = 0, mes = 0;
        System.out.print("Digite o dia: ");
        s = System.console().readLine();
        dia = Integer.parseInt(s);
        System.out.print("Digite o mês: ");
        s = System.console().readLine();
        mes = Integer.parseInt(s);

        if (mes == 10 || mes == 11) {
            System.out.println("É primavera!");
        } else if (mes == 1 || mes == 2 ) {
            System.out.println("É verão!");
        } else if (mes == 4 || mes == 5) {
            System.out.println("É outono!");
        } else if (mes == 7 || mes == 8) {
            System.out.println("É inverno!");
        } else {
            if (mes == 12) {
                if (dia <= 20) {
                    System.out.println("É primavera!");
                } else {
                    System.out.println("É verão!");
                }
            } else if(mes == 3) {
                if (dia <= 20) {
                    System.out.println("É verão!");
                } else {
                    System.out.println("É primavera!");
                }
            } else if (mes == 6) {
                if (dia <= 20) {
                    System.out.println("É outono!");
                } else {
                    System.out.println("É inverno!");
                }
            } else if (mes == 9) {
                if (dia <= 20) {
                    System.out.println("É inverno!");
                } else {
                    System.out.println("É primavera!");
                }
            } else {
                System.out.println("O mês digitado é inválido!");
            }
        }

    }
}