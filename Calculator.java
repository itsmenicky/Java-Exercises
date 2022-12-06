import java.io.IOException;
import java.util.Scanner;
public class Calculator {
    public static void main(String[]args) throws IOException, InterruptedException {
       Scanner scan = new Scanner(System.in);

       System.out.println("Qual seu nome?: ");
       String nome = scan.next();

       try {
           Double.parseDouble(nome);
           System.out.println("Heyy...sem números, insira seu nome na próxima...saindo... ");
           System.exit(0);
       }catch(NumberFormatException e) {
           System.out.println("Seja bem vindo " + nome);
       }

       while (true){
           String operation, answer;
           double num1, num2, calculation;

           System.out.println("--> What we will gonna do now " + nome + " (multiplication, division, sum or substraction)?");
           operation = scan.next();

           if(operation.equals("multiplication")){
               System.out.println("Enter with the first factor: ");
               num1 = scan.nextDouble();

               System.out.println("Enter with the second factor: ");
               num2 = scan.nextDouble();

               calculation = num1 * num2;
               System.out.println(calculation);

               System.out.println("--> Want to do another operation? (y/n): ");
               answer = scan.next();

                    if(answer.equals("y")){
                        continue;
                    }else if(answer.equals("n")){
                        System.exit(0);
                    }else{
                        System.out.println("Invalid answer!!");
                        System.exit(0);
               }

           }else if(operation.equals("division")){
               System.out.println("Enter with the dividend: ");
               num1 = scan.nextDouble();

               System.out.println("Enter with the divisor: ");
               num2 = scan.nextDouble();

               calculation = num1 / num2;
               System.out.println(calculation);

               System.out.println("--> Want to do another operation? (y/n): ");
               answer = scan.next();

                         if(answer.equals("y")){
                             continue;
                         }else if(answer.equals("n")){
                             System.exit(0);
                         }else{
                             System.out.println("Invalid answer!!");
                             System.exit(0);
                         }

           }else if (operation.equals("sum")){
               System.out.println("Enter with the first number: ");
               num1 = scan.nextDouble();

               System.out.println("Enter with the second number: ");
               num2 = scan.nextDouble();

               calculation = num1 + num2;
               System.out.println(calculation);

               System.out.println("--> Want to do another operation? (y/n): ");
               answer = scan.next();

                         if(answer.equals("y")){
                             continue;
                         }else if(answer.equals("n")){
                             System.exit(0);
                         }else{
                             System.out.println("Invalid answer!!");
                             System.exit(0);
                         }

           }else if (operation.equals("substraction")){
               System.out.println("Enter with the first number: ");
               num1 = scan.nextDouble();

               System.out.println("Enter with the second second: ");
               num2 = scan.nextDouble();

               calculation = num1 - num2;
               System.out.println(calculation);

               System.out.println("--> Want to do another operation? (y/n): ");
               answer = scan.next();

                         if(answer.equals("y")){
                             if (System.getProperty("os.name").contains("Windows")) {
                                 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                             }else{
                                 Runtime.getRuntime().exec("clear");

                         }
                             continue;
                         }else if(answer.equals("n")){
                             System.exit(0);
                         }else{
                             System.out.println("Invalid answer!!");
                             System.exit(0);
                         }

           }else {
               System.out.println("Invalid operation!!");
           }
        }
    }
}
