package src.排序;

import java.util.Arrays;

class Student implements Comparable<Student>{
    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{"+
            "name"+name+'\''+",age="+age+",score="+score+
        '}';
    }

    @Override
    public int compareTo(Student o) {
        //根据年龄进行比较
       // return this.age-o.age;
        //根据分数进行比较
        return (int)(this.score-o.score);
        //根据姓名进行排序
    }
}

public class TestDemo {
    //自己实现排序           传的数据类型，肯定是实现了Compareble接口的
    public static void sort(Comparable[] comparable){
        //冒泡法
        for(int i=0;i<comparable.length;i++){
            for(int j=0;j<comparable.length-1-i;j++){
                if(comparable[j].compareTo(comparable[j+1])>0){
                    Comparable tmp=comparable[j+1];
                    comparable[j+1]=comparable[j];
                    comparable[j]=tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("wangrui", 15, 99.0);
        students[1] = new Student("zhangsan", 22, 78.9);
        students[2] = new Student("caocao", 35, 22.8);
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
