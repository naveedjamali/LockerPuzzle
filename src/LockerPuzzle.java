public class LockerPuzzle {
    public static void main(String[] args) {
        /***
         * Declaring array of booleans. each element contain a 'false' value by default.
         */
        boolean[] lockers = new boolean[100];

        /**
         * if a boolean is not initialized with any value, Java initializes it with 'false'.
         * So, our lockers array contains 100 false values.
         */


        for (int i = 1; i <= lockers.length; i++) {

            /**
             *  i is the student number, entering in in the building;
             *   we are starting j from i (not from zero) since no student will change the
             *   locker state in the previous indexes. e.g. student number 20 will not open or close a locker
             *   from index 19 and below, student 20 will start working from locker number 20.
             */


            for (int j = i; j <= lockers.length; j++) {

                // in the inner loop. we are which locker should be opened or close, or which one should
                // should be ignored by student.
                // we divide the locker number by sdudent's index. if it remainder number is zero, then we guess this
                // is the locker which should be opened or closed.
                // For example student 3 will change lockers 3,6,9,12 and so on,
                // student 9 will change lockers 9, 18, 27, 36 etc.
                // and all these numbers when divide by 9 give 0 as remainder.

                if (j % i == 0) {
                    /**
                     * Did you notice, we are starting i from 1, not zero?
                     * i will touch the 100, and in our locker array, the last element is at 99 (not at 100)
                     * You guessed it, arrays starts from zero...
                     */
                    lockers[j - 1] = !lockers[j - 1];
                }

            }
        }

        /**
         * Finally, print the result the result
         */


        for (int i = 0; i < 100; i++) {
            /**
             * In this loop, if an array element is set to true,
             * it means the locker is opened, and we will print it.
             * Since array index start from 0, so for human's readability purpose, while printing
             * we will increment it by 1, so that printing index should start from 1, not from zero.
             */

            /**
             * If locker is open
             */
            if (lockers[i]) {
                /**
                 * print the index number of locker
                 */
                System.out.print(i + 1 + " ");
            }

        }
    }
}
