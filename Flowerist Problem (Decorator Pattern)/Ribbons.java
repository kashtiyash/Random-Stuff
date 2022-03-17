public class Ribbons extends DecorationDecorator
{
        Bouquet b;
        public Ribbons(Bouquet b)
        {
            this.b = b;
        }
        @Override
        public String getDescription() {
            return b.getDescription() + " with  Ribbons ";
        }

        @Override
        public double cost() {
            return b.cost() + 70;
        }
}


