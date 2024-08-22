public class OperarodesRelacionais {
    public static void main(String[] args) {
        // Comparando dois números com operadores relacionais
        int numero1 = 5;
        int numero2 = 2;

        if(numero1 > numero2) {
            System.out.print("Numero 1 maior que numero 2");
        } 
        else if(numero1 < numero2) {
            System.out.print("Numero 1 menor que numero 2");
        } 
        else if(numero1 >= numero2) {
            System.out.print("Numero 1 maior ou igual que numero 2");
        } 
        else if(numero1 <= numero2) {
            System.out.print("Numero 1 menor ou igual que numero 2");
        } 
        else if(numero1 != numero2) {
            System.out.print("Numero 1 é diferente de numero 2");
        }
    }
}
