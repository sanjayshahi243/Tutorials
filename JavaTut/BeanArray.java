/*
An array is defined to be a Bean array if it meets the following conditions
   a. If it contains a 9 then it also contains a 13.
   b. If it contains a 7 then it does not contain a 16.

So {1, 2, 3, 9, 6, 13}  and {3, 4, 6, 7, 13, 15}, {1, 2, 3, 4, 10, 11, 12} and {3, 6, 9, 5, 7, 13, 6, 17} are Bean arrays. 
The following arrays are not Bean arrays:
   a. { 9, 6, 18} (contains a 9 but no 13)
   b. {4, 7, 16} (contains both a 7 and a 16)

Write a function named isBean that returns 1 if its array argument is a Bean array, otherwise it returns 0.

If you are programming in Java or C#, the function signature is
   int isBean (int[ ] a)
*/


public class BeanArray {
    static boolean checkNumberExist (int[] arr, int n) {
        boolean exist = false;
        for (int elem: arr) {
            if (elem == n) {
                exist = true; 
                break;
            }
        }
        return exist;
    }
    int isBean (int[ ] arr) {
        int isBean = 1;
        int c1 = -1, c2 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9 && c1 == -1) {
                boolean check = checkNumberExist(arr, 13);
                if (check) {
                    c1 = 0;
                    break;
                }
                else return 0;
            }
            
            if (arr[i] == 7 && c2 == -1) {
                boolean check = checkNumberExist(arr, 16);
                if (check) return 0;
                else {
                    c2 = 0;
                    break;
                }
            } 
        }
        return isBean;
    }

    public static void main(String[] args) {
        BeanArray obj = new BeanArray();
        System.out.println("{1, 2, 3, 13,  9, 6}: " + obj.isBean(new int[] {1, 2, 3, 13, 9, 6}));
        System.out.println("{3, 4, 6, 7, 13, 15}: " + obj.isBean(new int[] {3, 4, 6, 7, 13, 15}));
        System.out.println("{3, 6, 9, 5, 7, 13, 6, 17}: " + obj.isBean(new int[] {3, 6, 9, 5, 7, 13, 6, 17}));
        System.out.println("{ 9, 6, 18}: " + obj.isBean(new int[] { 9, 6, 18}));
        System.out.println("{4, 7, 16}: " + obj.isBean(new int[] {4, 7, 16}));
    }
}
