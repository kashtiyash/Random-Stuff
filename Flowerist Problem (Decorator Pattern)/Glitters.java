public class Glitters  extends DecorationDecorator
{
    Bouquet b;
    public Glitters(Bouquet b)
    {
        this.b = b;
    }
    @Override
    public String getDescription() {
        return b.getDescription() + " with Glitters ";
    }

    @Override
    public double cost() {
        return b.cost() + 100;
    }
}
