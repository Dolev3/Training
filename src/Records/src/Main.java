public class Main {
    public static void main(String[] args) {
        ex6();
    }

    public static void ex6() {
        Student s1 = new Student("Yahli", 3);
        System.out.println(s1.toString());
        if (s1.isHighSchool()) {
            System.out.println("The student is highschool");
        } else System.out.println("The student is not highschool");
    }

    public static Classroom[] sorter(Student[] students) {
        int[] grade = new int[students.length];
        int[] classNum = new int[students.length];
        boolean isClassInArr = false;
        int classCounter = 0;

        for (int i = 0; i < students.length; i++) {
            if (isClassInArr) {
                grade[classCounter] = students[i].grade();
                classNum[classCounter] = students[i].classNum();
                classCounter++;
            }
            for (int j = 0; j < students.length; j++) {
                if (grade[j] == students[i].grade() && classNum[j] == students[i].classNum()) {
                    isClassInArr = false;
                } else {
                    isClassInArr = true;
                }
            }
        }

        Classroom[] sorted = new Classroom[classCounter];
        int classCount = 0;
        int howManyClasses = 0;
        boolean isInThisClass = false;
        Student[] studentsIntoClass = new Student[students.length];

        for (int i = 0; i < sorted.length; i++) {
            Student[] studentsGoingIn = new Student[classCount];
            for (int j = 0; j < studentsGoingIn.length; j++) {
                studentsGoingIn[j] = studentsIntoClass[j];
            }
            sorted[howManyClasses] = new Classroom(grade[i], studentsGoingIn, classNum[i]);

            for (int j = 0; i < students.length; i++) {
                int intoClassCounter = 0;

                if (isInThisClass) {
                    studentsIntoClass[classCount] = students[i];
                    classCount++;
                }

                for (int k = 0; k < students.length; k++) {
                    if (grade[k] == students[j].grade() && classNum[k] == students[j].classNum()) {
                        isInThisClass = true;
                        intoClassCounter++;
                    }
                }
            }
            howManyClasses++;
        }

            return sorted;
    }
}