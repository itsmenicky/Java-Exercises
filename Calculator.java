// Greetings User!! Code by IsolatedThinker ;)


import java.util.Scanner;
public class Calculator {
    public static void main(String[]args) {
      Scanner scan = new Scanner(System.in);

	       System.out.println("What is your name?: ");
	       String name = scan.next();

	       try {
	           Double.parseDouble(name);
	           System.out.println("Heyy...no numbers, enter with your name next time...exiting... ");
	           System.exit(0);
	       }catch(NumberFormatException e) {
	           System.out.println("Welcome " + name);
	       }

	       while (true){
	           String operation, answer;
	           double num1, num2, calculation;
	           
	           if (System.getProperty("os.name").contains("Windows"))
	               new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	           else
	               Runtime.getRuntime().exec("clear");

	           System.out.println("--> What we will gonna do now " + name + " (multiplication, division, sum or substraction)?");
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
	                    	System.out.println("Thanks " +  name + "for using my calculator ;)");
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
	                        	 System.out.println("Thanks " + name + " for using my calculator ;)");
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
	                        	 System.out.println("Thanks " + name +  " for using my calculator ;)");
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
	                             continue;
	                         }else if(answer.equals("n")){
	                        	 System.out.println("Thanks " + name + " for using my calculator ;)");
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
