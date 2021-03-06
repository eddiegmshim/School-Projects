package Moped;

import inClass.RemoteControl;

import java.util.Scanner;

public class Moped {
	
	public static final int STREETS = 200;
	public static final int AVENUES = 10;
	
	
	// setting up initial conditions
	public int gas = 20;
	public String orientation = "south";
	int locationStreet = 10;
	int locationAvenue = 5;
	
	// setting up moped class
	public Moped(){
		System.out.println("Thanks for jumping on the moped." );
		System.out.println("We're currently at 10th St and 5th Ave facing South.");
		System.out.println("What would you like to do? At any time, type help for assistance.");
	}
	
	//setting up moped class for drunk drivers
	public Moped(int startingStreet, int startingAvenue){
		this.locationStreet = startingStreet;
		this.locationAvenue = startingAvenue;
		this.orientation = "west";
	}
	
	
	

	
	
	// COMMAND STRAIGHT
	public void straight(){
		
		if (this.orientation.equals("north")){
			if(this.locationStreet<STREETS){
				this.locationStreet++;
				this.gas--;
			} else {
				System.out.println("You cannot go more north");
			}
			
		} else if (this.orientation.equals("south")){
			if (this.locationStreet>1){
				this.locationStreet--;
				this.gas--;
			} else {
				System.out.println("You cannot go more south");
			}
			
		} else if (this.orientation.equals("west")){
			if (this.locationAvenue>1){
				this.locationAvenue--;
				this.gas--;
			} else {
				System.out.println("You cannot go more west");
			}
			
		} else if (this.orientation.equals("east")){
			if (this.locationAvenue<AVENUES){
				this.locationAvenue++;
				this.gas--;
			} else{
				System.out.println("You cannot go more east");
			}
		}
		
		System.out.println("Current street location is " + this.locationStreet);
		System.out.println("Current avenue location is " + this.locationAvenue);
		if (this.gas==0){
			System.out.println("You ran out of gas!");
			System.exit(1);
		}
		if (this.locationStreet== 79 && this.locationAvenue == 8){
			System.out.println("Now at American Museum of Natural History. Check it out!");
		}
		if (this.locationStreet== 74 && this.locationAvenue == 1){
			System.out.println("Now at Memorial Sloan Kettering. Check it out!");
		}
		if (this.locationStreet== 12 && this.locationAvenue == 4){
			System.out.println("Now at The Strand. Check it out!");
		}
		if (this.locationStreet== 3 && this.locationAvenue == 6){
			System.out.println("Now at Fayda Coffee Tea Cookies Cake. Check it out!");
		}
		
	}
	


	
	
	//COMMAND BACK
	public void back(){
		
		if (this.orientation.equals("north")){
			if(this.locationStreet>1){
				this.locationStreet--;
				this.gas--;
			} else {
				System.out.println("You cannot go more south");
			}
			
		} else if (this.orientation.equals("south")){
			if (this.locationStreet<STREETS){
				this.locationStreet++;
				this.gas--;
			} else {
				System.out.println("You cannot go more north");
			}
			
		} else if (this.orientation.equals("west")){
			if (this.locationAvenue<AVENUES){
				this.locationAvenue++;
				this.gas--;
			} else {
				System.out.println("You cannot go more east");
			}
			
		} else if (this.orientation.equals("east")){
			if (this.locationAvenue>1){
				this.locationAvenue--;
				this.gas--;
			} else{
				System.out.println("You cannot go more west");
			}
		}
		
		System.out.println("Current street location is " + this.locationStreet);
		System.out.println("Current avenue location is " + this.locationAvenue);
		if (this.gas==0){
			System.out.println("You ran out of gas!");
			System.exit(1);
		}
		if (this.locationStreet== 79 && this.locationAvenue == 8){
			System.out.println("Now at American Museum of Natural History. Check it out!");
		}
		if (this.locationStreet== 74 && this.locationAvenue == 1){
			System.out.println("Now at Memorial Sloan Kettering. Check it out!");
		}
		if (this.locationStreet== 12 && this.locationAvenue == 4){
			System.out.println("Now at The Strand. Check it out!");
		}
		if (this.locationStreet== 3 && this.locationAvenue == 6){
			System.out.println("Now at Fayda Coffee Tea Cookies Cake. Check it out!");
		}
	
	}
	
