 public record Student(String name, int grade, int classNum) {
    public String toString() {
        return name+" is a student in the "+ grade+ "th grade and class number "+classNum;
    }
    private static final int DEFAULT_GRADE = 9;
    private static final int IS_IN_HIGHSCHOOL = 10;


    public Student(String name, int classNum) {
        this(name,DEFAULT_GRADE,classNum);
    }

    public boolean isHighSchool() {
        return (this.grade >= IS_IN_HIGHSCHOOL);
    }
 }
