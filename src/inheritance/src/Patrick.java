public class Patrick  extends Fish implements ProfessionalBasketBallPlayer{

    public Patrick(String name, int age, String favoriteFood) {
        super("Patrick",age,favoriteFood);
    }

    @Override
    public void goToWork() {
        walkByFoot();
    }

    @Override
    public void playBasketBall() {
        System.out.println("Ohh an orange ball lets eat it");
    }

}
