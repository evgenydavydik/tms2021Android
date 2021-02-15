package robot.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
        price = 500;
    } //


    @Override
    public void upHand() {
        System.out.println("Разводит руки в стороны");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
