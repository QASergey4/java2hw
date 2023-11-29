public class Main {
    public static void main(String[] args) {
        int ticketPrice = 20_000;
        int rublesPerMile = 20;
        int milesFromTicketPrice = ticketPrice / rublesPerMile;
        System.out.printf("За билет стоимостью %d руб Вы получите %d милей",
                ticketPrice, milesFromTicketPrice);
    }
}