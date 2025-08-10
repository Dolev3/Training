public class CookSpongebob extends Spongebob{

    private int age;
    private String favoriteFood;

    public CookSpongebob(int age,  String favoriteFood) {
        super("Cook Spongebob",age,favoriteFood);
        super.playBasketBall();
    }

    @Override
    public void playBasketBall() {
        System.out.println("Why would I play basketball, Cooking is better");
    }
}
