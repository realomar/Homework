import java.util.Scanner;
public class BaseballStats {

	public static void main(String[] args) {
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.println ("Enter player name: ");
		String name = keyboardIn.next();
	
		System.out.println ("Enter at-bats: ");
		int AB = keyboardIn.nextInt();
		
		System.out.println ("Enter hits: ");
		int hits = keyboardIn.nextInt();
		
		System.out.println ("Enter doubles: ");
		int doubles = keyboardIn.nextInt();
		
		System.out.println ("Enter triples: ");
		int triples = keyboardIn.nextInt();
		
		System.out.println ("Enter home runs: ");
		int HR = keyboardIn.nextInt();
		
		System.out.println ("Enter runs: ");
		int runs = keyboardIn.nextInt();
		
		System.out.println ("Enter walks: ");
		int walks = keyboardIn.nextInt();
		
		System.out.println ("Enter hits by pitch: ");
		int HBP = keyboardIn.nextInt();
		
		System.out.println ("Enter sacrifice flies: " );
		int SF = keyboardIn.nextInt();
		
		int singles = (hits - doubles - triples - HR);

		double OBP = (double)(hits + walks + HBP) / (double)(AB + walks + HBP + SF);

		double SLG = (singles + (2 * doubles) + (3 * triples) + (4 * HR)) / getBattingAverage(hits,AB);

		double OBS = OBP + SLG;
		
		int TB = (singles + (2 * doubles) + (3 * triples) + (4 * HR));

		
		System.out.println ("Batting average: " + getBattingAverage(hits,AB));
		System.out.println ("On-base percent: " + TB);
		System.out.println ("Slugging percent: " + SLG);
		System.out.println ("On Base + Slugging Percent: " + OBS);
		System.out.println ("Total Bases: " + TB);

	}
	
	public static double getBattingAverage(int hits, int AB) {
		return (double)hits / (double)AB;
	}

}