public class ifElse {
    public static void main(String[] args) {
        int btc = 75000;
        int eth = 2000;
        int xrp = 1000;

        float upBtc = 2000f/btc;
        float upEth = -500f/eth;
        float upXrp = -100f/xrp;

        System.out.println("Change in BTC: " + upBtc);
        System.out.println("Change in ETH: " + upEth);
        System.out.println("Change in XRP: " + upXrp);

        if(upBtc > upEth && upBtc > upXrp){
                System.out.println("BTC has the highest change percentage.");
        } else if (upEth > upBtc && upEth > upXrp) {
                System.out.println("ETH has the highest change percentage.");
        } else if (upXrp > upBtc && upXrp > upEth) {
                System.out.println("XRP has the highest change percentage.");
        } else {
                System.out.println("There is a tie in the change percentages.");
        }

        boolean isBtcHigher = btc > eth && btc > xrp;
        boolean isEthHigher = eth > btc && eth > xrp;
        boolean isXrpHigher = xrp > btc && xrp > eth;
        System.out.println("BTC the highest? " + isBtcHigher);
        System.out.println("ETH the highest? " + isEthHigher);
        System.out.println("XRP the highest? " + isXrpHigher);

        int AND = btc & eth;
        System.out.println("Bitwise AND of BTC and ETH: " + AND)
    }
}