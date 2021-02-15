package robot.heads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
        price = 800;
    }

    @Override
    public void speek() {
        System.out.println("Добро пожаловать!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
