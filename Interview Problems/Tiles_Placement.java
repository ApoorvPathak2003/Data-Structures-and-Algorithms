import java.util.Scanner;

public class Tiles_Placement {
    public static int place_tiles(int vertical_dimension, int horizontal_dimension) {
        if (vertical_dimension == horizontal_dimension) {
            return 2;
        }

        if (vertical_dimension < horizontal_dimension) {
            return 1;
        }

        int vertical_tile_placement = place_tiles(vertical_dimension - horizontal_dimension, horizontal_dimension);
        int horizontal_tile_placement = place_tiles(vertical_dimension - 1, horizontal_dimension);

        return vertical_tile_placement + horizontal_tile_placement;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the vertical dimensions of the room: ");
        int vertical_dimension = input.nextInt();
        
        System.out.print("Enter the horizontal dimensions of the room: ");
        int horizontal_dimension = input.nextInt();

        System.out.println("Size of the room: " + vertical_dimension + "x" + horizontal_dimension);
        System.out.println("Size of the tile: " + "1x" + horizontal_dimension);

        place_tiles(vertical_dimension, horizontal_dimension);

        input.close();
    }
}