package methods;

class Test {
    public String name;
    public int id;

    public Test setName(String name) {
        this.name = name;
        return this; // returning current object
    }

    public Test(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Test display(){
        System.out.println("Id : " + id);
        return this;
    }

    public Test printName() {
        System.out.println("Name: " + name);
        return this;
    }
}

public class MethodChaining {
    public static void main(String[] args) {
        Test s = new Test(101, "Nikhil");
        s.setName("Nitin").display().printName();  // method chaining
    }
}