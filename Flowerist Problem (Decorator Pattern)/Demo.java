public class Demo
{
    public static void main(String[] args) {
        Bouquet bq = new OrchidBouquet();
        System.out.println(bq.getDescription());
        System.out.println(bq.cost());
        System.out.println();

        Bouquet bq2 = new RoseBouquet();
        System.out.println(bq2.getDescription());
        System.out.println(bq2.cost());
        System.out.println();

        Bouquet bq3 = new SunflowerBouquet();
        System.out.println(bq3.getDescription());
        System.out.println(bq3.cost());
        System.out.println();

        DecorationDecorator b = new Glitters(bq);
        DecorationDecorator b1 = new PaperWrapping(b);
        DecorationDecorator b2 = new Ribbons(b1);
        System.out.println(b2.getDescription());
        System.out.println(b2.cost());
        System.out.println();

        DecorationDecorator bb1 = new PaperWrapping(bq2);
        DecorationDecorator bb2 = new Ribbons(bb1);
        DecorationDecorator bb3 = new Glitters(bb2);
        System.out.println(bb3.getDescription());
        System.out.println(bb3.cost());
        System.out.println();

        DecorationDecorator flowers = new PaperWrapping(bq3);
        DecorationDecorator flowers2 = new Ribbons(flowers);
        System.out.println(flowers2.getDescription());
        System.out.println(flowers2.cost());
        System.out.println();

    }
}
