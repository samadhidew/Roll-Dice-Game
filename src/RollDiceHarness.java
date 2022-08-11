import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class RollDiceHarness {
 public static void main(String [] args){
 
 Scanner sc = new Scanner(System.in);
System.out.print("Enter the LuckyNumber: ");
 int Lno=sc.nextInt();
int x1;
do{
 Random random = new Random();
RollDiceGame RDG = new RollDiceGame(random.nextInt(7)); 
  x1=RDG.getRollDice(); 
  sc.nextLine(); 
 System.out.print("Enter yes or no to roll the dice: ");
 String answer=sc.nextLine(); 
 if(answer.equals("yes")){
System.out.print("The Rolled Dice number is: ");
System.out.println(RDG.getRollDice());
 
 if(x1==Lno){
         System.out.println("You won the game");
 }
 }
}while(Lno!=x1);

System.out.print("Do you wish to go to the next level:");
 String level2=sc.nextLine();
if(level2.equals("yes")){
System.out.print("Enter the Number of chances: ");
 int chances=sc.nextInt();
System.out.print("Enter the LuckyNumber: ");
 int Lno2=sc.nextInt();
int y1;
int y2;
int count1=0;
int count2=0;
for(int y=0; y<=chances; y++){
 Random random = new Random();
RollDiceGame RDG = new RollDiceGame(random.nextInt(7)); 
  y1=RDG.getRollDice(); 
  sc.nextLine(); 
 System.out.print("Player1:Enter yes or no to roll the dice: ");
 String answer1=sc.nextLine(); 
 if(answer1.equals("yes")){
System.out.print("The Rolled Dice number is: ");
System.out.println(RDG.getRollDice());
 
 if(y1==Lno2){
    
        count1= count1+1;
 }
 }
 
RollDiceGame RDG2 = new RollDiceGame(random.nextInt(7)); 
  y2=RDG2.getRollDice(); 
 System.out.print("Player2:Enter yes or no to roll the dice: ");
 String answer2=sc.nextLine(); 
 if(answer2.equals("yes")){
System.out.print("The Rolled Dice number is: ");
System.out.println(RDG2.getRollDice());
 
 if(y2==Lno2){
     
        count2= count2+1;
 }
 }
}
System.out.print("Player1 Total: ");
      System.out.println(count1);
       
      System.out.print("Player 2 Total: ");
      System.out.println(count2);
      
if(count1>count2){
     System.out.println("player 1 You won the game");
}
     else{
     System.out.println("player 2 You won the game");
}
}
else{
System.out.println("The game end");
}
System.out.print("Do you wish to go to the next level:");
 String level3=sc.nextLine();
if(level3.equals("yes")){
System.out.print("Enter the Number of chances: ");
 int chances=sc.nextInt();

int Z1=0;
int Z2=0;
int counts1=0;
int counts2=0;
for(int x=0; x<=chances; x++){
 Random random = new Random();
RollDiceGame RDG = new RollDiceGame(random.nextInt(7)); 
  Z1=RDG.getRollDice(); 
  sc.nextLine();
 System.out.print("Player1:Enter yes or no to roll the dice: ");
 String answer1=sc.nextLine(); 
 if(answer1.equals("yes")){
System.out.print("The Rolled Dice number is: ");
System.out.println(RDG.getRollDice());
 System.out.print("Earned stars: ");
for(int i=0; i<=Z1; i++)
{
    System.out.print("*");
}
 System.out.print("\n");
 counts1= counts1+Z1;     
 
 
 
RollDiceGame RDG3 = new RollDiceGame(random.nextInt(7)); 
  Z2=RDG3.getRollDice(); 
 System.out.print("Player2:Enter yes or no to roll the dice: ");
 String answer2=sc.nextLine(); 
 if(answer2.equals("yes")){
System.out.print("The Rolled Dice number is: ");
System.out.println(RDG3.getRollDice());
System.out.print("Earned stars: ");
for(int i=0; i<=Z2; i++)
{
    System.out.print("*");
}
 System.out.print("\n");
counts2= counts2+Z2;
 }
 }
}
 
      System.out.print("Player1 Total Stars: ");
      System.out.println(counts1);
       
      System.out.print("Player 2 Total Stars: ");
      System.out.println(counts2);
      
if(counts1>counts2){
     System.out.println("player 1 You won the game");
}
     else{
     System.out.println("player 2 You won the game");
}
}

else{
System.out.println("The game end");
}
System.out.println("End of the game");
}
 }


 

