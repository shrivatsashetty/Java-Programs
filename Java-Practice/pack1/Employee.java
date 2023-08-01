
class Employee{
    public String name;
    public String phoneNo;
    public String email;
    
    public void register(String employeeName){
        this.name = employeeName;
        return ;
    }

    public void modify(String newName){
        this.name = newName;
    }

}
