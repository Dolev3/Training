public enum Supermarket {

    CHEESE("cheese", 5),
    WATER_BOTTLE("water bottle" , 3),
    OIL_BOTTLE( "oil bottle", 10),
    SUGAR("sugar",7);

    private int productsPrice;
    private String name;

    private Supermarket (String name, int productsPrice) {
        this.productsPrice = this.productsPrice;
        this.name = name;
    }

    public static int sumPrice(Supermarket[] arr, int [] sizes) {
        int priceOfAll = 0;
        for (int i = 0; i < arr.length ; i++) {
            priceOfAll += arr[i].productsPrice*sizes[i];
        }
        return priceOfAll;
    }

}
