public class SunflowerBouquet extends Bouquet
{
    String Name= "Sunflower Bouquet";

    @Override
    public String getDescription() {
        return Name;
    }

    @Override
    public double cost() {
        return 200;
    }
}
