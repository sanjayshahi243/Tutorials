// package SampleTest;

public class Q3 {
    static char[] customArr(char[] arr, int start, int len)  {
        if (arr.length < len || start > arr.length) return null;

        char [] newarr = new char [len];
        for (int i=0; i < len; i++) {
            newarr[i] = arr[start+i];
        }
        return newarr;
    }

    public static void main (String[] args) {
        char[] res = customArr(new char[] {'a', 'b', 'c'}, 0, 4);        
    }
}
