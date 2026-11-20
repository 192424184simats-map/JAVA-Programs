package Task03;
import java.util.*;
public class StudentHashSetDemo {
 static final class Student{final String regNo;final String name;Student(String r,String n){regNo=r;name=n;}public boolean equals(Object o){return o instanceof Student&&regNo.equals(((Student)o).regNo);}public int hashCode(){return Objects.hash(regNo);}}
 static class MutableStudent{String id;MutableStudent(String id){this.id=id;}public boolean equals(Object o){return o instanceof MutableStudent&&id.equals(((MutableStudent)o).id);}public int hashCode(){return Objects.hash(id);}}
 public static void main(String[]a){Set<Student>s=new HashSet<>();s.add(new Student("1924","Arun"));s.add(new Student("1924","Duplicate"));s.add(new Student("1925","Bala"));System.out.println("Unique students (expected 2): "+s.size());MutableStudent m=new MutableStudent("M1");Set<MutableStudent>x=new HashSet<>();x.add(m);System.out.println("Before changing key: "+x.contains(m));m.id="M2";System.out.println("After changing key (may be false): "+x.contains(m));System.out.println("Set size: "+x.size());}
}