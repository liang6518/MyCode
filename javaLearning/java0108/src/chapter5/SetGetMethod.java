package chapter5;

public class SetGetMethod {
    private String name;
    private String idNum;
    private int age;
    public void setName(String newName){
        name=newName;
    }
    public void setAge(int newAge){
        age=newAge;
    }
    public void setIdString(String newId){
        idNum=newId;
    }
    public String getName(){
        return name;
    }
    public String getIdNum(){
        return idNum;
    }
    public int getAge(){
        return age;
    }
}
