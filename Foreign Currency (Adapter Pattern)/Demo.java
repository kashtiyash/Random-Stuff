public class Demo
{
    public static void main(String[] args) {
        System.out.println("\nInitial Value");
        IndianCurrency rs = new IndianRupee(20);
        convert(rs);

        System.out.println("\nAmerican Dollar Value ");
        ForeignCurrency fs = new AmericanDollar(20);
        fs.Dollar();

        System.out.println("\nChanged Dollar to Inr");
        AmericanDollar d = new AmericanDollar(20);
        IndianCurrency inr = new ForeignAdapter(d);
        convert(inr);
    }
    public static void convert(IndianCurrency r)
    {
        r.Rupee();
    }
}
