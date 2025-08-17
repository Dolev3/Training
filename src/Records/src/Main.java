public class Main {
    public static void main(String[] args) {
        ex6();
    }
    public static void ex6() {
        Student s1 = new Student("Yahli", 3);
        System.out.println(s1.toString());
        if (s1.isHighSchool()) {
            System.out.println("The student is highschool");
    }
        else System.out.println("The student is not highschool");
    }
}