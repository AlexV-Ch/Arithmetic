public class Arithmetic {
    private int pr1 = 0;
    private int pr2 = 0;

    public Arithmetic(int pr1, int pr2) {
        this.pr1 = pr1;
        this.pr2 = pr2;
    }

    public int summa() {
        return pr1 + pr2;
    }

    public int proizv() {
        return pr1 * pr2;
    }

    public int max() {
        return Math.max(pr1, pr2);
    }

    public int min() {
        return Math.min(pr1, pr2);
    }
}