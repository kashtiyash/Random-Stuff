public class AmericanDollar implements ForeignCurrency
{
    int d;
    AmericanDollar(int d)
    {
        this.d=d;
    }
    @Override
    public int Dollar() {
        System.out.println("Value of Dollar : " + d);
        return d;
    }
}
