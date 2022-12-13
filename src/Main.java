import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Date());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}