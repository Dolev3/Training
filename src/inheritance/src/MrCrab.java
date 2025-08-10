public class MrCrab extends Fish{

    public MrCrab(String name, int age, String favoriteFood) {
        super("Mr Crab",age,favoriteFood);
        }

        @Override
        public void goToWork(){
        takeTheTrain();
    }
}
