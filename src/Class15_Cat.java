class Class15_Cat {

    String name;
    Integer age;

    Class15_Cat() { }

    Class15_Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println(name + " sleeping....");
    }

    public String toString () {
        return "Name: " + name + " Age: " + age;
    }
}