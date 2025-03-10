package inheritance;

public class HRManager extends Employee {

    @Override
    public String work(){
        super.work();
        return "HR Work";
    }
    public void addEmployee(){
    }

}
