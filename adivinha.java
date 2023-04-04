//Greetings User! Code by itsmenicky ;)

import java.util.Random;
import java.io.IOException;
import java.util.Scanner;

public class adivinha{
  public static void main(String[]args) throws IOException, InterruptedException{
  Scanner input = new Scanner(System.in);
  Random gerador = new Random();
  int numero, tentativa;
  String option;
  String black, red, green, yellow, blue, magenta, cyan, white, reset;

  black = "\u001b[30m";
  red =  "\u001b[31m";
  green =  "\u001b[32m";
  yellow =  "\u001b[33m";
  blue = "\u001b[34m";
  magenta = "\u001b[35m";
  cyan = "\u001b[36m";
  white = "\u001b[37m";
  reset = "\u001b[0m";

  if (System.getProperty("os.name").contains("Windows")){
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
  }
  else{
      Runtime.getRuntime().exec("clear");
  }

  System.out.print(red + "\n |*" + "****************************************" + red + "*| " + reset);
  System.out.print(red + "\n |* " + "                                      " + red + " *| " + reset);
  System.out.print(red + "\n |* " + reset);
  System.out.print(blue + "Bem vindo ao Adivinhe o Número!!!!!!!!!" + red + "*| " + reset);
  System.out.print(red + "\n |* " + "                                      " + red + " *| " + reset);
  System.out.print(red + "\n |*" + "****************************************" + red + "*| " + reset);
  Thread.sleep(2000);
  if (System.getProperty("os.name").contains("Windows")){
	    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
  }
  else{
	    Runtime.getRuntime().exec("clear");
  }
  tentativa = 0;
  numero = gerador.nextInt(101);
  
  while (tentativa != numero){

      if (System.getProperty("os.name").contains("Windows")){
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      }
      else{
          Runtime.getRuntime().exec("clear");
      }
      
      System.out.print(blue + "Insira um número positivo entre 0 e 100 -> " + reset);
      tentativa = input.nextInt();

      if(tentativa <0 || tentativa >100){
        System.out.println(red + "Insira SOMENTE números entre 0 e 100" + reset);
        Thread.sleep(2000);
        continue;
      }else if (tentativa > numero){
        System.out.println(yellow + "...é menor..." + reset);
        Thread.sleep(2000);
        continue;
      }else if (tentativa < numero){
        System.out.println(yellow + "...é maior..." + reset);
        Thread.sleep(2000);
        continue;
      }else{
        System.out.print(green + "Você ganhou!!" + reset);
        Thread.sleep(2000);
        if (System.getProperty("os.name").contains("Windows")){
          new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        else{
            Runtime.getRuntime().exec("clear");
        }

        System.out.print(blue + "Deseja jogar novamente? (s/n) -> " + reset);
        option = input.next();

        if(option.equals("s")){
          numero = gerador.nextInt(101);
          continue;
        }else if(option.equals("n")){
          System.exit(0);
        }else{
          System.out.print(red + "Resposta inválida!!" + reset);
          Thread.sleep(2000);
          System.exit(0);
        }
      }
  }
  }
}
