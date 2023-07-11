import java.util.HashMap;

public class Itinerary {
    public static String get_start(HashMap<String, String> tickets) {
        HashMap<String, String> reverse_tickets =  new HashMap<>();

        for (String key : tickets.keySet()) {
            reverse_tickets.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!reverse_tickets.containsKey(key)) {
                return key;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();

        // Ahmedabad -> Delhi -> Goa - > Bhopal -> Bangalore
        tickets.put("Goa", "Bhopal");
        tickets.put("Delhi", "Goa");
        tickets.put("Bhopal", "Bangalore");
        tickets.put("Ahmedabad", "Delhi");

        String start_point = get_start(tickets);

        while (tickets.containsKey(start_point)) {
            System.out.print(start_point + " -> ");
            start_point = tickets.get(start_point);
        }

        System.out.println(start_point);
    }
}