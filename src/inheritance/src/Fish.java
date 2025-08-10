public abstract class Fish {

    private String name;
    private int age;
    private String favoriteFood;

    public Fish (String name, int age, String favoriteFood) {
        this.name = name;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void takeTheCar() {
        System.out.println("Taking car");
    }
    public void takeTheTrain() {
        System.out.println("Taking train");
    }
    public void walkByFoot() {
        System.out.println("Walking by foot");
    }

    public abstract void goToWork();

}
