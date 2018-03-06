package uint2_3;

/**
 * 最大连续子数组P23
 */
public class MaxSubValue {
    public static int getMaxSubValueN2(int[] array){
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            int sum = 0;
            for(int j = i; j < array.length; j++){
                sum += array[j];
                if(sum > maxValue){
                    maxValue = sum;
                }
            }
        }
        return maxValue;
    }

    public static int getMaxSubValueNlogN(int[] array){
        return doGetMaxSubValueNlogN(array, 0 ,array.length - 1);
    }
    private static int doGetMaxSubValueNlogN(int[] array, int start, int end){
        if(end - start == 1){
            return Integer.max(array[start], array[end]);
        }
        int nMiddle = (start + end) / 2;
        int leftValue = doGetMaxSubValueNlogN(array, start, nMiddle);
        int righValue = doGetMaxSubValueNlogN(array, nMiddle + 1, end);

        int middleValue = array[nMiddle];
        int middleTemp = Integer.MIN_VALUE;
        int valueTemp = 0;
        for(int i = nMiddle - 1; i >= 0; i--){
            valueTemp += array[i];
            if(valueTemp > middleTemp){
                middleTemp = valueTemp;
            }
        }
        if(middleTemp > 0){
            middleValue += middleTemp;
        }
        middleTemp = Integer.MIN_VALUE;
        valueTemp = 0;
        for(int j = nMiddle + 1; j <= end; j++){
            valueTemp += array[j];
            if(valueTemp > middleTemp){
                middleTemp = valueTemp;
            }
        }
        if(middleTemp > 0){
            middleValue += middleTemp;
        }

        int maxValue = Integer.max(leftValue, righValue);
        maxValue = Integer.max(maxValue, middleValue);

        return maxValue;
    }

    public static int getMaxSubValueN(int[] array){
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : array){
            sum += i;
            if(sum > maxValue){
                maxValue = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxValue;
    }
}
