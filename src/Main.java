public class Main {
    public static void main(String[] args) {

        int ticketPrice = 20;
        int priceBonusMile = 20;
        int amountMile = ticketPrice / priceBonusMile;

        if (ticketPrice >= 20) {
            System.out.println("Вам начисленна " + amountMile + " миль");
        }else {
            System.out.println("Трать больше!\nТебе нужны эти мили!!!");
        }
    }
}
