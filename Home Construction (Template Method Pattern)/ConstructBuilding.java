public abstract class  ConstructBuilding
{
public void constructBaseFoundation()
        {
        System.out.println("Constructing Base ");
        }
public abstract void constructWalls();
public abstract void constructWindows();
public abstract void addDoors();
public abstract void paintingAndInterior();

public void constructRoof()
        {
        System.out.println("Construct Roof");
        }

final void BuildBuilding()
        {
        constructBaseFoundation();
        constructWalls();
        constructRoof();
        constructWindows();
        addDoors();
        paintingAndInterior();

        }
}