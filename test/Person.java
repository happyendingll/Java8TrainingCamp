import lombok.Data;

@Data
public class Person implements Comparable<Person> {
    String name;
    Integer age;
    Double salary;
    Status status;


    public Person(String name, Integer age, Double salary, Status status) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.status = status;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (this.getAge().equals(o.getAge())){
            return this.getName().compareTo(o.getName());
        }else {
            return this.getAge().compareTo(o.getAge());
        }
    }


    public enum Status{
        Free,
        Busy
    }
}
