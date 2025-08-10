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

    public static void professionalBasketBallArr(Fish[] fish) {
        int counter = 0;
        int index = 0;
        for (Fish f : fish) {
            if(f instanceof ProfessionalBasketBallPlayer) {
                counter++;
            }
            ProfessionalBasketBallPlayer[] basketBallPlayers = new ProfessionalBasketBallPlayer[counter];
            for (Fish fp : fish) {
                if(fp instanceof ProfessionalBasketBallPlayer) {
                    basketBallPlayers[index] = (ProfessionalBasketBallPlayer)fp;
                    index++;
                }
                professionalBasketBall(basketBallPlayers);
            }
        }

    }
}
