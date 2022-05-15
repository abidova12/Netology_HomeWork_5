import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();
        int result = service.numerical(100, 196);
        System.out.println(result);
    }
}