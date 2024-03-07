// move all zeros in the array to the end
import java.util.Arrays;

public class zeros_to_end {
    public static void main(String[] args) {
        int array[] = {0,22,8,17,0,6,0,7,0};
        int i =0 ;
        int j=0;
        while(j< array.length){
        if (array[j]!=0){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;

        }
            j++;
        }
        System.out.println(Arrays.toString(array));

        }
    }

