public class Round1 {
    public static void main(String[] args) {
        int arr[] = {38, 44, 63, -51, -35, 19, 84, -69, 4, -46};

        int first = arr[0];
        int last = arr[1];
        int minSum = first + last;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];

                // Convert negative sum to positive manually
                int currentAbsSum = sum;
                if (currentAbsSum < 0) {
                    currentAbsSum = -currentAbsSum;
                }

                int minAbsSum = minSum;
                if (minAbsSum < 0) {
                    minAbsSum = -minAbsSum;
                }

                // Compare manually without Math.abs()
                if (currentAbsSum < minAbsSum) {
                    minSum = sum;
                    first = arr[i];
                    last = arr[j];
                }
            }
        }

        System.out.println("Near zero elements are: " + first + " and " + last + 
                           " (Sum = " + minSum + ")");
    }
}
