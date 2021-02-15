package by.teachmeskills.robot.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
        price = 355;
    }

    @Override
    public void step() {
        System.out.println("Топ");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