	//COMMAND LEFT
		public void left(){
			
			if (this.orientation.equals("north")){
				if (this.locationAvenue>1){
					this.locationAvenue--;
					this.gas--;
					this.orientation = "west";
				
				} else {
					System.out.println("You cannot go more west");
				}
				
			} else if (this.orientation.equals("south")){
				if (this.locationAvenue<AVENUES){
					this.locationAvenue++;
					this.gas--;
					this.orientation = "east";
				
				} else {
					System.out.println("You cannot go more east");
				}
				
			} else if (this.orientation.equals("west")){
				if(this.locationStreet>1){
					this.locationStreet--;
					this.gas--;
					this.orientation = "south";
				
				} else {
					System.out.println("You cannot go more south");
				}
				
			} else if (this.orientation.equals("east")){
				if (this.locationStreet<STREETS){
					this.locationStreet++;
					this.gas--;
					this.orientation = "north";
				
				} else{
					System.out.println("You cannot go more north");
				}
			}
			
			System.out.println("Current street location is " + this.locationStreet);
			System.out.println("Current avenue location is " + this.locationAvenue);
			if (this.gas==0){
				System.out.println("You ran out of gas!");
				System.exit(1);
			}
			if (this.locationStreet== 79 && this.locationAvenue == 8){
				System.out.println("Now at American Museum of Natural History. Check it out!");
			}
			if (this.locationStreet== 74 && this.locationAvenue == 1){
				System.out.println("Now at Memorial Sloan Kettering. Check it out!");
			}
			if (this.locationStreet== 12 && this.locationAvenue == 4){
				System.out.println("Now at The Strand. Check it out!");
			}
			if (this.locationStreet== 3 && this.locationAvenue == 6){
				System.out.println("Now at Fayda Coffee Tea Cookies Cake. Check it out!");
			}
		
		}
		

	//COMMAND RIGHT
		public void right(){
			
			if (this.orientation.equals("north")){
				if (this.locationAvenue<AVENUES){
					this.locationAvenue++;
					this.gas--;
					this.orientation = "east";
				
				} else {
					System.out.println("You cannot go more east");
				}
				
				
			} else if (this.orientation.equals("south")){
				if (this.locationAvenue>1){
					this.locationAvenue--;
					this.gas--;
					this.orientation = "west";
				
				} else {
					System.out.println("You cannot go more west");
				}
				
			} else if (this.orientation.equals("west")){
				if (this.locationStreet<STREETS){
					this.locationStreet++;
					this.gas--;
					this.orientation = "north";
				
				} else{
					System.out.println("You cannot go more north");
				}
				
				
			} else if (this.orientation.equals("east")){
				if(this.locationStreet>1){
					this.locationStreet--;
					this.gas--;
					this.orientation = "south";
				
				} else {
					System.out.println("You cannot go more south");
				}
			}
			
			System.out.println("Current street location is " + this.locationStreet);
			System.out.println("Current avenue location is " + this.locationAvenue);
			if (this.gas==0){
				System.out.println("You ran out of gas!");
				System.exit(1);
			}
			if (this.locationStreet== 79 && this.locationAvenue == 8){
				System.out.println("Now at American Museum of Natural History. Check it out!");
			}
			if (this.locationStreet== 74 && this.locationAvenue == 1){
				System.out.println("Now at Memorial Sloan Kettering. Check it out!");
			}
			if (this.locationStreet== 12 && this.locationAvenue == 4){
				System.out.println("Now at The Strand. Check it out!");
			}
			if (this.locationStreet== 3 && this.locationAvenue == 6){
				System.out.println("Now at Fayda Coffee Tea Cookies Cake. Check it out!");
			}
		
		}
		
	//COMMAND CHECK GAS
		public void checkgas(){
			this.gas=gas;
			double gasPercentage = this.gas * 100 / 20.0;
			System.out.println("Your tank is currently " + gasPercentage + "% full");
		}
		
	//COMMAND PARK
		public void park(){
			this.locationStreet=locationStreet;
			this.locationAvenue=locationAvenue;
			
			System.out.println("You have parked on street " + this.locationStreet + " and on avenue " + this.locationAvenue + ". Have a nice day.");
			System.exit(1);
		}
		
	//COMMAND FILL GAS
		public void fillgas(){
			this.gas = 20;
			
			System.out.println("You have filled your gas tank. Your tank is now 100% full");
		}
		
	//COMMAND GOPETITE
		public void goPetite(){
			if (this.locationStreet<17){
				while (this.locationStreet!=17){
					this.locationStreet++;
					this.gas--;
					System.out.println("Now at street " + locationStreet + " and avenue " + locationAvenue + "... heading North.");
					if (this.gas==0){
						System.out.println("You ran out of gas!");
						System.exit(1);
					}
				}
			} else if (this.locationStreet>17){
				while (this.locationStreet!=17){
					this.locationStreet--;
					this.gas--;
					System.out.println("Now at street " + locationStreet + " and avenue " + locationAvenue + "... heading South.");
					if (this.gas==0){
						System.out.println("You ran out of gas!");
						System.exit(1);
					}
				}
			}
			
			if (this.locationAvenue<6){
				while (this.locationAvenue!=6){
					this.locationAvenue++;
					this.gas--;
					System.out.println("Now at street " + locationStreet + " and avenue " + locationAvenue + "... heading East.");
					if (this.gas==0){
						System.out.println("You ran out of gas!");
						System.exit(1);
					}
				}
			} else if (this.locationAvenue>6){
				while (this.locationAvenue!=6){
					this.locationAvenue--;
					this.gas--;
					System.out.println("Now at street " + locationStreet + " and avenue " + locationAvenue + "... heading West.");
					if (this.gas==0){
						System.out.println("You ran out of gas!");
						System.exit(1);
					}
				}
			}
			System.out.println("We have reached Petite Abeille. Enjoy your moules-frites");
			
		}
		
