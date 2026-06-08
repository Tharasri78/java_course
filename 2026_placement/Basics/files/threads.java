class threads extends Thread {

    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Songs");
            System.out.println("Duration");
            System.out.println("Lyrics");
        }
    }

    public static void main(String[] args) {

        threads s1 = new threads();
        threads s2 = new threads();
        threads s3 = new threads();

        s1.run();
        s2.run();
        s1.start();
        s2.start();
        
    }
}