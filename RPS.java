import java.util.Random;
import java.util.Scanner;

public class RPS{
 public static void main(String[] arg){
  Scanner sc = new Scanner(System.in);
  Random r = new Random();
  
  System.out.println("Enter your choice \n 1 - Rock \n 2 - Paper \n 3 - Scissor");
  int u_input = sc.nextInt();
  
  int pc = r.nextInt(3);
 
  if (pc==1) System.out.println("\"Rock\"");
  else if(pc==2) System.out.println("\"Paper\"");
  else if(pc==3) System.out.println("\"Scissor\"");
 
  byte result = 0;
  if (u_input==1){
    if(pc==1) result=2;
    else if(pc==2) result=1;
    else if(pc==3) result=0;
  }
  else if(u_input==2){
    if(pc==1) result=0;
    else if(pc==2) result=2;
    else if(pc==3) result=1;
   }
  else if(u_input==3){
    if(pc==1) result=1;
    else if(pc==2) result=0;
    else if(pc==3) result=2;
 }
   else System.out.println("Invalid input");

   if(result==0) System.out.println("\t \t You Won!!!!");
   else if(result==1) System.out.println("\t \t I Won!!!!");
   else if(result==2) System.out.println("\t \t O!!!! its a tie");

  }
}