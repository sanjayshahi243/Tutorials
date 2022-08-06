public class Repeater {
    public static void repeatString(String toRepeat, int times) {
        if (times <= 0) return;
        System.out.println(toRepeat);
        repeatString(toRepeat, times-1);
    }
    public static void main(String[] args) {
        repeatString("Hello World!", 3);
    }
}
