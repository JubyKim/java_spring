public class DollarCalculator implements ICalculator{
    private int price = 1;

    private MarketAPI marketAPI;
    public DollarCalculator(MarketAPI marketAPI) {
        this.marketAPI = marketAPI;
    }

    public void init() {
        this.price = marketAPI.connnect();
    }

    @Override
    public int sum(int x, int y) {
        y *= price;
        x *= price;
        return x+y;
    }

    @Override
    public int minus(int x, int y) {
        y *= price;
        x *= price;
        return x-y;
    }
}
