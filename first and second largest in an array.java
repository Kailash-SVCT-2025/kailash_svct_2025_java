// first and second largest in an array

public class largest_array {
    public static void main(String[] args) {
        int inputarray[] = {2,3,4,5,8,7,10,9};
        int firstlargest =0;
        int secondlargest=0;
        for (int i = 0; i < inputarray.length; i++) {
            if (firstlargest < inputarray[i]){
                secondlargest=firstlargest;
                firstlargest= inputarray[i];
            }else if (secondlargest < inputarray[i]){
                secondlargest=inputarray[i];
            }

            System.out.println(firstlargest);
            System.out.println(secondlargest);
        }
    }
}