		//COMMAND FOR DRUNK DRIVERS. THEY ONLY DRIVE RIGHT; PERPETUAL CIRCLES
		public void drunkMovement(){
			if (this.orientation.equals("north")){
				if (this.locationAvenue<AVENUES){
					this.locationAvenue++;
					
					this.orientation = "east";
				}		
				
				
			} else if (this.orientation.equals("south")){
				if (this.locationAvenue>1){
					this.locationAvenue--;
					
					this.orientation = "west";
				}
				
				
				
			} else if (this.orientation.equals("west")){
				if (this.locationStreet<STREETS){
					this.locationStreet++;
				
					this.orientation = "north";
				
				}
				
			} else if (this.orientation.equals("east")){
				if(this.locationStreet>1){
					this.locationStreet--;
					
					this.orientation = "south";
				}
			}
		}
		

	
	
	
	public static void main(String[] args){
		
		Moped userMoped = new Moped();
		
		
		// initializing two drunk drivers starting at two random positions on the map
		Moped drunkMoped1= new Moped(2 + (int)(Math.random()*195),2 + (int)(Math.random()*5));
		Moped drunkMoped2= new Moped(2 + (int)(Math.random()*195), 2 + (int)(Math.random()*5));
		
		
		Scanner scn = new Scanner(System.in);
		
		
		while(true){
			
			String response = scn.nextLine();
			
	

			switch(response){
			case "help":
				System.out.println("Choose a command: left, right, straight, back, check gas, fill gas, park, go to Petite Abeille");
				break;
			case "straight":
				userMoped.straight();
				drunkMoped1.drunkMovement();
				drunkMoped2.drunkMovement();
				if (userMoped.locationStreet == drunkMoped1.locationStreet && userMoped.locationAvenue == drunkMoped1.locationAvenue){
					System.out.println("You have crashed into a drunk Moped driver.");
					System.exit(1);
				}
				if (userMoped.locationStreet == drunkMoped2.locationStreet && userMoped.locationAvenue == drunkMoped2.locationAvenue){
					System.out.println("You have crashed into a drunk Moped driver.");
					System.exit(1);
				}
				break;
			case "back":
				userMoped.back();	
				drunkMoped1.drunkMovement();
				drunkMoped2.drunkMovement();
				if (userMoped.locationStreet == drunkMoped1.locationStreet && userMoped.locationAvenue == drunkMoped1.locationAvenue){
					System.out.println("You have crashed into a drunk Moped driver.");
					System.exit(1);
				}
				if (userMoped.locationStreet == drunkMoped2.locationStreet && userMoped.locationAvenue == drunkMoped2.locationAvenue){
					System.out.println("You have crashed into a drunk Moped driver.");
					System.exit(1);
				}
				break;
			case "left":
				userMoped.left();
				drunkMoped1.drunkMovement();
				drunkMoped2.drunkMovement();
				if (userMoped.locationStreet == drunkMoped1.locationStreet && userMoped.locationAvenue == drunkMoped1.locationAvenue){
					System.out.println("You have crashed into a drunk Moped driver.");
					System.exit(1);
				}
				if (userMoped.locationStreet == drunkMoped2.locationStreet && userMoped.locationAvenue == drunkMoped2.locationAvenue){
					System.out.println("You have crashed into a drunk Moped driver.");
					System.exit(1);
				}
				break;
			case "right":
				userMoped.right();
				drunkMoped1.drunkMovement();
				drunkMoped2.drunkMovement();
				if (userMoped.locationStreet == drunkMoped1.locationStreet && userMoped.locationAvenue == drunkMoped1.locationAvenue){
					System.out.println("You have crashed into a drunk Moped driver.");
					System.exit(1);
				}
				if (userMoped.locationStreet == drunkMoped2.locationStreet && userMoped.locationAvenue == drunkMoped2.locationAvenue){
					System.out.println("You have crashed into a drunk Moped driver.");
					System.exit(1);
				}
				break;
			case "check gas":
				userMoped.checkgas();
				break;
			case "park":
				userMoped.park();
				break;
			case "fill gas":
				userMoped.fillgas();
				break;
			case "go to Petite Abeille":
				userMoped.goPetite();
				drunkMoped1.drunkMovement();
				drunkMoped2.drunkMovement();
				if (userMoped.locationStreet == drunkMoped1.locationStreet && userMoped.locationAvenue == drunkMoped1.locationAvenue){
					System.out.println("You have crashed into a drunk Moped driver.");
					System.exit(1);
				}
				if (userMoped.locationStreet == drunkMoped2.locationStreet && userMoped.locationAvenue == drunkMoped2.locationAvenue){
					System.out.println("You have crashed into a drunk Moped driver.");
					System.exit(1);
				}
				break;
			
			
			default:
				System.out.println("Did not recognize command. Press help for list of commands");
				break;
			}
		}
	}
}


