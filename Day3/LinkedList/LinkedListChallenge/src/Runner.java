import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Runner {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean selected=true;
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place[] places = {
                new Place("Adelaide", 1374),
                new Place("Alice Springs", 2771),
                new Place("Brisbane", 917),
                new Place("Darwin", 3972),
                new Place("Melbourne", 877),
//                new Place("Darwin", 1111),
                new Place("Perth", 3923)};
        placesToVisit.addFirst(new Place("Sydney", 0));
        addPlaces(places,placesToVisit);


        // menu actions code

        while(selected){
           printMenu();
           switch(scanner.nextLine()){
               case "F","Forward" -> forwardAction(placesToVisit);
               case "B","Backward" -> backwardAction(placesToVisit);
               case "L","List Places" -> listPlacesAction(placesToVisit);
               case "M","Menu" -> printMenu();
               default -> selected = false;
           }
        }

    }

    private static void listPlacesAction(LinkedList<Place> placesToVisit) {
        for (Place p : placesToVisit) {
            System.out.println(p.getPlaceName()+" : "+ p.getDistance());
        }
    }

    private static void backwardAction(LinkedList<Place> placesToVisit) {
    }

    private static void forwardAction(LinkedList<Place> placesToVisit) {
    }

    private static void printMenu() {
        String textBlock= """
                Available actions (select word or letter):

                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                Enter which action you want to do:""";

        System.out.println(textBlock+" ");
    }

    public static void addPlaces(Place[] places, LinkedList<Place> list) {

        for (Place place : places) {
            if (!ifPlaceExists(place, list)) {
                list.add(place);
            }
        }
        list.sort(Comparator.comparing(Place::getDistance));
    }

    private static boolean ifPlaceExists(Place place, LinkedList<Place> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPlaceName().equalsIgnoreCase(place.getPlaceName())) {
                return true;
            }
        }
        return false;
    }
}
