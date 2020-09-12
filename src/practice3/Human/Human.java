package practice3.Human;

public class Human {
    private Head head;
    private Leg leg;
    private Hand hand;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Human(Head g, Leg n, Hand r){
        this.head = g;
        this.leg = n;
        this.hand = r;
    }

    public String toString(){
        return "Head: " + this.head + "; Leg: " + this.leg + "; Hand: " + this.hand ;
    }

    public static void main(String[] args) {
        Head head = new Head("black", 20);
        Leg leg = new Leg("black", 80);
        Hand hand = new Hand(5,60);
        Human human = new Human(head, leg, hand);
        System.out.println(human);
    }

}
