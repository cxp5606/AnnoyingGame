/*Courtney Popielarz
 *2/13/15
 *Annoying Game
 */
 
 public class AnnoyingGame
 {
 	public static void main(String[] args)
 	{
 		//Set Up EasyReader
 		EasyReader consule= new EasyReader();
 		
 		//PlayAgain
	 	String pa="";
 		do
 		{
	 		//Declare
	 		int total=0;
	 		int aim=0;
	 		int max;
	 		int goal;
	 		String playerFirst;
	 		String win;
	 		int add;
	 		int incr;
	 		int base;
	 		pa="";
	 		
	 		//Input
	 		//goal
	 		do
	 		{
	 			System.out.print("Goal(10-99):   ");
	 			goal=consule.readInt();
	 		}while((goal<10)&&(goal>99));
	 		
	 		//max
	 		do
	 		{
				System.out.print("Numbers to add range 1-(2-9):   ");
	 			max=consule.readInt();
	 		}while((max<2)&&(max>9));
	 		
	 		//playerFirst
	 		do
	 		{
	 			System.out.print("The player goes first(yes/no):   ");
	 			playerFirst=consule.readWord();
	 		}while((!(playerFirst.equals("yes")))&&(!(playerFirst.equals("no"))));
	 		
	 		//win
	 		do
	 		{
	 			System.out.print("Reaching goal wins(yes/no):   ");
	 			win=consule.readWord();
	 		}while((!(win.equals("yes")))&&(!(win.equals("no"))));
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		//Math
	 		//Win=good
	 		if(win.equals("yes"))
	 		{
	 			//Sets my variables
	 			incr=max+1;
	 			base=goal%(incr);
	 			aim=base;
	 		
	 			//playerfirst
	 			if(playerFirst.equals("yes"))
	 			{
		 			//Keep running this setion of code until win
		 			do
		 			{
			 			//get what the player add while within the range
			 			do
			 			{
			 				System.out.println("Please enter a whole number 1-"+max);
			 				add=consule.readInt();
			 			}while((add<1||add>max)||(total+add>goal));
			
			 			//Update total
			 			total+=add;
			 			System.out.println("TOTAL:   "+total);
			
			 			//Check for a win
			 			if(total==goal)
			 			{
			 				System.out.println("YOU WIN!!!");
			 			}
			 			else
			 			{
				 			//Calculate computer's add
				 			if(aim==base)
				 			{
					 			if (total<aim)
					 			{
					 				add=aim-total;
					 				if (add>max)
					 				{
					 					add=1;
					 				}
					 			}
					 			else
					 			{
					 				aim+=incr;
					 				add=aim-total;
					 				if (add>max)
					 				{
					 					add=1;
					 				}
					 			}
				 			}
				 			else
				 			{
				 				if (total<aim)
					 			{
					 				add=aim-total;
					 				if (add>max)
					 				{
					 					add=1;
					 				}
					 			}
				 			}
			
				 			//update total
				 			total+=add;
				 			aim+=incr;
				 			System.out.println("I choose " + add + ".");
				 			System.out.println("TOTAL:   "+total);
			
				 			//Check for win
				 			if(total==goal)
				 			{
				 				System.out.println("Sorry but I win. Better luck next time!");
				 			}
				 		}
		 			}while(total!=goal);
		 		}
		 		
		 		
		 		//Comp first
		 		else
		 		{
		 			//Keep running this setion of code until win
		 			do
		 			{
			 			//calc comp's add
			 			add=aim-total;
			 			if(add>max)
			 			{
			 				add=1;
			 			}
			
			 			//update total
			 			total+=add;
			 			aim+=incr;
				 		System.out.println("I choose " + add + ".");
				 		System.out.println("TOTAL:   "+total);
			
			 			//check for win
			 			if(total==goal)
			 			{
			 				System.out.println("Sorry but I win. Better luck next time!");
			 			}
			 			else
			 			{
			 				//get what the player add while within the range
			 				do
				 			{
				 				System.out.println("Please enter a whole number 1-"+max);
				 				add=consule.readInt();
				 			}while((add<1||add>max)||(total+add>goal));
			
				 			//update total
				 			total+=add;
				 			System.out.println("TOTAL:   "+total);
			
				 			//check for win
				 			if(total==goal)
				 			{
				 				System.out.println("YOU WIN!!!");
				 			}
			 			}
			 		}while(total!=goal);
		 			
		 		}	
	 		}
	 		
	 		
	 		
	 		//win=bad
	 		else
	 		{
	 			//set my variables
	 			incr=max+1;
	 			base=(goal%(incr))-1;
	 			aim=base;
	 		
	 			//playerfirst
	 			if(playerFirst.equals("yes"))
	 			{
		 			//Keep running this setion of code until lose
		 			do
		 			{
			 			//get what the player add while within the range
			 			do
			 			{
			 				System.out.println("Please enter a whole number 1-"+max);
			 				add=consule.readInt();
			 			}while((add<1||add>max)||(total+add>goal));
			
			 			//update total
			 			total+=add;
			 			System.out.println("TOTAL:   "+total);
			
			 			//check for lose
			 			if(total==goal)
			 			{
			 				System.out.println("Sorry, you lose.");
			 			}
			 			else
			 			{
				 			//calc comp's add
				 			if(aim==base)
				 			{
					 			if (total<aim)
					 			{
					 				add=aim-total;
					 				if (add>max)
					 				{
					 					add=1;
					 				}
					 			}
					 			else
					 			{
					 				aim+=incr;
					 				add=aim-total;
					 				if (add>max)
					 				{
					 					add=1;
					 				}
					 			}
				 			}
				 			else
				 			{
				 				if (total<aim)
					 			{
					 				add=aim-total;
					 				if (add>max)
					 				{
					 					add=1;
					 				}
					 			}
				 			}
			
				 			//update total
				 			total+=add;
				 			aim+=incr;
				 			System.out.println("I choose " + add + ".");
				 			System.out.println("TOTAL:   "+total);
			
				 			//check for lose
				 			if(total==goal)
				 			{
				 				System.out.println("Awww...I lost. :(");
				 			}
				 		}
		 			}while(total!=goal);
		 		}
		 		
		 		
		 		else
		 		{
		 			//Keep running this setion of code until lose
		 			do
		 			{
			 			add=aim-total;
			 			//calc comp's add
			 			if(add>max)
			 			{
			 				add=1;
			 			}
			
			 			//update total
			 			total+=add;
				 		aim+=incr;
				 		System.out.println("I choose " + add + ".");
				 		System.out.println("TOTAL:   "+total);
			
			 			//check for lose
			 			if(total==goal)
			 			{
			 				System.out.println("Awww...I lost. :(");
			 			}
			 			else
			 			{
			 				//get what the player add while within the range
			 				do
				 			{
				 				System.out.println("Please enter a whole number 1-"+max);
				 				add=consule.readInt();
				 			}while((add<1||add>max)||(total+add>goal));
			
				 			//update total
				 			total+=add;
				 			System.out.println("TOTAL:   "+total);
			
				 			//check for lose
				 			if(total==goal)
				 			{
				 				System.out.println("Sorry, you lose.");
				 			}
			 			}
			 		}while(total!=goal);
		 			
		 		}
	 		}
		 	//Play Again?~keep asking for yes or no
		 	do
		 	{
		 		System.out.println("Would you like to play agian?(yes/no)");
		 		pa=consule.readWord();
		 	}while((!(pa.equals("yes")))&&(!(pa.equals("no"))));
		 	//exit if no
		 	if(pa.equals("no"))
		 	{
		 		System.exit(0);
		 	}
		}while(pa.equals("yes"));
	}
}
 