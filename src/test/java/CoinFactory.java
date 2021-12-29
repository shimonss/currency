public class CoinFactory {
    public static Coins getCoinInstance(Coins coin) {
        Coins coin1 = coin;
        switch (coin1) {
            case USD:
                USD usd = new USD();
                break;
            case ILS:
                ILS ils = new ILS();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + coin1);
        }
        return coin1;
    }
}





