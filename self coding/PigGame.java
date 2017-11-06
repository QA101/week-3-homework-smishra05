import java.util.Scanner;
public class PigGame {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Pig Game");
		int num_players = 0;
		
		num_players = Integer.parseInt(args[0]);
		int score[] = new int[num_players];
		int playing = 1;
		Scanner input = new Scanner(System.in);
		
		String command = "";
		
		if (num_players < 2 || num_players>4)
		{
			System.out.println("Wrong no. of players");
			input.close();
			
		}else 
		{
				int currentplayer = 0;
				int tempscore = 0; //holds score for current chance
				while(currentplayer<num_players && playing == 1)
				{
					System.out.println("You are player number "+currentplayer);
					System.out.println("What would you like to do - you have following options -ROLL - rolls the die;HOLD - hold with current score;QUIT - exit the game;PRINT - shows the current score");
					command = input.nextLine();
					if(command.equalsIgnoreCase("ROLL"))
					{
						int dice = rollingdice();
						if(dice ==1)
						{
							System.out.println("Oops you rolled a 1, your chance is over");
							tempscore = 0;
							currentplayer= (currentplayer+1)%num_players; //rotating till the num of players
						}else
						{
							System.out.println("You rolled a : "+ dice);
							tempscore = tempscore+dice;
							System.out.println("Your current score is : " + tempscore);
							
						}
					}
					else if(command.equalsIgnoreCase("HOLD"))
					{
						updatescore(score,currentplayer,tempscore);
						
						if(score[currentplayer]>=100)
						{
							System.out.println("You are the winner with "+score[currentplayer]+" points");
						}else 
						{
							currentplayer= (currentplayer+1)%num_players;
							tempscore = 0;
						}
					}else if(command.equalsIgnoreCase("PRINT"))
					{
						int finalscore = tempscore+score[currentplayer];
						System.out.println("Your final score is : "+finalscore);
						
					}else if(command.equalsIgnoreCase("QUIT"))
					{
						playing = 0;
						
					}

					if(playing == 0)
					{
						System.out.println("Thank you for playing the Pig Game");
					}
					
				}// closing while
			}//closing else
			
		}//closing main
		
	

	private static int rollingdice() {
		int dice = (int) (Math.random()*6);
		return dice;
	}

	private static void updatescore(int[] score,int currentplayer,int currentscore) 
		{
			int sum = 0;
			sum=currentscore+score[currentplayer];
			score[currentplayer]=sum;			
	}
	
	}