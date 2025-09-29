package oops;

public class Emp {
    private  String name;
    private  int id;
    public void setData(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void showData(){
        System.out.println("name: "+this.name+"\t"+"id: "+this.id);
    }
}
