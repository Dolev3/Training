 public record Student(String name, int Class, int ClassNum) {
    public String toString() {
        return name+" is a student in the "+ Class+ "th grade and class number "+ClassNum;
    }
    public boolean isHighschool(int Class) {
        if (Class >= 10)
            return true;
        else
            return false;
    }
 }
