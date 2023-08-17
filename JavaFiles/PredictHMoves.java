package assignmentJava;
import java.util.Scanner;


public class PredictHMoves {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the starting position (e.g., 'a1', 'b3'): ");
	        String position = scanner.nextLine();

	        int startX = position.charAt(0) - 'a';
	        int startY = 8 - (position.charAt(1) - '0');
//	        System.out.println(startX);
//	        System.out.println(startY);
	        
	        System.out.println("Possible moves from " + position + ":");
	        String[] moves = predictHMoves(startX, startY);

	        for (String move : moves) {
	            System.out.print(move + " ");
	        }

	        scanner.close();
	    }
	    static boolean isValid(int x, int y) {
	        return x >= 0 && y >= 0 && x < 8 && y < 8;
	    }

	    static String[] predictHMoves(int x, int y) {
	        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
	        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

	        int validMoves = 0;
	        for (int i = 0; i < 8; i++) {
	            int newX = x + dx[i];
	            int newY = y + dy[i];

	            if (isValid(newX, newY)) {
	                validMoves++;
	            }
	        }
	        String[] moves = new String[validMoves];
	        int index = 0;

	        for (int i = 0; i < 8; i++) {
	            int newX = x + dx[i];
	            int newY = y + dy[i];

	            if (isValid(newX, newY)) {
	                char col = (char) (newX + 'a');
	                int row = 8 - newY;
	                moves[index++] = col + "" + row;
	            }
	        }
	        return moves;
	    }
	}


