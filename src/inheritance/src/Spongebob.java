public class Spongebob extends Fish implements ProfessionalBasketBallPlayer{

    public Spongebob(String name, int age, String favoriteFood) {
        super("Spongebob",age, favoriteFood);
    }

    @Override
    public void goToWork() {
        takeTheCar();
    }

    @Override
    public void playBasketBall() {
        System.out.println("Ohh a cool orange ball and it is bouncy");
    }
}
