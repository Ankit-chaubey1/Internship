public class Conditional {
    public static void main(String[]args){
        int time=16;
        if(time<12){
            System.out.println("morning");
        }else if(time >12 && time <18){
            System.out.println("noon");
        }else{
            System.out.println("night");
        }
    }
}
