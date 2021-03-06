package spring02;

/**
 * 学生
 */
public class Student extends Person {
    /**身高*/
    public int height;
    /**有参构造方法*/
    public Student(String name,int height){
        this.name = name;
        this.height =height;
    }
    /**有参构造方法*/
    public Student(String name,int height,Address address){
        this.name = name;
        this.height =height;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "height=" + height +
                ", name='" + name + '\'' +
                '}'+","+address;
    }

    private void init() {
        System.out.println("对象被创建");
    }

    private void over() {
        System.out.println("对象被回收");
    }
}
