
class GenericClass <T1, T2> {

    T1 instanceVarType1;
    T2 instanceVarType2;
  
    GenericClass(T1 instanceVarType1, T2 instanceVarTYpe2){
      this.instanceVarType1 = instanceVarType1;
      this.instanceVarType2 = instanceVarTYpe2;
    }
  
    public void showTypes(){
      System.out.println(instanceVarType1.getClass().getName());
      System.out.println(instanceVarType2.getClass().getName());
    }

    // to create a generic method just put an angular bracket before return type
    public <T> void printType(T objOfTypeT){
      System.out.println(objOfTypeT.getClass().getName());
    }

    // a generic method which can return something
    public <T> T returnSomeType(T t){
      return t;
    }

  
  }
  
  public class GenericClassDemo {
    public static void main(String[] args) {
      GenericClass<String, Integer> genObj1 = new GenericClass<>("Generic class 1", 1);
      GenericClass<Double, Boolean> genObj2 = new GenericClass<>(22.5, false);
      genObj1.showTypes();
      genObj2.showTypes();

      System.out.println();

      genObj1.printType(Float.parseFloat("1.222")); // java.lang.Float
      genObj2.printType(Double.valueOf(3.14));  // java.lang.Float
      genObj2.printType(Integer.valueOf(5)); // java.lang.Integer

    }
   
  }