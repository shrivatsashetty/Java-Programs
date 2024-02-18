
class GenericClass <T1, T2> {

    T1 instanceVariableOfTypeT1;
    T2 instanceVariableOfTypeT2;
  
    GenericClass(T1 objOfTypeT1, T2 objOfTypeT2){
      this.instanceVariableOfTypeT1 = objOfTypeT1;
      this.instanceVariableOfTypeT2 = objOfTypeT2;
    }
  
    public void showTypes(){
      System.out.println(instanceVariableOfTypeT1.getClass().getName());
      System.out.println(instanceVariableOfTypeT2.getClass().getName());
    }

    // to create a generic method just put an angular bracket before return type
    public <T> void printType(T objOfTypeT){
      System.out.println(objOfTypeT.getClass().getName());
    }

    // a generic method which can return something
    public <T> T returnSomeType(T t){
      return t; // returns the element of type T
    }

  
  }
  
public class GenericClassDemo {
    public static void main(String[] args) {
      GenericClass<String, Integer> genericObj1 = new GenericClass<>("Generic class 1", 7);
      GenericClass<Double, Boolean> genericObj2 = new GenericClass<>(22.5, false);
      genericObj1.showTypes();
      genericObj2.showTypes();

      System.out.println();

      genericObj1.printType(Float.parseFloat("1.222")); // java.lang.Float
      genericObj2.printType(Double.valueOf(3.14));  // java.lang.Float
      genericObj2.printType(Integer.valueOf(5)); // java.lang.Integer

    }
   
  }