package DataMining;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Assignment4 {
	
// declaring final variables to define row and column sizes of data set	
public static final int ROW = 16428;
public static final int COLUMN = 5;
	
// a method to convert the text file into totalArr, an array with each line of the data as an element
	public static String[] fileToString(String filename) throws FileNotFoundException{
		String totalText = "";
		String[] totalArr = new String[ROW];
		int counter = 0;
		Scanner text = new Scanner(new File(filename));
		while (text.hasNextLine()){
			//String line=text.nextLine();
			//totalText= totalText + "\n" + line;
			totalArr[counter]=text.nextLine();
			counter++;
		}
		return totalArr;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(System.in);
		
		// introductory message to user		
		System.out.println("Welcome to the NYC Average Class Size Data App. This app mines data from https://data.cityofnewyork.us/Education/2007-08-Class-Size-School-level-Detail/i8ys-e4pm ");
		System.out.println("Please restrict data by one of the following parameters: borough, total students registered, average class size");
		String userInput = input.nextLine();
		
		// assigns text file to String; throws exception and exits if not found		
		String [] text= fileToString("src/data.txt");
		
		
		//checks which row of input user grabbed and assigns it to int variable rowOfInput. Asks for specific parameter to restrict search by.
		int columnOfInput = 0;
		int x = 0; // a switch to check user has input a valid restricting parameter
		while (x==0){
			//borough restriction
			if (userInput.equals("borough")){
				columnOfInput = 0; 
				System.out.println("Enter Queens, Manhattan, Brooklyn, Bronx, or Staten Island.");
				userInput = input.nextLine();
				x=1;
			// total students registered restriction
			} else if (userInput.equals("total students registered")){
				System.out.println("Enter a number. Restrict search to all entries with this many total students registered.");
				userInput = input.nextLine();
				columnOfInput=3;
				x=1;
			// average class size restriction
			} else if (userInput.equals("average class size")){
				System.out.println("Enter a number. Restrict search to all entries with this average class size.");
				userInput = input.nextLine();
				columnOfInput=4;
				x=1;
			} else {
				System.out.println("Not recognized!");
				userInput = input.nextLine();
			}
		}
		
		
		
		
		// initializing 2 dimensional array
		int columns = COLUMN;
		int rows = ROW;
		
		String[][] dataArray = new String [rows][columns];
		
		
		// splits data by each entry and assigns to 2 dimensional array, dataArray
		for (int i =0; i<text.length; i++){
			String[] entry = text[i].split("-");
			for (int k=0; k < columns; k++){
				dataArray[i][k]=entry[k];
			}
		}
		
		
		// want to get rid of whitespace so that it is clear when we compare two string values in later code
		// gets rid of all whitespace in first column
		for (int i=0; i<rows; i++){
			dataArray[i][0]= dataArray[i][0].replaceAll("\\s","");
		}
		
		// gets rid of all whitespace in third column
		for (int i=0; i<rows; i++){
			dataArray[i][2]= dataArray[i][2].replaceAll("\\s","");
		}
		
		// gets rid of all whitespace in fourth column
		for (int i=0; i<rows; i++){
			dataArray[i][3]= dataArray[i][3].replaceAll("\\s","");
		}
		
		// gets rid of all whitespace in fifth column
		for (int i=0; i<rows; i++){
			dataArray[i][4]= dataArray[i][4].replaceAll("\\s","");
		}
		

		// OUTPUT
		
		// by borough constraint:
		if (columnOfInput==0){
			
			if (userInput.equals("Manhattan")){ 
				//printing the header
				System.out.printf("%-29s %-29s %-35s %-29s %-29s", "|Borough|", "|Address|", "|Program Type|", "|Total Registered|", "|Avg Class Size|");
				System.out.println("");
				// checking for entries within the restriction parameter given by user
				for (int i = 0; i <rows; i++){
					if (dataArray[i][0].equals("M")){
						for (int j =0; j<columns; j++){
				// cutting string into max length of 20
							dataArray[i][j] = dataArray[i][j].substring(0, Math.min(dataArray[i][j].length(), 20));
							System.out.printf("%-20s",dataArray[i][j]);
						}
						System.out.println("");
					}
				}
			} else if (userInput.equals("Queens")){
				System.out.printf("%-29s %-29s %-35s %-29s %-29s", "|Borough|", "|Address|", "|Program Type|", "|Total Registered|", "|Avg Class Size|");
				System.out.println("");
				for (int i = 0; i <rows; i++){
					if (dataArray[i][0].equals("Q")){
						for (int j =0; j<columns; j++){
							dataArray[i][j] = dataArray[i][j].substring(0, Math.min(dataArray[i][j].length(), 20));
							System.out.printf("%-30s",dataArray[i][j]);
						}
						System.out.println("");
					}
				}
			} else if (userInput.equals("Bronx")){
				System.out.printf("%-29s %-29s %-35s %-29s %-29s", "|Borough|", "|Address|", "|Program Type|", "|Total Registered|", "|Avg Class Size|");
				System.out.println("");
				for (int i = 0; i <rows; i++){
					if (dataArray[i][0].equals("X")){
						for (int j =0; j<columns; j++){
							dataArray[i][j] = dataArray[i][j].substring(0, Math.min(dataArray[i][j].length(), 20));
							System.out.printf("%-30s",dataArray[i][j]);
						}
						System.out.println("");
					}
				}
			} else if (userInput.equals("Brooklyn")){
				System.out.printf("%-29s %-29s %-35s %-29s %-29s", "|Borough|", "|Address|", "|Program Type|", "|Total Registered|", "|Avg Class Size|");
				System.out.println("");
				for (int i = 0; i <rows; i++){
					if (dataArray[i][0].equals("R")){
						for (int j =0; j<columns; j++){
							dataArray[i][j] = dataArray[i][j].substring(0, Math.min(dataArray[i][j].length(), 20));
							System.out.printf("%-30s",dataArray[i][j]);
						}
						System.out.println("");
					}
				}
			} else if (userInput.equals("Staten Island")){
				System.out.printf("%-29s %-29s %-35s %-29s %-29s", "|Borough|", "|Address|", "|Program Type|", "|Total Registered|", "|Avg Class Size|");
				System.out.println("");
				for (int i = 0; i <rows; i++){
					if (dataArray[i][0].equals("K")){
						for (int j =0; j<columns; j++){
							dataArray[i][j] = dataArray[i][j].substring(0, Math.min(dataArray[i][j].length(), 20));
							System.out.printf("%-30s",dataArray[i][j]);
						}
						System.out.println("");
					}
				}
			} else {
				System.out.println("Borough not recognized");
			}
		}
		
		
		// if user wants parameter by total students registered
		else if (columnOfInput==3){
			System.out.printf("%-29s %-29s %-25s %-20s %-20s", "|Borough|", "|Address|", "|Program Type|", "|Total Registered|", "|Avg Class Size|");
			System.out.println("");
			for (int i = 0; i <rows; i++){
				if (dataArray[i][3].equals(userInput)){
					for (int j =0; j<columns; j++){
						dataArray[i][j] = dataArray[i][j].substring(0, Math.min(dataArray[i][j].length(), 20));
						System.out.printf("%-30s",dataArray[i][j]);
					}
					System.out.println("");
				}
			}
		}
		
		// if user wants parameter by average class size
		else if (columnOfInput==4){
			System.out.printf("%-29s %-29s %-25s %-20s %-20s", "|Borough|", "|Address|", "|Program Type|", "|Total Registered|", "|Avg Class Size|");
			System.out.println("");
			for (int i = 0; i <rows; i++){
				if (dataArray[i][4].equals(userInput)){
					for (int j =0; j<columns; j++){
						dataArray[i][j] = dataArray[i][j].substring(0, Math.min(dataArray[i][j].length(), 20));
						System.out.printf("%-30s",dataArray[i][j]);
					}
					System.out.println("");
				}
			}
		}
	}
}

		


