//Author: Gulce Cansu Seckin
//Date: 04/02/2021
//Github: Cansu-Seckin

import java.util.Scanner;
public class RockPaperScissorsGame {

public static void main(String [] args) {
	System.out.println("*********Rock, Paper, Scissors!*********");
	
	//Nickname of the two players
	Scanner console=new Scanner(System.in);
	System.out.println("Player 1 Nickname: ");
	String name1=console.nextLine();
	System.out.println("Player 2 Nickname: ");
	String name2=console.nextLine();
	Scanner playerselection=new Scanner(System.in);

    //Choice of players to choose from rock,paper or scissor	
	int player1Turn=playerSelection(name1, playerselection);
	int player2Turn=playerSelection(name2, playerselection);
	
	//Winner of the game
	   if(player1Turn == player2Turn) {
		System.out.println("tie");
	 }
       else if (player1Turn==1 && player2Turn==3) { 
        System.out.println(name1 + "is the winner!");
     } else if (player1Turn==1 && player2Turn==2) {
        System.out.println("name2 is the winner!");
     } if (player1Turn==1 && player2Turn==2) {
        System.out.println("name2 is the winner!");
     } else if (player1Turn==1 && player2Turn==3) {
        System.out.println("name1 is the winner!");
     } if (player1Turn==2 && player2Turn==3) {
        System.out.println("name2 is the winner!");
     } else if (player2Turn==1) {
        System.out.println("name1 is the winner!");
     } if (player1Turn==3 && player2Turn==1) {
	      System.out.println("name2 is the winner!");
	 } else if (player1Turn==3 && player2Turn==2) {
	      System.out.println("name1 is the winner!");   
     }
	
 }


	//Selections of the game
public static int playerSelection(String name,Scanner playerselection) {
	System.out.println(name + " rock,paper or scissors ?");
	int playerTurn=playerselection.nextInt();
	
	return playerTurn;
}
		
}

