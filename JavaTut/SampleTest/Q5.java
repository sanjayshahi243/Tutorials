/*
Write a function to return an array containing all elements common to two given arrays containing distinct positive integers. 
You should not use any inbuilt methods. You are allowed to use any number of arrays.
The signature of the function is:
int[] f(int[] first, int[] second)
{1, 8, 3, 2}, {4, 2, 6, 1}	=> {1,2}
{1, 8, 3, 2}, {4, 2, 6, 1}	=> {2,6,1}
{1, 2}, {3, 4} => {}
{}, {1, 2, 3} => {}
{}, {1, 2, 3} => null
*/

public class Q5 {
    static int[] distinction(int[] first, int[] second) {
        if (first == null || second == null)
            return null;

        int output_length = (first.length > second.length) ? first.length : second.length;
        int[] common = new int[output_length] ;
        
        output_length = 0;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    common[output_length] = second[j];
                    output_length++;
                    break;
                }
            }
        }
        int[] output = new int[output_length];
        for (int i=0; i<output_length; i++) {
            output[i] = common[i];
        }
        return output;
    }

    public static void main(String[] args) {
        int res[] = distinction(new int[] { 1, 8, 3, 2 }, new int[] { });
        for (int elem : res) {
            System.out.println(elem);
        }
    }
}
