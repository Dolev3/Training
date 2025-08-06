 public record Student(String name, int grade, int classNum) {
    public String toString() {
        return name+" is a student in the "+ grade+ "th grade and class number "+classNum;
    }

    public Student(String name, int classNum) {
        this(name,9,classNum);
    }
    public boolean isHighSchool(int grade) {
        if (grade >= 10)
            return true;
        else
            return false;
    }
 }
