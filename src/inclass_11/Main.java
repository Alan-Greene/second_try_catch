package inclass_11;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers");
            int num_one = in.nextInt();
            in.nextLine();
            int num_two = in.nextInt();
            CreateArray new_arr = new CreateArray(num_one, num_two);
            System.out.println(Arrays.toString(new_arr.return_array()));
        } catch (InputMismatchException | IntException i){
            i.printStackTrace(System.out);
        }
    }
}