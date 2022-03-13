public class ForeignAdapter implements IndianCurrency
{
    ForeignCurrency fr;
    ForeignAdapter(ForeignCurrency fr)
    {
        this.fr = fr;
    }

    @Override
    public void Rupee()
    {
        int result = fr.Dollar();
        int finalAns = result*70;
        System.out.println("Value of rupee : " + finalAns);
    }
}
