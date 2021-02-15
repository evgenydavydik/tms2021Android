package robot.legs;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
        price = 550;
    }

    @Override
    public void step() {
        System.out.println("Делает шаг прихрамывая");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
