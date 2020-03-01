package kz.idrissov.optional.two.entity;

public class ArrayNumber {
    private static final int FIRST_ELEMENT = 0;
    private static final int DIGIT_AMOUNT = 10;
    private static final int INITIAL_VAL = 0;
    private static final int DIGITS_OF_ZERO = 1;

    public int unique(int[] array) {
        int result = array[FIRST_ELEMENT];
        int minDifference = DIGIT_AMOUNT;
        int[] newArray = new int[array.length];

        //copies an array to the new one
        System.arraycopy(array, 0, newArray, 0, array.length);

        for(int i = 0; i < newArray.length; i++) {
            int differentDigits = INITIAL_VAL;
            int[] digits = new int[DIGIT_AMOUNT];

            if(newArray[i] == 0) {
                differentDigits = DIGITS_OF_ZERO;
            } else {
                while (newArray[i] != 0) {
                    digits[newArray[i] % 10] = newArray[i] % 10;
                    newArray[i] /= 10;
                } // copies each number's digits to an array of digits

                for (int j = 0; j < DIGIT_AMOUNT; j++) {
                    if (digits[j] > 0) {
                        differentDigits++;
                    }
                } // counts the number of different digits of the number
            }

            if(differentDigits < minDifference) {
                minDifference = differentDigits;
                result = i;
            } // if the number of different digits is minimum, then keeps the index of the number
        }
        return array[result];
    }
}
