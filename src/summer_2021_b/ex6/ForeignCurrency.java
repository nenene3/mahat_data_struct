package summer_2021_b.ex6;

import data_Structs.Node;

public class ForeignCurrency {
    private String name;
    private Node<Double> rates;

    public ForeignCurrency(String name, Node<Double> rates) {
        this.name = name;
        this.rates = rates;
    }

    public Node<Double> getRates() {
        return rates;
    }

    public void addRate(double add) {
        this.rates = new Node<>(add, this.rates);
    }

    public boolean isPeek() {
        double current = this.rates.getValue();
        Node<Double> running = this.rates.getNext();
        while (running != null)
            if (running.getValue() >= current)
                return false;
            else
                running = running.getNext();

        return true;
    }
    public boolean isWorthInvesting(){
        if(this.isPeek())
            return false;

        Node<Double> running = this.rates.getNext();

        double head= this.rates.getValue();
        for(int i=0;i<4;i++){
            if(head<=running.getValue())
                return false;
        running=running.getNext();
        }

        return true;
    }

}
