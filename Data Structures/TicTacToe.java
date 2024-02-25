import java.util.*;

public class TicTacToe {
    static String[] board;
    static String turn;

    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }
        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
                break;
            } else if (a == 8) {
                return "draw";
            }
        }
        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }

    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        board = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        turn = "X";

        System.out.println("Welcome to Tic-Tac-Toe!");
        printBoard();

        while (true) {
            int slot;
            try {
                slot = Integer.parseInt(in.nextLine());
                if (!(slot >= 1 && slot <= 9)) {
                    System.out.println("Invalid input. Please enter a number between 1 and 9.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            if (board[slot - 1].equals(String.valueOf(slot))) {
                board[slot - 1] = turn;
                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }
                printBoard();
                String result = checkWinner();
                if (result != null) {
                    if (result.equals("draw")) {
                        System.out.println("It's a draw!");
                    } else {
                        System.out.println(result + " wins!");
                    }
                    break;
                }
            } else {
                System.out.println("Slot already taken. Choose another slot.");
            }
        }
    }
}
