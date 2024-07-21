package summer_2023_a.ex10;

public class Main {

    public static void main(String[] args) {
        
    }
    public static void game(Deck d){
        Deck player1 = new Deck();
        Deck player2 = new Deck();
        char[] chars = new char[]{'r','g','b','y'};
        while(true){
            Card c1 = d.drawCard();
            Card c2 = d.drawCard();
            if(c1==null || c2==null)
                break;
            int check = c1.compare(c2);
            if(check ==-1){
                player1.addCard(c1);
                player1.addCard(c2);
            }else{
                player2.addCard(c1);
                player2.addCard(c2);
            }

            for(int i=0;i<4;i++){
                if(player1.isFull(chars[i])){
                    System.out.println("משתמש אחד ניצח");
                }
                if(player2.isFull(chars[i])){
                    System.out.println("משתמש שני ניצח");
                }
            }
        }

        System.out.println("תיקו");
    }
    
}


