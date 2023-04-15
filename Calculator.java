import java.util.Scanner;
import java.io.IOException;
public class calculator {

    public static final String reset = "\u001B[0m";
    public static final String blue = "\u001B[34m";
    public static final String green = "\u001B[32m";
    public static final String red = "\u001B[31m";
    public static final String yellow = "\u001B[33m";
    public static void apagartela() throws IOException, InterruptedException{
        if (System.getProperty("os.name").contains("Windows")){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
          }
          else{
              Runtime.getRuntime().exec("clear");
          }
    }
    public static void main(String[] args) throws IOException, InterruptedException{
        //Greetings User!! Code by Isolated Thinker ;)
        Scanner scan = new Scanner(System.in);
        String nome, operacao, resposta;
        double num1=0, num2=0, resultado;

        System.out.println("Insira seu nome: ");
        nome = scan.next(); 
        apagartela();
        System.out.println(blue + "---|Bem-vindo a minha calculadora em Java " + nome +"!! Por: istmenicky|---" + reset);

        while (true){
            apagartela();
            System.out.println(green + "-->Oque iremos fazer agora " + nome + "? (multiplicacao, divisao, adicao, subtracao): " + reset);
            operacao = scan.next();
            String verificar = operacao.substring(operacao.length()-2);
            if(verificar.equals("ao")){
                apagartela();
                System.out.println("Insira o primeiro numero: ");
                num1 = scan.nextDouble();
                System.out.println("Insira o segundo numero: ");
                num2 = scan.nextDouble();
            }else{
                System.out.println("Operacao Invalida!!");
                System.exit(0);
            }
            apagartela();
    
            switch(operacao){
                
                case "multiplicacao":
                     resultado = num1 * num2;
                     System.out.println(green + "O resultado dessa " + operacao +" é " + resultado + reset);
                     Thread.sleep(2000);
                     break;
                case "divisao":
                     resultado = num1 / num2;
                     System.out.println(green + "O resultado dessa " + operacao +" é " + resultado + reset);
                     Thread.sleep(2000);
                     break;
                case "adicao":
                     resultado = num1 + num2;
                     System.out.println(green + "O resultado dessa " + operacao +" é " + resultado + reset);
                     Thread.sleep(2000);
                     break;  
                case "subtracao":
                     resultado = num1 - num2;
                     System.out.println(green + "O resultado dessa " + operacao +" é " + resultado + reset);
                     Thread.sleep(2000);
                     break;   

            }
             apagartela();
             System.out.println(yellow + "Deseja realizar outra operação??(s/n): " + reset);
             resposta = scan.next();
             if(resposta.equals("s")){
                 continue;
             }else if(resposta.equals("n")){
                 break;
             }else{
                 System.out.println(red + "Resposta inválida!!" + reset);
             }  

        }
        
    }
    
}
