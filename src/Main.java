public class Main {
    public static void main(String[] args) {
        BonusMilesService1 service=new BonusMilesService1();
        int price=10_000;
        int miles=service.calculate(price);
        System.out.println("За покупку начислено: " + miles + " Бонусных Мили");
    }
}
