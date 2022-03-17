public class PaperWrapping extends DecorationDecorator
{
    Bouquet b;
    public PaperWrapping(Bouquet b)
    {
        this.b = b;
    }
    @Override
    public String getDescription() {
        return b.getDescription() + " with Paper Wrapping";
    }

    @Override
    public double cost() {
        return b.cost() + 50;
    }
}
