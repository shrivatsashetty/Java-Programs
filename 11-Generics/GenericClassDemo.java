
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
  
  }
  
  public class GenericClassDemo {
    public static void main(String[] args) {
      GenericClass<String, Integer> genObj1 = new GenericClass<>("Generic class 1", 1);
      GenericClass<Double, Boolean> genObj2 = new GenericClass<>(22.5, false);
      genObj1.showTypes();
      genObj2.showTypes();

    }
   
  }