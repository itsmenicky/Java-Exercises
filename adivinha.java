//Greetings User! Code by itsmenicky ;)

import java.util.Random;
import java.io.IOException;
import java.util.Scanner;

public class adivinha{
  public static void apagartela() throws IOException, InterruptedException{
    if (System.getProperty("os.name").contains("Windows")){
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    else{
        Runtime.getRuntime().exec("clear");
    }
  }
  public static final String blue = "\u001B[34m";
  public static final String red = "\u001b[31m";
  public static final String green = "\u001b[32m";
  public static final String yellow = "\u001b[33m";
  public static final String reset = "\u001b[0m";

  public static void main(String[]args) throws IOException, InterruptedException{
  Scanner input = new Scanner(System.in);
  Random gerador = new Random();
  apagartela();

  System.out.print(red + "\n |*" + "****************************************" + red + "*| " + reset);
  System.out.print(red + "\n |* " + "                                      " + red + " *| " + reset);
  System.out.print(red + "\n |* " + reset);
  System.out.print(blue + "Bem vindo ao Adivinhe o Número!!!!!!!!!" + red + "*| " + reset);
  System.out.print(red + "\n |* " + "                                      " + red + " *| " + reset);
  System.out.print(red + "\n |*" + "****************************************" + red + "*| " + reset);
  Thread.sleep(2000);
  apagartela();
  int tentativa = 0;
  int numero = gerador.nextInt(101);
  
  while (tentativa != numero){
      apagartela();
      System.out.println(blue + "Insira um número positivo entre 0 e 100 -> " + reset);
      tentativa = input.nextInt();

      if(tentativa < 0 || tentativa >100){
            System.out.println(red + "Insira SOMENTE números entre 0 e 100" + reset);
            Thread.sleep(2000);
            continue;
      }else if(tentativa > numero){
            System.out.println(yellow + "...é menor..." + reset);
            Thread.sleep(2000);
            continue;
      }else if(tentativa < numero){
            System.out.println(yellow + "...é maior..." + reset);
            Thread.sleep(2000);
            continue;
      }else{
            System.out.print(green + "Você ganhou!!" + reset);
            Thread.sleep(2000);
            System.out.print(blue + "Deseja jogar novamente? (s/n) -> " + reset);
            String option = input.next();
            switch(option){
              case "s":
                numero = gerador.nextInt(101);
                continue;
              case "n":
                System.exit(0);
              default:
                System.out.print(red + "Resposta Invalida!!" + reset);
                Thread.sleep(2000);
                System.exit(0);
            }
      }
      }
  }
  }
