public class CombineTwoArray {
        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4};
            int[] array2 = {5, 6, 7, 8};

            int[] combined = new int[array1.length + array2.length];

            // Copy elements from the first array
            for (int i = 0; i < array1.length; i++) {
                combined[i] = array1[i];
            }

            // Copy elements from the second array
            for (int i = 0; i < array2.length; i++) {
                combined[array1.length+i] = array2[i];
            }
            int max=Integer.MIN_VALUE;
            // Display the combined array
            for (int i=0;i<combined.length;i++)
            {
                if(combined[i]>max)
                {
                    max = combined[i];
                }
            }
            System.out.println(max);
        }
    }

