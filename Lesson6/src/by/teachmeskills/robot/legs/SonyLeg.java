package by.teachmeskills.robot.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
        price = 800;
    }

    @Override
    public void step() {
        System.out.println("Выполняет покачивающий шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
