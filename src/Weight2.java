import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Weight2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());
        Body.massIndex(weight, height);
    }
}
