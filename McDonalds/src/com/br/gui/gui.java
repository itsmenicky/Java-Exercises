package com.br.gui;
import com.br.functions.functions;
import java.io.IOException;
import java.util.Scanner;
public class gui {
    public static void apagartela() throws IOException, InterruptedException{

        if (System.getProperty("os.name").contains("Windows")){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
          }
          else{
              Runtime.getRuntime().exec("clear");
          }
    }
	public static void main(String[] args) throws IOException, InterruptedException{
		 Scanner input = new Scanner(System.in);
		 functions.lanches.add(null);
         functions.lanches.add("Big Mac");
         functions.lanches.add("Duplo Quarterao");
         functions.lanches.add("Quarterao com Queijo");
         functions.lanches.add("Mcnifico Bacon");
         functions.lanches.add("Duplo Cheddar Mcmelt");
         functions.bebidas.add(null);
         functions.bebidas.add("Coca Cola");
         functions.bebidas.add("Guarana");
	while (true) {
		 apagartela();
         System.out.println(functions.red + "||*************************||" + functions.reset);
         System.out.println(functions.red + "||" + functions.yellow + "Bem vindo ao McDonald's!!" + functions.red + "||" + functions.reset);
         System.out.println(functions.red + "||*************************||" + functions.reset);
         functions.mclogo();
         System.out.println("\nAperte ENTER para comecar -> ");
         input.nextLine();
         apagartela();
         functions.mclogo();
         apagartela();
         System.out.println(functions.yellow + "+---Escolha seu lanche!! (Digite o numero correspondente ao respectivo lanche)---+" + functions.reset);
         functions.cardapio();
         functions.pedir();
         int ultimolanche = functions.pedidoslanche.get(functions.pedidoslanche.size() - 1); 
         int ultimabebida = functions.pedidosbebida.get(functions.pedidosbebida.size() - 1); 
         String lanchecli = functions.lanches.get(ultimolanche);
         String bebidacli = functions.bebidas.get(ultimabebida);
         functions.precificar();
         String precolanche = functions.precoslanche.get(ultimolanche);
         String precobebida = functions.precosbebida.get(ultimabebida);
         double total = Double.parseDouble(precolanche) + Double.parseDouble(precobebida);
         apagartela();
         functions.mclogo();
         apagartela();
         System.out.println(functions.green + "+----------PEDIDO----------+" + functions.reset);
         System.out.println("                              ");
         System.out.println("                              ");
         System.out.println("     " + lanchecli + " - R$" + precolanche + "     ");
         System.out.println("     " + bebidacli + " - R$" + precobebida + "     ");
         System.out.println("                              ");
         System.out.println("                              ");
         System.out.println(functions.green + "+--------------------------+" + functions.reset);
         System.out.println(functions.green + "   Total a pagar: R$" + total + functions.reset);
         System.out.println("CONFIRMAR PEDIDO? (s/n) -> ");
         String option = input.nextLine();
         switch(option) {
           case "s":
        	 apagartela();
             System.out.println(functions.green + "Pedido finalizado!" + functions.reset);
             Thread.sleep(2000);
             continue;
           case "n": 
        	   apagartela();
        	   functions.cancelamento();
        	   System.out.println(functions.red + "Retornando para a tela inicial..." + functions.reset);
        	   Thread.sleep(2000);
        	   continue;
         }
	}
	}
}