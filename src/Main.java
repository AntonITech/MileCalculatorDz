public class Main {
    public static void main(String[] args) {

        System.out.println(" Калькулятор начисленных миль за купленный билет ");

        int price = 200;
        int mile = 20;
        String name = " Количество начисленных миль за купленный билет составляет: ";

        if (price >= mile) {
            System.out.println(name + price / mile);

        }
    }
}