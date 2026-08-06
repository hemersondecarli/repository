package Employee;

public class Employee{
    private int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    private String name;
    private String department;

    public class Employee(int id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public showInfo(){
        System.out.println("ID: "+id+"- Name: "+name + "- Department: "+department);
    }


}