package summer_2023_a.ex10;

public class Deck {
    private Card[] arr;
    public Deck() {
        this.arr = new Card[36];
    }

    public void addCard(Card c) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == null) {
                arr[i] = c;
                return;
            }
    }
    public Card drawCard(){
        for(int i=arr.length-1;i>=0;i++){
            if(arr[i]!=null){
                Card ret = arr[i];
                arr[i]=null;
                return ret;
            }
        }
        return null;
    }
    public boolean exist(Card c){
        for(int i=0;i<arr.length;i++){
            if(arr[i].compare(c)==0)
                return true;
        }   
        return false;
    }

    public boolean isFull(char color){
        for(int i=1;i<=9;i++){
            if(!this.exist(new Card(color, i)))
                return false;
        }
        return true;
    }
}
