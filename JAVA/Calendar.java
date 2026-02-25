import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;;
public class Calendar {
    public static void main(String[]args){
        //date
    //     LocalDate obj=LocalDate.now();
    //     System.out.println(obj);

    //     //time
    //     LocalTime obj1=LocalTime.now();
    //     System.out.println(obj1);

    //     //time and date together
    //     LocalDateTime myObj = LocalDateTime.now();
    // System.out.println(myObj);


    //date time formatter
     LocalDateTime myDateObj = LocalDateTime.now();
    // System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
    }

}
