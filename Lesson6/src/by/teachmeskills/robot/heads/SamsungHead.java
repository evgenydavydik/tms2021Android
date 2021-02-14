package by.teachmeskills.robot.heads;

public class SamsungHead implements IHead{
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
        price = 1000;
    }

    @Override
    public void speek() {
        System.out.println("Добрый день ваше высочество!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
