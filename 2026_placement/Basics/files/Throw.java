class Throw {

    static void vote(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        int age = 15;

        try {
            vote(age);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}