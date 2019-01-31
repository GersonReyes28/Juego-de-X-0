/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaboratorioI;
import java.util.Scanner;

public class ProyectoI {

public static void main (String arg[]){
        
        //----- Variables -----
        
        String player1;
        String player2;
        String symbol1;
        String symbol2;
        boolean ganador = false;
        Scanner read = new Scanner(System.in);
        int menu = 0;
        boolean finish = false;
        boolean error = false;        
        boolean tie = false;
        String step1a = "_",step1b = "_",step1c = "_"; //0,1,2
        String step2a = "_",step2b = "_",step2c = "_"; //3,4,5
        String step3a = "_",step3b = "_",step3c = "_"; //6,7,
        int position = 0;
        int turn = 1;
        String symbol3 = "";
        int win1=0;
        int win2=0;

        //----- Main Menu ------
        System.out.print("Enter the name of the player one: ");
        player1 = read.nextLine();
        System.out.print("Enter your Symbol: ");
        symbol1 = read.next();
        System.out.println("");
        System.out.print("Enter the name of the player two: ");
        player2 = read.next();
        System.out.print("Enter your Symbol: ");
        symbol2 = read.next();
        System.out.println("");
        
        
            //----- Game Logic -------
            while(finish != true){
                

                            
                System.out.println("\t   A\t    B\t    C");
                System.out.println("");
                System.out.println("1\t   "+step1a+"\t|   "+step1b+"\t|   "+step1c);
                System.out.println("");
                System.out.println("2\t   "+step2a+"\t|   "+step2b+"\t|   "+step2c);
                System.out.println("");
                System.out.println("3\t   "+step3a+"\t|   "+step3b+"\t|   "+step3c);
                
                if(
                    ((step1a == step1b && step1a == step1c && step1a != "_")|| //columnas
                    (step2a == step2b && step2a == step2c && step2a != "_")||
                    (step3a == step3b && step3a == step3c && step3a != "_")||

                    (step1a == step2a && step1a == step3a && step1a != "_")|| //filas
                    (step1b == step2b && step1b == step3b && step1b != "_")||
                    (step1c == step2c && step1c == step3c && step1c != "_")||

                    (step1a == step2b && step1a == step3c && step1a != "_")|| //diagonales
                    (step3a == step2b && step3a == step1c && step3a != "_"))
                   )
                    ganador = true;
                else if(
                        (step1a != "_" && step1b != "_" && step1c != "_" &&
                         step2a != "_" && step2b != "_" && step2c != "_" &&
                         step3a != "_" && step3b != "_" && step3c != "_")
                  )
                {
                    tie = true;
                    break;
                }                
                if(ganador)
                {
                    if(turn == 1)
                    {
                        System.out.println("");
                        System.out.println("el ganador es el jugador: "+player2);
                        win2++;
                    }
                    else
                    {
                        System.out.println("");
                        System.out.println("el ganador es el jugador: " +player1);
                        win1++;
                    }
                    finish = true;
                    break;
                    
                }
                else
                {
                    System.out.println("____________________________________________________");
                    System.out.println("1. Position 1A\t"+"4. Position 2A\t"+"7. Position 3A");
                    System.out.println("2. Position 1B\t"+"5. Position 2B\t"+"8. Position 3B");
                    System.out.println("3. Position 1C\t"+"6. Position 2C\t"+"9. Position 3C");
                    System.out.println("____________________________________________________");
                    System.out.print("En qué posición desea colocarse:");
                    position = read.nextInt();
                 
                }
                if(error)
                {
                    if(turn == 1)
                        turn++;
                    else
                        turn--;
                    error = false;
                }
                
                    if  (turn == 1)
                    {
                        
                        turn++;
                        symbol3 = symbol1;
                    }
                    
                    else if ( turn == 2)
                    {
                        turn--;
                        symbol3 = symbol2;
                            
                    }
                            

                    
                switch(position){
                    case 1:
                        

                        if (step1a == "_")
                        {
                             step1a = symbol3;
                        }
                        else
                        {
                            error = true;
                            System.out.println("position is not available");
                        }
                        
                        
                        break;
                        
                    case 2:
                        if (step1b =="_")
                        {
                            step1b = symbol3;
                        }
                        else
                        {
                            System.out.println("Position is not avalible");
                            error = true;
                        }
                        break;
                        
                    case 3:
                        if ( step1c =="_")
                        {
                            step1c = symbol3;
                        }
                        else
                        {
                            System.out.println("Position is not avalible");
                            error = true;
                        }
                        break;
                        
                    case 4:
                        if (step2a =="_")
                        {
                             step2a = symbol3;
                        }
                        else
                        {
                            System.out.println("Position is not avalible");
                            error = true;
                        }
                        break;
                        
                    case 5:
                        if (step2b=="_")
                        {
                             step2b = symbol3;
                        }
                        else
                        {
                            System.out.println("Position is not avalible");
                            error = true;
                        }
                        break;
                        
                    case 6:
                        if (step2c=="_")
                        {
                            step2c = symbol3;
                        }
                        else 
                            System.out.println("Position is not avalible");
                        break;
                        
                    case 7:
                        if (step3a=="_")
                        {
                            step3a = symbol3;
                        }
                        else
                        {
                            System.out.println("Position is not avalible");
                            error = true;
                        }
                        break;
                    case 8:
                        if(step3b=="_")
                        {
                            step3b = symbol3;
                        }
                        else
                        {
                            System.out.println("Position is not avalible");
                            error = true;
                        }
                        break;
                    case 9:
                        if(step3c=="_")
                        {
                        
                             step3c = symbol3;
                        }
                        else
                        {
                            System.out.println("Position is not avalible");
                            error = true;
                        }
                        break;
                        
                }
                

                

            }
           
        
    
    }
    
}
  