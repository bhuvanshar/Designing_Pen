public class Client {
    static void main() {
        GellPen gellPen = PenFactory
                .createGellPen()
                .setRefill(new Refill())
                .setCanChangeRefill(true)
                .build();
    }
}
