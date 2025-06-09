public class AziHomeWork_2 {public static String permission (int AgeOfPerson, float width ) {
    if ((AgeOfPerson>20 && AgeOfPerson<45) && (width>-20 && width<30)) {
        return "Можно идти гулять";}

    else if (AgeOfPerson<20 && (width>0 && width<28)) {
        return "Можно идти гулять";

    } else if ((AgeOfPerson>45)&&(width>-10 &&  width<25))
    {return "Можно идти гулять";}
    else
    {return "Оставайтесь дома";
    }

}

    public static void main(String[] args) {
        System.out.println("25 лет, Нормальнпя погода: " + permission(25, 10.5f));
        System.out.println("18 лет, Нориальная погода: " + permission(18, 15));
        System.out.println("58 лет, Относительно хорошая погода: " + permission(50, 29));
        System.out.println("30 лет, Холодно: " + permission(30, -25));
        System.out.println("12 лет, Жара: " + permission(12, 30));

        System.out.println();// Для удобства
        System.out.println(generateRandomAge() + " лет: " + permission(generateRandomAge(), 4));
    }

    public static int generateRandomAge() {
        return (int)(Math.random() * 100);
    }
}
