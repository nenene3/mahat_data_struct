package summer_2023_a.ex10;

public class Card {
    private char color;
    private int digit;

    public Card(char c, int d) {
        this.color = c;
        this.digit = d;
    }

    public int compare(Card other) {
        if (this.digit != other.digit)
            return this.digit > other.digit ? -1 : 1;

        char[] arr = new char[] { 'R', 'G', 'B', 'Y' };
        int first = -1;
        int sec = -1;
        for (int i = 0; i < arr.length; i++) {
            if (this.color == arr[i])
                first = i;
            if (other.color == arr[i])
                sec = i;
        }
        if (first == sec)
            return 0;
        
        return first > sec ? -1 : 1;
    }
}
