public class Main {
    public static void main(String[] args) {
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес обоих боксеров: " + totalWeight);
        var differenceOfWeight = secondBoxer - firstBoxer;
        System.out.println("Разница в весе боксеров: " + differenceOfWeight);
        var remainder = secondBoxer % firstBoxer;
        System.out.println("Остаток от деления между двумя весами: " + remainder);
    }
}