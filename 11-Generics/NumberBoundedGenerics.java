
class GenericNumFuncs<T extends Number>{
    T t; // Type T can only be a child of Integer, Float, Double  
    
    public GenericNumFuncs(T t){
        this.t = t;
    }

    public float square(){
        return t.floatValue() * t.floatValue(); // extracts the numeric value from the wrapper class objects
    }
}

public class NumberBoundedGenerics {
    public static void main(String[] args) {
        GenericNumFuncs<Double> genNumsObj = new GenericNumFuncs<>(2.1);
        System.out.println( genNumsObj.square());
    }
}
