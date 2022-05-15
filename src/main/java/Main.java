import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();
        int result = service.numerical(1_000, 10_000);
        System.out.println(result);
    }
}