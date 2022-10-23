import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class CardCounter {
	
	public static void main(String[] args)
	{
		ArrayList<Card> deckOfCards = new ArrayList<Card>();
		ArrayList<Card> aces = new ArrayList<Card>();
		ArrayList<Card> twos = new ArrayList<Card>();
		ArrayList<Card> threes = new ArrayList<Card>();
		ArrayList<Card> fours = new ArrayList<Card>();
		ArrayList<Card> fives = new ArrayList<Card>();
		ArrayList<Card> sixes = new ArrayList<Card>();
		ArrayList<Card> sevens = new ArrayList<Card>();
		ArrayList<Card> eights = new ArrayList<Card>();
		ArrayList<Card> nines = new ArrayList<Card>();
		ArrayList<Card> tens = new ArrayList<Card>();
		ArrayList<Card> jacks = new ArrayList<Card>();
		ArrayList<Card> queens = new ArrayList<Card>();
		ArrayList<Card> kings = new ArrayList<Card>();
		Card card;
		String newCard;
		Boolean stillGoing;
		
		stillGoing = true;
		File deck = new File("cards");
		if(deck.isFile() && deck.exists())
		{
			try
			{
				Scanner deckScan = new Scanner(deck);
				while(deckScan.hasNextLine())
				{
					String line = deckScan.nextLine();
					Scanner cardScan = new Scanner(line);
					cardScan.useDelimiter(",");
					while (cardScan.hasNext())
					{
						newCard = cardScan.next();
						
						card = new Card(newCard);
						deckOfCards.add(card);
						if(card.getCardValue() == 65)
						{
							aces.add(card);
						}
						if(card.getCardValue() == 50)
						{
							twos.add(card);
						}
						if(card.getCardValue() == 51)
						{
							threes.add(card);
						}
						if(card.getCardValue() == 52)
						{
							fours.add(card);
						}
						if(card.getCardValue() == 53)
						{
							fives.add(card);
						}
						if(card.getCardValue() == 54)
						{
							sixes.add(card);
						}
						if(card.getCardValue() == 55)
						{
							sevens.add(card);
						}
						if(card.getCardValue() == 56)
						{
							eights.add(card);
						}
						if(card.getCardValue() == 57)
						{
							nines.add(card);
						}
						if(card.getCardValue() == 49)
						{
							tens.add(card);
						}
						if(card.getCardValue() == 74)
						{
							jacks.add(card);
						}
						if(card.getCardValue() == 81)
						{
							queens.add(card);
						}
						if(card.getCardValue() == 75)
						{
							kings.add(card);
						}
						
						
					}
					cardScan.close();
				}
				deckScan.close();
			}
			catch (FileNotFoundException e)
			{
			}
		}
		
		System.out.println("2:  " + aces.size() + "\n" +
				"3:  " + aces.size() + "\n" +
				"4:  " + aces.size() + "\n" +
				"5:  " + aces.size() + "\n" +
				"6:  " + aces.size() + "\n" +
				"7:  " + aces.size() + "\n" +
				"8:  " + aces.size() + "\n" +
				"9:  " + aces.size() + "\n" +
				"10: " + aces.size() + "\n" +
				"J:  " + aces.size() + "\n" +
				"Q:  " + aces.size() + "\n" +
				"K:  " + aces.size() + "\n" +
				"A:  " + aces.size());
		
		while (stillGoing == true)
		{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nWhat card was just played?");
		String justPlayed = scan.next();
		justPlayed.toLowerCase();
		switch (justPlayed)
		{
		case ("a"):
			if(aces.size() == 0)
			{
				break;
			}
			aces.remove(0);
		break;
		case ("2"):
			if(twos.size() == 0)
			{
				break;
			}
			twos.remove(0);
		break;
		case ("3"):
			if(threes.size() == 0)
			{
				break;
			}
			threes.remove(0);
		break;
		case ("4"):
			if(fours.size() == 0)
			{
				break;
			}
			fours.remove(0);
		break;
		case ("5"):
			if(fives.size() == 0)
			{
				break;
			}
			fives.remove(0);
		break;
		case ("6"):
			if(sixes.size() == 0)
			{
				break;
			}
			sixes.remove(0);
		break;
		case ("7"):
			if(sevens.size() == 0)
			{
				break;
			}
			sevens.remove(0);
		break;
		case ("8"):
			if(eights.size() == 0)
			{
				break;
			}
			eights.remove(0);
		break;
		case ("9"):
			if(nines.size() == 0)
			{
				break;
			}
			nines.remove(0);
		break;
		case ("0"):
			if(tens.size() == 0)
			{
				break;
			}
			tens.remove(0);
		break;
		case ("j"):
			if(jacks.size() == 0)
			{
				break;
			}
			jacks.remove(0);
		break;
		case ("q"):
			if(queens.size() == 0)
			{
				break;
			}
			queens.remove(0);
		break;
		case ("k"):
			if(kings.size() == 0)
			{
				break;
			}
			kings.remove(0);
		break;
		
		}
		
		int cardsLeft = aces.size() + twos.size() + threes.size() + fours.size() + fives.size() + sixes.size() + sevens.size() + 
				eights.size() + nines.size() + tens.size() + jacks.size() + queens.size() + kings.size();
		
		DecimalFormat df = new DecimalFormat("0.0");
		String twosPercent = df.format(((((double)twos.size()/(double)cardsLeft))*100));
		String threesPercent = df.format(((((double)threes.size()/(double)cardsLeft))*100));
		String foursPercent = df.format(((((double)fours.size()/(double)cardsLeft))*100));
		String fivesPercent = df.format(((((double)fives.size()/(double)cardsLeft))*100));
		String sixesPercent = df.format(((((double)sixes.size()/(double)cardsLeft))*100));
		String sevensPercent = df.format(((((double)sevens.size()/(double)cardsLeft))*100));
		String eightsPercent = df.format(((((double)eights.size()/(double)cardsLeft))*100));
		String ninesPercent = df.format(((((double)nines.size()/(double)cardsLeft))*100));
		String tensPercent = df.format(((((double)tens.size()/(double)cardsLeft))*100));
		String jacksPercent = df.format(((((double)jacks.size()/(double)cardsLeft))*100));
		String queensPercent = df.format(((((double)queens.size()/(double)cardsLeft))*100));
		String kingsPercent = df.format(((((double)kings.size()/(double)cardsLeft))*100));
		String acesPercent = df.format(((((double)aces.size()/(double)cardsLeft))*100));
		
		
		System.out.println("2:  " + twos.size() + "\t " + twosPercent + "%\n" +
				"3:  " + threes.size() + "\t " + threesPercent + "%\n" +
				"4:  " + fours.size() + "\t " + foursPercent + "%\n" +
				"5:  " + fives.size() + "\t " + fivesPercent + "%\n" +
				"6:  " + sixes.size() + "\t " + sixesPercent + "%\n" +
				"7:  " + sevens.size() + "\t " + sevensPercent + "%\n" +
				"8:  " + eights.size() + "\t " + eightsPercent + "%\n" +
				"9:  " + nines.size() + "\t " + ninesPercent + "%\n" +
				"10: " + tens.size() + "\t " + tensPercent + "%\n" +
				"J:  " + jacks.size() + "\t " + jacksPercent + "%\n" +
				"Q:  " + queens.size() + "\t " + queensPercent+ "%\n" +
				"K:  " + kings.size() + "\t " + kingsPercent + "%\n" +
				"A:  " + aces.size() + "\t " + acesPercent + "%\n" + 
				"Cards Left: " + cardsLeft);
		
//		System.out.println("Still Going? (y or n): ");
//		String continuing = scan.next();
//		if (continuing.equalsIgnoreCase("n"))
//		{
//			stillGoing = false;
//			scan.close();
//		}
		
	}
		
	}
}
	
	

