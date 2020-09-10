package quizProgram;

//Imports the Java Swing package to use its GUI features
import javax.swing.*;

/**
 * A text adventure game containing 10 multiple choice questions. Based on your answers, you 
 * get a different result.
 */
public class AdventureQuiz {
	
	String name;    //Stores the name of the player
	int hp = 100;   //Initial HP of the player, equivalent of a 'score'

	/**
	 * Constructor beginning the text adventutre
	 */
	public AdventureQuiz(){
		begin(); //Calls the method starting the game
	}

	/**
	 * Begins the game by calling the welcome screen, then the questions in the correct order.
	 */
	private void begin(){
		welcome();	//Prompts the welcome screens
		q1();		//Calls the first question
		q2();		//Calls the second question
		q3();		//Calls the third question
		q4();		//Calls the fourth question 
		q5();		//Calls the fifth question
		q6();		//Calls the sixth question
		q7();		//Calls the seventh question
		q8();		//Calls the eigth question
		q9();		//Calls the ninth question
		q10();		//Calls the tenth question
		results();	//Calls the results to present to the player
	}

	/**
	 * Welcomes the player, getting their name and showing them instructions
	 */
	private void welcome(){

		//Uses dialog to portray text. This is how most of the text adventure functions.
		JOptionPane.showMessageDialog(null, "Welcome player! Will you successfully pull off your" +
											" heroic heist?");

		//Asks user for an input of their name.
		String s = JOptionPane.showInputDialog(null,"You'll first have to input your name " + 
													"for history to praise on.");											
		
		//Checks if there is no input from the user.
		if(s.isEmpty()==true){
			//Tells user that no input was made
			JOptionPane.showMessageDialog(null, "Alright. Let you be hidden from the flow of time!");
			s = "Anon"; //Sets a name for the user to successfully continue the game.
		}

		name = s; //Stores the given input under the name variable for further use.

		//Narration
		JOptionPane.showMessageDialog(null, "Undertake the correct actions to survive. Your health is " 
											+ "vital to your success, after all.");
		JOptionPane.showMessageDialog(null, "May you have a glorious adventure, " + name + "!");
	}
	
	/**
	 * Method used throughout the program when no input is given.
	 */
	private void noAnswer(){
		//Narration
		JOptionPane.showMessageDialog(null, "You cannot choose a path that leads to success.");
		JOptionPane.showMessageDialog(null,"\nYou choose to end your own tale. Prior to doing so, " +
		 									"you had " + hp + ".");
		JOptionPane.showMessageDialog(null, "\nAnd so ends the dramatic tale of " + name + ".");
		System.exit(0); //Exits the game
	}

