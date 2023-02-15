public class Employee extends Person{
    private long id;

    public Employee(String name, char gender, long id) {
        super(name, gender);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public void work() {
        if(id==0){
            System.out.println("don't work");
        } else if(id==1) {
            System.out.println("work");
        }
    }
}
