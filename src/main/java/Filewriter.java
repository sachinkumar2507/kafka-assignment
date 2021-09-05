import java.io.FileWriter;
class Filewriter {
    public static void main(String args[])
    {
        String data = "{\"id\":\"1\",\"name\":\"sachin\",\"age\":\"24\",\"course\":\"BTech.\"}";

        try {
            FileWriter output = new FileWriter("/home/knoldus/Downloads/output.txt",true);
            output.write(data);
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}