package inclass_11;

public class IntException extends Exception {
    public IntException(){
        super("Error: number is not an int");
    }

    public IntException(int num_one){
        super("Error: number is not an int " + num_one);
    }

    public IntException(int num_one, int num_two){
        super("Error: number is not an int " + num_one + " " + num_two);
    }
}
