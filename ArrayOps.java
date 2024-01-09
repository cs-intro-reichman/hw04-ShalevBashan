public class ArrayOps {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        // for (int i = 0; i < b.length; i++) {
        //     b[i] = Integer.parseInt(args[i+a.length]);
        // }
        
        // System.out.println (findMissingInt(a));
        System.out.println (secondMaxValue(a));
        // System.out.println (containsTheSameElements(a, b));
        // System.out.println (isSorted(a));
    }
    
    public static int findMissingInt (int [] array) {
        int missing = 0;
        boolean foundM =  false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + 1 == array[j]) {
                    break;
                }
                if (j == array.length - 1) {
                    missing = array[i] + 1;
                    foundM = true;
                }
            }
            if (foundM) break;
        }
        return missing;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int max2 = Math.min (array[0], array [1]);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                max = Math.max(max, Math.max(array[i], array[j]));
                if (array[j] < max) {
                    max2 = Math.max(max2, array[j]);
                }
            }
            // if (max2 == max) {
            //     max2 = Math.min(max2, array[i]);
            // }
        }
        return max2;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean isThere = false;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    isThere = true;
                }
            }
            if (!isThere) return false;
            isThere = false;
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        int dir = 0; //is 0 if array is going down or 1 if array is going up and 2 if a started with equal numbers
        for (int i = 0; i < array.length - 1; i++) {
            if ((i == 0 || dir == 2) && array[i] > array[i+1]) {
                dir = 0;
            } else if ((i == 0 || dir == 2) && array[i] < array[i+1]) {
                dir = 1;
            } else if (i == 0 || dir == 2) {
                dir = 2;
            }
            if (array[i] > array[i+1] && dir == 1) {
                return false;
            } else if (array[i] < array[i+1] && dir == 0) {
                return false;
            }
        }
        return true;
    }

}
