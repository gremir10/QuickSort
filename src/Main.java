import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();

        //create array to send to BubbleSort
        int[] myArray = new int[20];

        //fill array
        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = rnd.nextInt(100);
        }

        System.out.println("Pre-quick sorted array: ");
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.println(myArray[i] + " ");
        }

        QuickSort.sort(myArray);
        System.out.println("Quick sorted array: ");
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.println(myArray[i] + " ");
        }


    }
}