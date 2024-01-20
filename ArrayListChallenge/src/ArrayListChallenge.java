import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag=true;
        ArrayList<String> groceryList = new ArrayList<>();
        while(flag){
            printMenu();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 -> addGroceries(groceryList);
                case 2 -> removeGroceries(groceryList);
                default -> flag=false;
            }
            groceryList.sort(Comparator.naturalOrder());
            System.out.println(groceryList);
        }


    }

    private static void removeGroceries(ArrayList<String> groceryList) {
        System.out.println("Remove any items (comma delimited list)");
        String[] removeItems = scanner.nextLine().split(",");
        for(String remove: removeItems){
            groceryList.remove(remove.trim());
        }
    }

    private static void addGroceries( ArrayList<String> groceryList){

        System.out.println("Add item(s) to list (comma delimited list)");
        String[] addItems = scanner.nextLine().split(",");
        for (String addItem : addItems) {
            if (!groceryList.contains(addItem)) {
                groceryList.add(addItem.trim());
            }
        }
    }
    private static void printMenu() {
        String textBlock = """
                Available actions:

                0 - to shutdown

                1 - to add item(s) to list (comma delimited list)

                2 - to remove any items (comma delimited list)

                Enter a number for which action you want to do:""";

        System.out.println(textBlock+" ");
    }
}
