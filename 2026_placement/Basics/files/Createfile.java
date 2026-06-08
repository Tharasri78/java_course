import java.io.FileWriter;

class Createfile {
    public static void main(String[] args) {

        try {
            FileWriter f = new FileWriter("sample.txt",true);

            f.write("Hello Java");

            f.close();


            System.out.println("hiii");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}