	/**
	 * Presents the first question
	 * @return The health value after this method
	 */
	private int q1(){
		//Narration
		String answer = JOptionPane.showInputDialog("You've stolen the Great Chalice from its " + 
													"rightful position. Its guardians, knights, " + 
													"are not pleased and are charging at you. You " + 
													"\n\n A. Stand your ground, certain of victory." +
													"\n B. Flee. There is no shame in retreating." +
													"\n C. Plead for mercy and attempt some reasoning." +
													"\n D. Stand and yell, trying to provoke them.");
		//Checks if the user inputted A
		if(answer.equalsIgnoreCase("A")){
			//Narration
			JOptionPane.showMessageDialog(null, "The knights gang up on you! You regretfully retreat," + 
												" injured.\nYou lost 10 HP!");
			hp-=10; //Deduct HP
		}
		else if(answer.equalsIgnoreCase("B")){ //Checks if the user inputted B
			//Narration
			JOptionPane.showMessageDialog(null, "You've successfully fled! The knights follow.");
		}
		else if(answer.equalsIgnoreCase("C")){ //Checks if the user inputted C
			//Narration
			JOptionPane.showMessageDialog(null, "The pleading failed. The knights, having caught up, " +
												"attempt to execute you for your transgression." + 
												"\nRefusing to die, you chose to escape, but not " +
												"unscathed.\nYou lost 10 HP!");
			hp-=10; //Deduct HP
		}
		else if(answer.equalsIgnoreCase("D")){ //Checks if the user inputted D
			//Narration
			JOptionPane.showMessageDialog(null, "The provocation is a success!" +
												"\nThe knights channel their anger at your words" +
												" to successfully catch up." +
												"\nYou escape, but not without wounds." +
												"\nYou lost 10 HP!");
			hp-=10; //Deduct HP
		}
		else if(answer.isEmpty()==true){ //Checks for no input
			noAnswer(); //Calls the method for no input
		}
		else{ //Catch all in case a unique input was placed.
			//Narration
			JOptionPane.showMessageDialog(null, "The knights attack!\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		return hp; //Returns the new HP value if the wrong choice is picked.
	}
	
	/**
	 * Presents the second question
	 * @return The HP value
	 */
	private int q2(){
		//Narration
		String answer = JOptionPane.showInputDialog("You desperately flee, as the knights give chase. " +
													"As the exit nears, you notice the shrine entrance" +
													" appears to be breaking down! \nWhat now?" +
													"\n\n A. Stop and search your bag!" +
													"\n B. Make the run of faith." +
													"\n C. Politely request the knights' assistance." +
													"\n D. Pray to the shrine's gods.");
		//Checks if user inputted A
		if(answer.equalsIgnoreCase("A")){
			//Narration
			JOptionPane.showMessageDialog(null, "There is nothing helpful in your bag!\n" +
												"With no other choice, you run through, getting hurt!" +
												"\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("B")){ //Checks if the user inputted B
			//Narration
			JOptionPane.showMessageDialog(null, "The run gets you through the collapsing shrine." +
												" Stones pelt your poorly protected self as you escape." +
												"\nYou lose 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("C")){ //Checks if the user inputted C
			//Narration
			JOptionPane.showMessageDialog(null, "The knights refuse to aid! They thank you for your" +
												" request by attacking you!\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		
		}
		else if(answer.equalsIgnoreCase("D")){ //Checks if the user inputted D
			//Narration
			JOptionPane.showMessageDialog(null, "Touched by your piety, the housed god stops the " +
												"collapse, long enough for you to safely escape!");
		}
		else if(answer.isEmpty()==true){ //Checks if no answer is placed
			noAnswer(); //Calls method for no input
		}
		else{ //Catch all for unique input
			//Narration
			JOptionPane.showMessageDialog(null, "The run gets you through the collapsing shrine." +
												" Stones pelt your poorly protected self as you escape." +
												"\nYou lose 10 HP!");
			hp-=10; //Deducts HP
		}
		return hp;
	}
	
	/**
	 * Presents the third question
	 * @return the HP value
	 */
	private int q3(){
		//Narration
		String answer = JOptionPane.showInputDialog("You've finally left the shrine! However, there's " +
													"still lookouts to evade outside! What now?" +
									"\n\n A. Wear your nonexistent diguise to pass through." +
									"\n B. Fight all the lookouts you encounter" +
									"\n C. Sneak past the lookouts." +
									"\n D. Try to join the lookouts as the new recruit.");
		if(answer.equalsIgnoreCase("A")){ //Checks if the user inputted A
			//Narration
			JOptionPane.showMessageDialog(null, "It says nonexistent on the text, " + name + " . " +
												 "You're forced to fight all the lookouts you see, " +
												 "getting hurt in the process.\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("B")){ //Checks if the user inputted B
			//Narration
			JOptionPane.showMessageDialog(null, "You fight all the lookouts." + 
												"\nUnfortunately, you're no Heracles. You get injured." +
												"\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("C")){ //Checks if the user inputted C
			//Narration
			JOptionPane.showMessageDialog(null, "You take it slowly, trying to avoid all the sentries." +
												"Luckily, you manage to evade every one of their eyes!");
		}
		else if(answer.equalsIgnoreCase("D")){ //Checks if the user inputted D
			//Narration
			JOptionPane.showMessageDialog(null, "You waltz up to someone, hoping to join. They appear" +
												" pleased!");
			JOptionPane.showMessageDialog(null, "Unfortunately, that was due to having spotted the " +
												"fugitive. You escape, but not perfectly." +
												"\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.isEmpty()==true){ //Checks for no input
			noAnswer(); //Method for no input
		}
		else{ //Catch all case for unique input
			JOptionPane.showMessageDialog(null, "You choose nothing.\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		return hp; //Returns new HP value
	}
	
	/**
	 * Presents the fourth question
	 * @return The HP Value
	 */
	private int q4(){
		//Narration
		String answer = JOptionPane.showInputDialog("Now, you can finally head for your home base." +
													" What direction shall you choose, " + name + "?" +
													"\n\n A. To civilization!" +
													"\n B. To the desert!" +
													"\n C. To a forest!" +
													"\n D. To the ocean!");
		if(answer.equalsIgnoreCase("A")){ //Checks if the user inputted A
			//Narration
			JOptionPane.showMessageDialog(null, "You make it to the town safely!");
		
		}else if(answer.equalsIgnoreCase("B")){ //Checks if the user inputted B
			//Narration
			JOptionPane.showMessageDialog(null, "You cross the arid desert. There's no desserts. " +
												 "No one chases you, but you're not prepared for this. " +
												 "You drag yourself to town.\nYou lost 10 HP!");
			hp-=10;  //Deducts HP
		}
		else if(answer.equalsIgnoreCase("C")){ //Checks if the user inputted C
			//Narration
			JOptionPane.showMessageDialog(null, "As you traverse the forest, you suddenly are "+
												"attacked by the knights' forward squad!" +
												"\nWith the devil's luck, you escape and drag yourself" +
												" to the nearby town.\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("D")){ //Checks if the user inputted D
			//Narration
			JOptionPane.showMessageDialog(null, "What ocean did you see? Was it an illusion?" +
												" When you awaken, you're at town, hurt, but with" +
												" no idea how that happened.\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.isEmpty()==true){  //Checks if nothing is inputted
			noAnswer(); //Calls method for no input
		}
		else{ //Catch all for unique input
			//Narration
			JOptionPane.showMessageDialog(null, "You meander around, starving until you end up " +
												"in a town.\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		return hp; //Returns the new HP value
	}
	
	/**
	 * Presents the fifth question
	 * @return The new HP value
	 */
	private int q5(){
		//Narration
		String answer = JOptionPane.showInputDialog("You have a free action in this town! What do you do?" +
											"\n\n A. Casually pass through." +
											"\n B. Get drunk." +
											"\n C. Rob a bank." +
											"\n D. Rob some houses.");
		if(answer.equalsIgnoreCase("A")){ //Checks if the user inputted A
			//Narration
			JOptionPane.showMessageDialog(null, "As a clear tourist, you get robbed in broad daylight! " +
												"Unable to part with your treasure, you get injured " +
												"fighting for it!\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("B")){ //Checks if the user inputted B
			//Narration
			JOptionPane.showMessageDialog(null, "You get a drink. Or two. Or three..." +
												"\nBy the time you recall what happened, " +
												"you're out of town after a instigating a large" +
												" bar fight. \nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("C")){ //Checks if the user inputted C
			//Narration
			JOptionPane.showMessageDialog(null, "You're unceremoniously kicked out of town after your " +
												"pathetic robbing attempt.\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("D")){ //Checks if the user inputted D
			//Narration
			JOptionPane.showMessageDialog(null, "Like a sudden tornado, you burst into every single" +
												" house, undaunted by anything. Everyone is too shocked by" +
												" your boldness to do anything. You leave town, feeling richer " +
												"and fuller than when you came.");
		}
		else if(answer.isEmpty()==true){ //Checks if there was no input
			noAnswer(); //Method for no input
		}
		else{ //Catch all for unique input
			//Narration
			JOptionPane.showMessageDialog(null, "As a clear tourist, you get robbed in broad daylight! " +
												"Unable to part with your treasure, you get injured " +
												"fighting for it!\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		return hp; //Returns the new HP value
	}
	
	/**
	 * Presents the sixth question
	 * @return The new HP value
	 */
	private int q6(){
		//Narration
		String answer = JOptionPane.showInputDialog("After leaving, you encounter a young person. " +
													"They appear to be a devout follower of some god, but " +
													"also very lost. What now?" +
													"\n\n A. Direct them towards the shrine you escaped." +
													"\n B. Ignore them." +
													"\n C. Kidnap them." +
													"\n D. Ask the acolyte to marry you.");
		if(answer.equalsIgnoreCase("A")){ //Checks if the user inputted A
			//Narration
			JOptionPane.showMessageDialog(null, "Listening to your instructions, the person suddenly " +
												"points a weapon at you! Where did this come from?\n" +
												"\"That place is off limits? How do you know it?\"\n" +
												"At a loss for words, you could only flee." +
												"\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("B")){ //Checks if the user inputted B
			//Narration
			JOptionPane.showMessageDialog(null, "You pass by without any incidence.");
		}
		else if(answer.equalsIgnoreCase("C")){ //Checks if the user inputted C
			//Narration
			JOptionPane.showMessageDialog(null, "The kidnapping goes awry when the victim " +
												"turns the tides on you and forces you to retreat! " +
												"You're injured for your troubles.\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("D")){ //Checks if the user inputted D
			//Narration
			JOptionPane.showMessageDialog(null, "They flatly reject you. " +
												"You've taken heavy mental damage from the rejection." +
												"\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.isEmpty()==true){ //Checks if there was no input
			noAnswer(); //Method for no input
		}
		else{ //Catch all for unique input
			//Narration
			JOptionPane.showMessageDialog(null, "You choose nothing..and nothing happens.");
		}
		return hp; //returns the new HP value
	}
	
	/**
	 * Presents the seventh question
	 * @return the new HP value
	 */
	private int q7(){
		//Narration
		String answer = JOptionPane.showInputDialog("Continuing the path, you're blocked by what appears" +
													" to be a checkpoint. A muscular gatekeeper demands" +
													" a toll to pass! What now?" +
											"\n\n A. Throw whatever you have at the gatekeeper." +
											"\n B. Give the keeper the toll money." +
											"\n C. Try to run past the gatekeeper." +
											"\n D. Scale the walls.");
		if(answer.equalsIgnoreCase("A")){ //Checks if the user inputted A
			//Narration
			JOptionPane.showMessageDialog(null, "You begin to toss the foodstuff you have in your bag. " +
												"The guard appears unfettered until a solid canteloupe " +
												"smacks them. They crumple, and you happily pass.");
		}
		else if(answer.equalsIgnoreCase("B")){ //Checks if the user inputted B
			//Narration
			JOptionPane.showMessageDialog(null, "You pay the toll. The guard scrutinizes you briefly" +
												" before punching you! They call you a \"wimp\""+
												" and let you crawl through.\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("C")){ //Checks if the user inputted C
			//Narration
			JOptionPane.showMessageDialog(null, "You make it through the gate! You surprised the " +
												"gatekeeper as you burst through the only way through! " +
												"Unfortunately, that also means you get hurt." +
												"\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("D")){ //Checks if the user inputted D
			//Narration
			JOptionPane.showMessageDialog(null, "You ignore the gate and attempt to scale the walls." +
												" The gatekeeper stares, before choossing to ignore" +
												" you. You make it through, but fall to the ground on" +
												" the other side.\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.isEmpty()==true){ //Checks if there was no input
			noAnswer(); //Method for no input
		}
		else{ //Catch all for unique input
			//Narration
			JOptionPane.showMessageDialog(null, "You get swatted through. \nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		return hp; //Returns the new HP value
	}

	/**
	 * Presents the eigth question
	 * @return The new HP value
	 */
	private int q8(){
		//Narration
		String answer = JOptionPane.showInputDialog("Your stronghold is quickly approaching! " +
													"An old man collapses in front of you!" +
 											"\n\n A. Make sure he's extra dead." +
											"\n B. Rob him while he's down!" +
											"\n C. Hurry past him to your hideout!" +
											"\n D. Request backup!");
		//Checks if the user inputted A
		if(answer.equalsIgnoreCase("A")){
			//Narration
			JOptionPane.showMessageDialog(null, "As you prepare to end his life, the old man abruptly " +
												"explodes into a fire pillar! You get scorched!\n" +
												"He reappears a short distance away.\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("B")){  //Checks if the user inputted B
			//Narration
			JOptionPane.showMessageDialog(null, "You try to frisk him, but there's nothing valuable! " +
												"The man erupts into a fire pillar, scorching you! " +
												"He reappears a short distance away.\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("C")){ //Checks if the user inputted C
			//Narration
			JOptionPane.showMessageDialog(null, "You're eager to reach your base, so you ignore him!" +
												" Behind you, you hear something errupting as the man" +
												" appears in front of you!");
		}
		else if(answer.equalsIgnoreCase("D")){ //Checks if the user inputted D
			//Narration
			JOptionPane.showMessageDialog(null,"Panicking, you try to request help! But from where?!" +
												" While paralyzed from indecision, you get knocked back " +
												"by scorching heat, losing 10 HP! The man appears before you!");
			hp-=10; //Deducts HP
		}
		else if(answer.isEmpty()==true){  //Checks if there is no input
			noAnswer(); //Method in response
		}
		else{ //Catch all for unique inputs
			//Narration
			JOptionPane.showMessageDialog(null, "You get blown up as the man reappears!\nYou lost 10 HP!");
			hp-=10; //deducts HP
		}
		return hp; //Returns the new HP value
	}
	
	/**
	 * Presents the ninth question
	 * @return the new HP value
	 */
	private int q9(){ 
		//Narration
		String answer = JOptionPane.showInputDialog("The old man bellows angrily at you! " +
													"However, you don't understand him at all!" +
													"\nTaking your confusion and indifference, he " +
													"conjours a vast lava pit, laughing as he leaves! " +
													"What now?!" +
													"\n\n A. Swim through the lava!" +
													"\n B. Give up." +
													"\n C. Walk left until you find a breach." +
													"\n D. Walk right until you find a breach.");
		if(answer.equalsIgnoreCase("A")){ //Checks if the user inputted A
			//Narration
			JOptionPane.showMessageDialog(null, "You valiantly jump in without hesitation! " +
												"You're certainly roasted as you climb out." +
												"\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("B")){ //Checks if the user inputted B
			//Narration
			JOptionPane.showMessageDialog(null, "You've had enough. You stay put." +
												"\nWas this Chalice worth it all? You contemplate" +
												" life. \nAs you think, the pit vanishes! Surprised, " +
												" you continue your journey.");
		}
		else if(answer.equalsIgnoreCase("C")){ //Checks if the user inputted C
			//Narration
			JOptionPane.showMessageDialog(null, "You walk as far left as possible. It's unbearably " +
												"hot the further you go. As you continue, you " +
												"accidentally slip and fall into the lava." +
												"\nYou're forced to swim for your life, ending roasted." +
												"\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("D")){ //Checks if the user inputted D
			//Narration
			JOptionPane.showMessageDialog(null, "You walk as far right as possible. It's unbearably " +
												"hot the further you go. As you continue, you " +
												"accidentally slip and fall into the lava." +
												"\nYou're forced to swim for your life, ending roasted." +
												"\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.isEmpty()==true){ //Checks if nothing was inputted
			noAnswer(); //Method in response
		}
		else{ //Catch all for unique inputs
			//Narration
			JOptionPane.showMessageDialog(null, "You do nothing. The lava vanishes and you pass.");
		}
		return hp; //Returns the new HP value
	}
	
	/**
	 * Presents the 10th question
	 * @return the new HP value
	 */
	private int q10(){
		//Narration
		String answer = JOptionPane.showInputDialog("Your base is finally in sight! As you near, you" +
													" hear some beeping noises! It appears the Great " +
													"Chalice is actually exploding! What do you do now?!" +
											"\n\n A. Continue onwards!" +
											"\n B. Throw it!!" +
											"\n C. Give up." +
											"\n D. Pick a god and pray.");
		if(answer.equalsIgnoreCase("A")){ //Checks if the user inputted A
			//Narration
			JOptionPane.showMessageDialog(null,"You bravely continue on your journey as the Chalice " +
												 "continues beeping. It eventually explodes, knocking " +
												 "you down.\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("B")){ //Checks if the user inputted B
			//Narration
			JOptionPane.showMessageDialog(null, "Tossing the Chalice towards your stronghold, " +
												"it detonates on the roof, blowing the stone away. " +
												"A stone smacks you square in the chest as if your " +
												"base sought revenge for such an act.\nYou lost 10 HP!");
			hp-=10; //Deducts HP
		}
		else if(answer.equalsIgnoreCase("c")){ //Checks if the user inputted C
			//Narration
			JOptionPane.showMessageDialog(null,"Having decided you've had enough, you leave the Grail " +
												"on the ground and continue walking towards your house. " +
												"It explodes behind you, leaving an awesome background " +
												"for your conclusion.");
		}
		else if(answer.equalsIgnoreCase("D")){ //Checks if the user inputted D
			//Narration
			JOptionPane.showMessageDialog(null, "You pick your god and ferverently praying to survive " +
												"this. The Chalice still explodes, but you're alive for " +
												"now. Still lost 10 HP. Consider being a healer.");
			hp-=10; //Deducts HP
		}
		else if(answer.isEmpty()==true){ //Checks if there was no input
			noAnswer(); //Method in response to no input
		}
		else{ //Catch all for unique inputs
			//Narration
			JOptionPane.showMessageDialog(null, "You stand there stupidily and blow up.\nYou lost 10 HP!");
			hp-=10; //Deduct HP
		}
	return hp; //Returns the new HP value
	}

	/**
	 * Presents the results depending on your HP value
	 */
	private void results(){
		if(hp==100){ //Checks if HP = 100
			//Narration
			JOptionPane.showMessageDialog(null, "You stroll victoriously through your stronghold." +
												"\nNobody greets you, but that's fine too. "+
												"You're a Hero in your own mind.");
			JOptionPane.showMessageDialog(null, "You have survived all the perils to bring the Great " +
												"Chalice back, and returned empty handed but perfectly " +
												"fine. May that serve as a warning for other " +
												"fledling heroes.");
			JOptionPane.showMessageDialog(null, "See you again on your next epic, " + name + ".");
			JOptionPane.showMessageDialog(null, "(By the way your HP was at " + hp + 
												" if you didn't figure already.");
			System.exit(0); //Ends the program
		}
		else if(hp<=90 && hp>=60){ //Checks if the HP was from 60 - 90, inclusive
			//Narration
			JOptionPane.showMessageDialog(null, "You limp into the stronghold, wounded but alive. " + 
												"Regrets were made over the course of the journey.");
			JOptionPane.showMessageDialog(null, "But you're alive and that's all that matters. " +
												"To live and try again another day. Another epic.");
			JOptionPane.showMessageDialog(null, "May you succeed your next quest, " + name + 
												". Your HP at the end was " + hp + ".");
			System.exit(0); //Ends the program
		}
		else if(hp<=50 && hp>=30){ //Checks if teh HP was from 30 - 50, inclusive
			//Narration
			JOptionPane.showMessageDialog(null, "Stumbling into your stronghold, you're barely above " +
												"safe levels at " + hp + " HP.");
			JOptionPane.showMessageDialog(null, "Days later, you have recuperated enough to continue " +
												"your daily life of nothingness. Perhaps if the Great " +
												"Chalice was in your hands, you'd be living The Life " +
												"you thought you were destined for.");
			JOptionPane.showMessageDialog(null, "As it is, you'll have to wait for your next Epic " +
												"Adventure.");
			JOptionPane.showMessageDialog(null, "May it be better than this botched one, "
												 + name + ".");
			System.exit(0); //Ends the program
		}
		else if(hp<=20 && hp>0){ //Checks if the HP was from 0 - 20, inclusive.
			//Narration
			JOptionPane.showMessageDialog(null, "You barely make it into your stronghold, " +
												"crawling the last couple meters before blacking out. " +
												"You hope that you won't be eaten as your sight fades.");
			JOptionPane.showMessageDialog(null, ".........");
			JOptionPane.showMessageDialog(null, "When you awaken, you're still at the front of your " +
												"base. Guess no one cared enough to take care of you. " +
												"Tis the loner's life.");
			JOptionPane.showMessageDialog(null, "You lay there as your HP drops from " + hp + " to 0. " +
												"What a sad fate for a Hero....");
			JOptionPane.showMessageDialog(null, "Wait that was in your eyes only! " +
												"May your adventures in the after life be more " +
												"profitable than your sad tale alive, " + name + ".");
			System.exit(0); //Ends the program
		}
		else if (hp==0){ //Checks if the HP was 0
			//Narration
			JOptionPane.showMessageDialog(null, "Well you died.");
			JOptionPane.showMessageDialog(null, "0 HP. May you have a better life in your " +
												"reincarnation, " + name + "." );
			System.exit(0); //Ends the program
		}
	}
}