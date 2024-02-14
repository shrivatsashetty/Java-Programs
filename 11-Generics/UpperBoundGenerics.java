
class GenericNumFuncs<T extends Number>{
    T t;
    
    public GenericNumFuncs(T t){
        this.t = t;
    }

    public float square(){
        return t.floatValue() * t.floatValue(); // extracts the numeric value from the types
    }
}

public class UpperBoundGenerics {
    
}
