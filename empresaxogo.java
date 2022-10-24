class empresaxogo{

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        calcularEntrada();
    }
    
    public static void calcularEntrada() {
        int idade;
        double prezo;
        
        System.out.println("Indica la edad del cliente");
        idade = input.nextInt();
        if (idade < 4 && idade >= 0) {
            prezo = 0;
        } else {
            if (idade < 18) {
                prezo = 5;
            } else {
                if (idade >= 18) {
                    prezo = 10;
                } else {
                    System.out.println("Non valido");
                }
            }
        }
        System.out.println("O prezo da entrada para o cliente é " + prezo);
    }
}
}