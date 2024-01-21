import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        var placesToVist = new LinkedList<String>();
        placesToVist.add("Dubai");
        placesToVist.add(0,"London");
        System.out.println(placesToVist);

        addMoreElements(placesToVist);
        System.out.println(placesToVist);

//        System.out.println("=======removed elements======");
//        removeEmlements(placesToVist);
//        System.out.println(placesToVist);
//
//        System.out.println("=======retrieve elements======");
//        gettingElements(placesToVist);
//        System.out.println(placesToVist);

        printItinerary(placesToVist);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Alberta");
        list.addLast("Greece");
        //queue methods
        list.offer("Tokyo");
        list.offerFirst("Finland");
        list.offerLast("Melbourne");
        //Stack methods
        list.push("Maldives");
        list.push("Greece");

    }
    private static void removeEmlements(LinkedList<String> list){

        System.out.println("Before removing "+ list);
        //list methods
        list.remove(3);
        list.remove("Tokyo");

        String s1=list.remove();// removes first element
        System.out.println(s1+" was removed");

        String s2=list.removeFirst();// removes first element
        System.out.println(s2+" was removed");

        String s3=list.removeLast();
        System.out.println(s3+" was removed");

        //Queue / deque poll methods
        String p1= list.poll();
        System.out.println(p1+" was removed");

        String p2= list.pollFirst();
        System.out.println(p2+" was removed");

        String p3= list.pollLast();
        System.out.println(p3+" was removed");

        //Stack methods
        list.push("Melbourne");
        list.push("Dubai");
        list.push("Greece");
        System.out.println(list);

        String p4= list.pop();//removes top ele from stack
        System.out.println(p4 +" was removed");
    }

    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrieved Element = "+ list.get(4));
        System.out.println("First Element = "+ list.getFirst());
        System.out.println("Last Element = "+ list.getLast());

        System.out.println("Greece is at position: "+list.indexOf("Greece"));
        System.out.println("Greece is at position: "+list.lastIndexOf("Greece"));

        //Queue retrieval method
        System.out.println("Element from element(): "+list.element());

        //Stack retrieval methods
        System.out.println("Elements from peek(): "+list.peek());
        System.out.println("Elements from peekFirst(): "+list.peekFirst());
        System.out.println("Elements from peekLast(): "+list.peekLast());
    }

    public static  void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at "+list.getFirst());
         for(int i=1 ; i <list.size(); i++){
             System.out.println("--> From: "+list.get(i-1)
                     +" to "+list.get(i));
         }
        System.out.println("Trip ends at "+list.getLast());
    }
}
