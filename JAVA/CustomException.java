class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
super(msg);
    }
}

public class CustomException {
    int n=20;
    public void Age(int n) throws InvalidAgeException{
        if(n<=18){
            throw new InvalidAgeException("age less then 18");
        }
        System.out.println("valid age");
    }
}
