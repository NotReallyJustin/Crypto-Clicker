package classes.coin;

/**
 * Buy this at dank memer store for $1 Million lmao
 * This crytocurrency is very hard to mine, but it is worth a LOT of money.
 * @author Justin
 * @since 4/12/21
 * @category classes.coin
 */
public class Pepecoin extends Coin
{
    /**
     * Constructs a pepecoin
     */
    public Pepecoin()
    {
        super("Pepecoin", 1000, 1, "images/Pepecoin.png", 1000000);
    }

    /**
     * Overrides the click from Coin.java
     * You only have a 10% chance of mining pepeCoins.
     */
    public double click()
    {
        if ((int)(Math.random() * 10) == 0)
        {
            return super.click();
        }

        return 0;
    }
}
