package uint2_3;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] array, int target){
        return doBinarySearch(array, 0, array.length - 1, target);
    }
    private static int doBinarySearch(int[] array, int start, int end, int target){
        if(end < start || end == start)
            if(array[start] != target)
                return -1;
        if(array[start] == target){
            return start;
        }
        if(array[end] == target){
            return end;
        }
        int middle = (start + end) / 2;
        if(array[middle] == target)
            return middle;
        else if(array[middle] > target){
            return doBinarySearch(array, start+1, middle - 1, target);
        }
        else{
            return doBinarySearch(array, middle + 1, end - 1, target);
        }
    }
}
