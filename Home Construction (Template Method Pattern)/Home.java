public class Home extends ConstructBuilding
{
    @Override
    public void constructWindows() {
        System.out.println("Windows are of glass panes");
    }

    @Override
    public void addDoors() {
        System.out.println("Doors of wood are added.");
    }

    @Override
    public void constructWalls() {
        System.out.println("Walls of home are of single bricks.");
    }

    public void paintingAndInterior() {
        System.out.println("High Quality of Paint and Interior.");

    }
}
