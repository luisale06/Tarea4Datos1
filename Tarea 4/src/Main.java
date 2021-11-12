public class Main {

    public static void main(String[] args) {
        System.out.println("Invalid arrays: more than 3 elements");
        System.out.println("____________________________________");

        System.out.println("Array with six elements:");
        /**
         * 1. Try Example
         */
        try{
            int[] arr1 = new int[4];
            if (arr1.length > 3) {
                /**
                 * 2. Throw Example
                 * 3. Created Exception Example
                 */
                throw new Exception("Only arrays with length 3 or lower are valid");
            }
        }

        /**
         * Exception catches for the try block
         */
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception :: Divide by zero!!");
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds :: Accessed index out of bounds");
        }

        catch(Exception e) {
            System.out.println("Exception :: " + e.getMessage ());
        }

        /**
         * 4. Finally Example
         */
        finally {
            System.out.println("Finally block");
        }


        System.out.println("____________________________________");


        System.out.println("Array with an element equal to 5/0");
        /**
         * 1. Try Example
         */
        try{
            int[] arr2 = new int[3];
            arr2[3] = 5/0;
            if (arr2.length > 3) {
                /**
                 * 2. Throw Example
                 * 3. Created Exception Example
                 */
                throw new Exception("Only arrays with length 3 or lower are valid");
            }
        }

        /**
         * Exception catches for the try block
         */
        catch(Exception e) {
            System.out.println("Exception :: " + e.getMessage ());
        }

        /**
         * 4. Finally Example
         */
        finally {
            System.out.println("Finally block");
        }


        System.out.println("____________________________________");


        System.out.println("Array with an index out of bounds");
        /**
         * 1. Try Example
         */
        try{
            int[] arr3 = new int[3];
            arr3[4] = 4;
            if (arr3.length > 3) {
                /**
                 * 2. Throw Example
                 * 3. Created Exception Example
                 */
                throw new Exception("Only arrays with length 3 or lower are valid");
            }
        }

        /**
         * Exception catches for the try block
         */
        catch(Exception e) {
            System.out.println("Exception :: " + e.getMessage ());
        }

        /**
         * 4. Finally Example
         */
        finally {
            System.out.println("Finally block");
        }
    }
}
