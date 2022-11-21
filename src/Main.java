import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String day=scanner.nextLine().toUpperCase();
        Wikend wikend = Wikend.valueOf(day);

        switch (wikend){
            case MONDAY -> System.out.println("Дуйшөмбү куну жава окуйм");
            case TUESDAY -> System.out.println("Шейшемби куну англ.яз окуйм");
            case WEDNESDAY -> System.out.println("Шаршемби жава окуйм");
            case FRIDAY -> System.out.println("Бейшемби Soft skills окуйм");
            case SATURDAY -> System.out.println("Жума Event окуйм");
            case SUNDAY -> System.out.println("Ишемби эс алуу");
        }




    }
}