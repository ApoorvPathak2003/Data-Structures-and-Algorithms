package BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N_Queens {
    private static void save_board(char[][] board, List<List<String>> all_board) {
        String row = "";
        List<String> new_board = new ArrayList<>();

        for (int i = 0; i < board[0].length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                }else{
                    row += '_';
                }
            }
            new_board.add(row);
        }
        all_board.add(new_board);
    }
    private static boolean safe_position(int row, int column, char[][] board) {
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == 'Q') {
                return false;
            }
        }

        int r = row;
        for (int c = column; c >= 0 && r >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        r = row;
        for (int c = column; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        r = row;
        for (int c = column; c > 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // r = row;
        for (int c = column; c < board.length && r < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }
    public static void helper(char[][] board, List<List<String>> all_board, int column) {
        if (column == board.length) {
            save_board(board, all_board);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (safe_position(row, column, board)) {
                board[row][column] = 'Q';
                helper(board, all_board, column + 1);
                board[row][column] = '_';
            }
        }
    }
    public static List<List<String>> solve_N_Queens(int n) {
        List<List<String>> all_board = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, all_board, 0);

        return all_board;
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size(row count OR column count) of the board: ");
        int size = input.nextInt();

        List<List<String>> all_board_comb = solve_N_Queens(size);

        System.out.println("\nBelow are all the combinations for the placement of 'Q' on the board of size " + size + "x" + size);
        for(List<String> list: all_board_comb){
            for(String element: list){
                System.out.println(element);
            }
            System.out.println();
        }

        input.close();
    }
}