package by.teachmeskills.robot.legs;

public class ToshibaLeg implements ILeg{
    private int price = 140;;

    public ToshibaLeg() {
    }

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {

    }

    @Override
    public int getPrice() {
        return price;
    }
}
