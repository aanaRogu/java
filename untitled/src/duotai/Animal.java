package duotai;

public class Animal {
    private String name;
    private  int age;
    //封装方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //构造方法
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }
    void speak(){
        System.out.println("嘤嘤嘤");
    }
}

