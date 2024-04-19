public class Puppy {

    private int age;
    private String name;

    public Puppy(){
        age = 2;
        name = "Truffle";
    }

    public void grow(){
        age = age + 1;
    }

    public void small(){
        if(age>0) {
            age = age - 1;
        }
    }
}
