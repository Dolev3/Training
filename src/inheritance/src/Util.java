public class Util {

    public static void professionalBasketBall(ProfessionalBasketBallPlayer[] basketBallPlayers) {
        for (ProfessionalBasketBallPlayer p : basketBallPlayers) {
            if(p instanceof Fish basketBallFish) {
                basketBallFish.goToWork();
                p.playBasketBall();
            }
            else {
                p.playBasketBall();
            }
        }
    }
}
