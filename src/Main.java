import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;


public class Main {
	public static void main (String [] args) throws Exception {
		Scanner input;
		input = new Scanner(new File("C:\\Users\\kooki\\Documents\\NFLdata.csv"));
		input.useDelimiter(",");
		
		
		int counter = 0;
	
		ArrayList<Player> NflData = new ArrayList<Player>();
		
		while (input.hasNext()) {
			System.out.print(input.next());
		    Player nflPlayer = new Player(0, null, null, false);
			NflData.add(nflPlayer);
			System.out.println(NflData);
			System.out.println();	
			System.out.println("First element of the array list is:" + NflData.get(counter));
			counter++;
			
		}
	
		
		
		input.close();
	}

}
