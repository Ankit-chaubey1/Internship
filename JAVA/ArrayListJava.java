import java.util.ArrayList;

public class ArrayListJava {
    public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)
    // System.out.println(cars);
    // //get nethod
    

    // System.out.println(cars.get(0));
    // System.out.println(cars.size());

    // //set method
    // cars.set(0,"Tata punch");
    // System.out.println(cars);

    //loop on array list
    for(int i=0;i<cars.size();i++){
      System.out.println(cars.get(i));
    }
  }
}
