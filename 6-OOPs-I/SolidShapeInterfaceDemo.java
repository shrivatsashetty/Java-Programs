/* a java program to show what reference of parent interface and creation of child class can do */

interface Cone{
    public float clacSurfaceArea(float baseRadius, float coneHeight);
    public float clalcVolume();
}

class  ConcreteCone implements Cone{
    @Override
    public float clacSurfaceArea(float baseRadius, float coneHeight){
        return 1.1f;
    }

    public float clalcVolume(){
        return 1.1f;
    }
}

public class SolidShapeInterfaceDemo {
    
}
