package inclass_11;

public class CreateArray {
    int num_one;
    int num_two;

    public CreateArray(int num_one, int num_two) throws IntException{
        this.num_one = num_one;
        this.num_two = num_two;
    }

    public int[] return_array(){
        int[] arr = new int[2];
        arr[0] = this.num_one;
        arr[1] = this.num_two;

        return arr;
    }
}
