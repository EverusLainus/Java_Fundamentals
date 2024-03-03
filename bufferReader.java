
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bufferReader{
    public static void main(String[] args) {
        // Example usage of BufferedReader to read integers and store them in an array
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Read the number of elements in the array
            int n = Integer.parseInt(reader.readLine());

            // Create an array to store the elements
            int[] array = new int[n];

            // Read the elements and store them in the array
           //String[] elements = reader.readLine().split("\\s+");
            String[] elements = reader.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(elements[i]);
            }

            // Print the array to verify
            System.out.println("Array elements: " + Arrays.toString(array));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

