import java.util.Scanner;

public class Total_Path_Maze {
    public static int Maze_Path_Count(int start_rows, int start_columns, int total_row_count, int total_column_count){
        if (start_columns == total_column_count || start_rows == total_row_count) {
            return 0;
        }
        
        if (start_columns == total_column_count - 1 && start_rows == total_row_count - 1) {
            return 1;
        }
        
        int down_path_count = Maze_Path_Count(start_rows + 1, start_columns, total_row_count, total_column_count);
        int right_path_count = Maze_Path_Count(start_rows, start_columns + 1, total_row_count, total_column_count);
        
        return down_path_count + right_path_count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the maze: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns in the maze: ");
        int columns = input.nextInt();

        System.out.print("Total path count in a " + rows + "x" + columns +  " maze: " + Maze_Path_Count(0, 0, rows, columns));

        input.close();
    }
}