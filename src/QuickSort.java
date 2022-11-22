public class QuickSort
{
    //1. send in array from main
    //overload methods by giving same name but different parameters
    public static void sort(int[] array)
    {
        sort(array, 0, array.length - 1);
    }

    //2. sort method will be called
    //when doing method call, # of arguments you use determines what method is called
    private static void sort(int[] array, int left, int right)
    {
        if (left < right)
        {
            int leftMarker = left;
            int rightMarker = right - 1;

            int pivotIndex = (left + right) / 2;
            int pivotValue = array[pivotIndex];

            swap(array, pivotIndex, right);
            pivotIndex = right;

            //check if markers have crossed each other or not
            while (leftMarker < rightMarker) {
              /*  System.out.println("pre-swap: ");

                System.out.println("left value: " + array[leftMarker]);
                System.out.println("pivot value: " + array[pivotValue]);
                System.out.println("right value: " + array[right]); */

                while (leftMarker < right - 1 && array[leftMarker] < pivotValue) { //keeps moving to right one step at a time
                    leftMarker++;
                }
                while (rightMarker > left && array[rightMarker] > pivotValue) { //keeps moving to left one step at a time
                    rightMarker--;
                }
                //swap numbers
                if (leftMarker < rightMarker)
                {
                    swap(array, leftMarker++, rightMarker--);
                }
            }
            if (leftMarker == rightMarker && array[leftMarker] < pivotValue)
            {
                leftMarker++;
            }
            swap(array, leftMarker, pivotIndex);

            sort(array, left, leftMarker-1);
            sort(array, leftMarker + 1, right);
            }
        }
        private static void swap(int[] array, int leftMarker, int rightMarker)
        {
            int temp = array[leftMarker];
            array[leftMarker] = array[rightMarker];
            array[rightMarker] = temp;
        }
}
