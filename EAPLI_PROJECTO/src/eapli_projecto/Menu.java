package eapli_projecto;

import java.util.Scanner;




public class Menu {

   private static int opcao;
    
    public void menu1() {
       
        
        
        do {
            opcao = menu();

            switch (opcao) {

                case 1:
                    System.out.println("");
                    ;
                    break;

                case 2:
                    System.out.println("");

                    break;



                case 0:
                    System.out.println("aplicacao a encerrar...");

                    break;

                default:
                    System.out.println("opcao invalida! volte a escolher");

                    break;

            }




        } while (opcao != 0);
               
    }
    
     public static int menu() {

       

        System.out.println("-------Menu-------\n");

        System.out.println("1 - Registo de Despesas");
        System.out.println("2 - ");
        System.out.println("3 - ");
        
        System.out.println("0 - Sair");

        System.out.println("\nqual a opcao pretendida?");
        Scanner inX = new Scanner(System.in);
        opcao = inX.nextInt();

        return opcao;
    }
}
