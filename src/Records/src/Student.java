 public record Student(String name, int Class, int ClassNum) {
    public String toString() {
        return name+" is a student in the "+ Class+ "th grade and class number "+ClassNum;
    }

 }
