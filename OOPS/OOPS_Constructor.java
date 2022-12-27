public class OOPS_Constructor {
    public static void main(String args[]){
        Student s1 = new Student();
        // Student s2 = new Student("vishal");
        // Student s3 = new Student(1234);
        // System.out.println(s1.name);
        // System.out.println(s2.name);
        // System.out.println(s3.roll);
        s1.name ="vishal";
        s1.roll =234;
        s1.password ="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2 = new Student(s1);//copy
        s2.password = "xyz";
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
}


class Student {
    String name;
    int roll;
    String password;
    int marks[];
    //(SHALLOW) COPY CONSTRUCTOR
    // Student(Student s1){
        // marks = new int[3];
        // this.name = s1.name;
        // this.roll = s1.roll;
        // this.marks = s1.marks;
    // }
    //(DEEP) COPY CONSTRUCTOR
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }
    // NON -PARAMETERIZED CONSTRUCTOR
    Student(){
        marks = new int[3];
        System.out.println("Constructor is called....");

    }
    //PARAMETERIZED CONSTRUCTOR
    Student(String name){
        marks = new int[3];
        // System.out.println();
        this.name = name;    

    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;

    }
}
