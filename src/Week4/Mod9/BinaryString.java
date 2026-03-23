package Week4.Mod9;

public class BinaryString {
    static void generate(int n, String current) {
        if (current.length() == n) {
            System.out.println(current);
            return;
        }
        generate(n, current + "0");
        generate(n, current + "1");
    }

    public static void main(String[] args) {
        generate(4, "");
    }
}