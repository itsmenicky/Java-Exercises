package com.br.functions;
import java.util.Scanner;
import java.util.ArrayList;
public class functions {
	public static final String red = "\u001b[31m";
    public static final String yellow = "\u001b[33m";
    public static final String reset = "\u001b[0m";
    public static final String green = "\u001b[32m";
    public static final ArrayList<String> lanches = new ArrayList<String>();
    public static final ArrayList<String> bebidas = new ArrayList<String>();
    public static final ArrayList<Integer> pedidoslanche = new ArrayList<Integer>();
    public static final ArrayList<String> precoslanche = new ArrayList<String>();
    public static final ArrayList<String> precosbebida = new ArrayList<String>();
    public static final ArrayList<Integer> pedidosbebida = new ArrayList<Integer>();
    public static int i = 0;
    public static void precificar() {
    	
    	precoslanche.add(null);
    	precoslanche.add("22.90");
    	precoslanche.add("23.00");
    	precoslanche.add("23.00");
    	precoslanche.add("23.00");
    	precoslanche.add("23.00");
    	precosbebida.add(null);
    	precosbebida.add("6.00");
    	precosbebida.add("6.00");
    }
    public static void cardapio() {
    	//Visualização dos lanches
        System.out.println(red + "\n\n     +------------LANCHES------------+" + reset);
        for(i=1;i < functions.lanches.size();i++){
            System.out.print("\n\n        " + i + " - " + functions.lanches.get(i));
        }
        //Visualização das bebidas
        System.out.println(yellow + "\n\n     +------------BEBIDAS------------+" + reset);
        for(i=1;i < functions.bebidas.size();i++){
          System.out.print("\n\n        " + i + " - " + functions.bebidas.get(i));
        }
    }
    public static void pedir(){
    	  Scanner input = new Scanner(System.in);
          while (true){
	          System.out.println(green + "\n\n Numero de seu lanche -> " + reset);
	          int lanche = input.nextInt();
	          System.out.println(green + "\n\n Numero de sua bebida" + reset);
	          int bebida = input.nextInt();
	          if(lanche == 0 || bebida == 0) {
	        	  System.out.print(red + "O lanche ou bebida escolhidos nao existem!!" + reset);
	        	  continue;
	          }else {
	        	  try {
					  pedidoslanche.add(lanche);
					  pedidosbebida.add(bebida);
					  break;
				  }catch(Exception e){
					  System.out.println(red + "O lanche ou bebida escolhidos nao existem!!" + reset);
					  break;
				  }
	          }
          }
    }
    public static void mclogo() throws InterruptedException{

          Thread.sleep(150);
          System.out.println(yellow + "       ||           ||");
          Thread.sleep(150);
          System.out.println(yellow + "       ||||       ||||");
          Thread.sleep(150);
          System.out.println(yellow + "       ||||       ||||");
          Thread.sleep(150);
          System.out.println(yellow + "     |||  ||_____||  |||");
          Thread.sleep(150);
          System.out.println(yellow + "     |||   |     |   |||");
          Thread.sleep(150);
          System.out.println(yellow + "     |||    |   |    |||");
          Thread.sleep(150);
          System.out.println(yellow + "     |||     | |     |||");
          Thread.sleep(150);
          System.out.println(yellow + "    ||||     | |     ||||");
          Thread.sleep(150);
          System.out.println(yellow + "    ||||     | |     ||||");
          Thread.sleep(150);
          System.out.println(yellow + "    ||||     | |     |||| ");
          Thread.sleep(150);
          System.out.println(yellow + "    ||||     |_|     |||| ");
          Thread.sleep(150);
          System.out.println(yellow + "    ||||             |||| ");
          Thread.sleep(150);
          System.out.println(yellow + "    ||||             |||| " + reset);
    }
    public static void cancelamento() {
    	 int ultimolanche = functions.pedidoslanche.get(functions.pedidoslanche.size() - 1); 
         int ultimabebida = functions.pedidosbebida.get(functions.pedidosbebida.size() - 1);
         int locultimolanche = pedidoslanche.indexOf(ultimolanche);
         int locultimabebida = pedidosbebida.indexOf(ultimabebida); 
         pedidoslanche.remove(locultimolanche);
         pedidosbebida.remove(locultimabebida);
    }
}
