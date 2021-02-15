package robot.hands;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
        price = 300;
    }

    @Override
    public void upHand() {
        System.out.println("Машет руками!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
