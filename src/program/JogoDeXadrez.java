package program;

import java.util.Locale;
import java.util.Scanner;

import boardgame.Board;

public class JogoDeXadrez {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Board board =  new Board (8, 8);
		
		
		
		sc.close();

	}

}
