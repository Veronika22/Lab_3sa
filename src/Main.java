
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> inp = new ArrayList<String>();
        Scanner in = new Scanner(new File("inputfile.txt"));
        while (in.hasNextLine())
            inp.add(in.nextLine());
        in.close();
        String[] array = inp.toArray(new String[0]);
        NumParser np = new NumParser();

        np.ReadFile();
        for(int i=0;i<array.length ;i++)
        {
            array[i] = np.ParseString(array[i]);
            System.out.println(array[i]+'\n');
        }





    }

}
