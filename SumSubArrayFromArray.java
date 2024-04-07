public class SumSubArrayFromArray {
    public static void main(String[] args) {
        int arr1[] = {1,3,2,11,12};
        int sum=23;
        int currentSum=0;
        for(int i=0;i<arr1.length;i++)
        {
        currentSum = arr1[i];
//        if number = sum
        if(currentSum==sum)
        {
            System.out.println("Sum found at index "+i);
            break;
        }
        else {
//            trying with subarray
            for(int j=i+1;j<arr1.length;j++) {
                currentSum += arr1[j];
                if (currentSum == sum) {
                    System.out.println("Sum found between indexes " + i + " and " + j);
                    break;
                }
            }
        }
        }
    }
}
