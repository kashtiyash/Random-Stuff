public class IndianRupee implements IndianCurrency
{
    int r;
    IndianRupee(int r)
    {
        this.r = r;
    }
    @Override
    public void Rupee() {
        System.out.println("Value of Rupee : "+ r );
    }
}
