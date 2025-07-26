
import java.util.Scanner;

class Calculadora {
    private static Calculadora instance;
    
    private final int primeiro;
    private final int segundo;
    
    public Calculadora (int primeiro, int segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }
    
    public int pegarPrimeiro() {
        return primeiro;
    }
    public int pegarSegundo() {
        return segundo;
    }
    
    public static Calculadora singleton() {
        if (instance == null) {
            var input = new Scanner (System.in);
            System.out.print("Digite um número: ");
            var primeiro = input.nextInt();
            System.out.print("Digite outro número: ");
            var segundo = input.nextInt();
            instance = new Calculadora(primeiro, segundo);
        }
        return instance;
    }
    
    public int Soma() {
        return primeiro + segundo;
    }

    public int Subtracao() {
        return primeiro - segundo;
    }
    public int Multiplicacao() {
        return primeiro * segundo;
    }
    public int Divisao() {
        return primeiro / segundo;
    }
    
    public static void main(String[] args) {
        Calculadora calculadora = Calculadora.singleton();
        System.out.println(calculadora.pegarPrimeiro() + " + " + calculadora.pegarSegundo() + " = " + calculadora.Soma());
        System.out.println(calculadora.pegarPrimeiro() + " - " + calculadora.pegarSegundo() + " = " + calculadora.Subtracao());
        System.out.println(calculadora.pegarPrimeiro() + " * " + calculadora.pegarSegundo() + " = " + calculadora.Multiplicacao());
        System.out.println(calculadora.pegarPrimeiro() + " / " + calculadora.pegarSegundo() + " = " + calculadora.Divisao());
    }
}    