public class Test
{
    public static void main(String[] args) {
        ConstructBuilding home = new Home();
        System.out.println("\n---- Construction of Home : ---- \n");
        home.BuildBuilding();
        System.out.println("\n---- Construction of Shopping Mall : ---- \n");
        ConstructBuilding mall = new ShoppingMall();
        mall.BuildBuilding();

    }
}
