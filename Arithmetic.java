public class Arithmetic {
    private int pr1 = 0;
    private int pr2 = 0;
    private int summa = 0;
    private int proiz = 0;
    private int max = 0;
    private int min = 0;

    public Arithmetic(int p1, int p2) {
        pr1 = p1;
        pr2 = p2;
    }

    public void summa() {
        summa = pr1 + pr2;
    }

    public void proizv() {
        proiz = pr1 * pr2;
    }

    public void max() {
        if (pr1 > pr2) {
            max = pr1;
        } else if (pr2 > pr1) {
            max = pr2;
        } else {
            System.out.println("Числа равны");
            return;
        }
        System.out.println("Максимальное число " + max);
    }

    public void min() {
        if (pr1 < pr2) {
            min = pr1;
        } else if (pr2 < pr1) {
            min = pr2;
        } else {
            System.out.println("Числа равны");
            return;
        }
        System.out.println("Минимальное число " + min);
    }

    public void print() {
        System.out.println("Сумма -" + summa);
        System.out.println("Произведение -" + proiz);
    }



}