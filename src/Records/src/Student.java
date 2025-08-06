 public record Student(String name, int grade, int classNum) {
    public String toString() {
        return name+" is a student in the "+ grade+ "th grade and class number "+classNum;
    }
    private static final int DEFAULT_GRADE = 9;
    public Student(String name, int classNum) {
        this(name,DEFAULT_GRADE,classNum);
    }
    public boolean isHighSchool(int grade) {
        if (grade >= 10)
            return true;
        else
            return false;
    }
 }
