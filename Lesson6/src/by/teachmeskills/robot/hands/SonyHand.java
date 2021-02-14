package by.teachmeskills.robot.hands;

public class SonyHand implements IHand{
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
        price = 750;
    }

    @Override
    public void upHand() {
        System.out.println("Вертит руками");
    }

    @Override
    public int getPrice() {
        return price;
    }

}
