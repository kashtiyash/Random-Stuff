public class RoseBouquet extends Bouquet
{
    String Name = "Rose Bouquet";
    @Override
    public double cost()
    {
        return 100;

    }

    @Override
    public String getDescription() {
        return Name;
    }
}
