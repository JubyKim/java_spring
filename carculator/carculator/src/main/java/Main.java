public class Main {

    public static void main(String[] args) {
        System.out.println("hello junit");

        MarketAPI marketAPI = new MarketAPI();
        DollarCalculator dollarCalculator = new DollarCalculator(marketAPI);
        dollarCalculator.init();
        Calculator calculator = new Calculator(new KrwCalculator());

        System.out.println(calculator.sum(10,10));
        System.out.println(dollarCalculator.sum(10,10));

    }
}
