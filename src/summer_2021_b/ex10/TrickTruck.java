package summer_2021_b.ex10;

import data_Structs.Node;

public class TrickTruck {
    private Node<String> drivers;
    private Node<Integer> cars;
    private Node<Payment>[] payments;

    public TrickTruck(Node<String> drivers, Node<Integer> cars, Node<Payment>[] payments) {
        this.drivers = drivers;
        this.cars = cars;
        this.payments = payments;
    }

    public Node<String> getDrivers() {
        return drivers;
    }

    public void setDrivers(Node<String> drivers) {
        this.drivers = drivers;
    }

    public Node<Integer> getCars() {
        return cars;
    }

    public void setCars(Node<Integer> cars) {
        this.cars = cars;
    }

    public Node<Payment>[] getPayments() {
        return payments;
    }

    public void setPayments(Node<Payment>[] payments) {
        this.payments = payments;
    }

    public boolean existDriver(String name) {
        Node<String> current = this.drivers;
        while (current != null) {
            if (name.equals(current.getValue()))
                break;
            current = current.getNext();
        }
        if (current == null)
            return false;

        for (int i = 0; i < 30; i++) {
            Node<Payment> paymentNode = this.payments[i];
            while (paymentNode != null) {
                if (paymentNode.getValue().getName().equals(name))
                    return true;
                paymentNode = paymentNode.getNext();
            }
        }
        return false;
    }

    public boolean existCar(int num) {
        Node<Integer> current = this.cars;
        while (current != null) {
            if (num == current.getValue())
                break;
            current = current.getNext();
        }
        if (current == null)
            return false;

        for (int i = 0; i < 30; i++) {
            Node<Payment> paymentNode = this.payments[i];
            while (paymentNode != null) {
                if (paymentNode.getValue().getNum() == num)
                    return true;
                paymentNode = paymentNode.getNext();
            }
        }

        return false;
    }

    public boolean worked(String name, int day) {
        if (day < 1 || day > 30)
            return false;

        Node<Payment> current = this.payments[day - 1];
        while (current != null) {
            if (current.getValue().getName().equals(name))
                return true;
            current = current.getNext();
        }

        return false;
    }
    public boolean addPayment(int num,String name,int day,int fuel){
        if(day<1 || day>30)
            return false;
        if(num<0)
            return false;
        if(name==null || name.isEmpty())
            return false;

        Node<Payment> current = this.payments[day-1];
        while(current.hasNext())
            current=current.getNext();
        current.setNext(new Node<>(new Payment(name,num,fuel)));

        return true;
    }

    public double totalFuel(int num){
        if(!this.existCar(num))
            return 0;

        double counter=0;
        for(int i=0;i<30;i++){
            Node<Payment> current = this.payments[i];
            while(current!=null){
                if(current.getValue().getNum()==num)
                    counter+=current.getValue().getFuel();
                current=current.getNext();
            }
        }

        return counter;
    }
    public void printWorkDay(){
        Node<String> drivers= this.drivers;
        while(drivers!=null){
            int counter=0;
            for(int i=1;i<=30;i++)
                if(this.worked(drivers.getValue(), i))
                    counter++;
            System.out.println(drivers.getValue()+"   "+counter);
            drivers=drivers.getNext();
        }
    }


}
