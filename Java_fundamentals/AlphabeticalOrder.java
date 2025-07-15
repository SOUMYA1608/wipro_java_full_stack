public class AlphabeticalOrder {
    public static void main(String[] args) {
        char char1 = 's';
        char char2 = 'e';
        char temp = (char1 > char2) ? char1 : char2;
        char1 = (char1 > char2) ? char2 : char1;
        char2 = temp;

        System.out.println(char1 + "," + char2);
    }
}
