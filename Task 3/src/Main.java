import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

//Laver 2 arraylister med kursuser for at den ene kan betså og den anden fejle
        ArrayList<String> passedCourses1 = new ArrayList<>();
        passedCourses1.add("c++");

        ArrayList<String> passedCourses2 = new ArrayList<>();
        passedCourses2.add("AI Prompting");

        ArrayList<String> canTeachCourses1 = new ArrayList<>();
        canTeachCourses1.add("c++");


        ArrayList<String> canTeachCourses2 = new ArrayList<>();
        canTeachCourses2.add("AI Prompting");
        canTeachCourses2.add("java 1.0");


        Student student1 = new Student("line", passedCourses1);
        Student student2 = new Student("emil", passedCourses2);

        Teacher teacher1 = new Teacher("Tess", canTeachCourses2);
        Teacher teacher2 = new Teacher("Jesper", canTeachCourses1);

        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);

        String course = "java 1.0";
        for(Person p: persons){
            if(!p.addCourse(course)){
                if (p instanceof Student){
                    System.out.println(p.getName()+ " har allerede bestået dette kursus");
                }else if(p instanceof Teacher){
                    System.out.println(p.getName()+ " kan ikke undervise i dette fag");
                }

            }
        }


    }
}