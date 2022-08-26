```java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
class Main
{
    // Read multiline input in Java 7 using `BufferedReader` class
    public static void main(String[] args)
    {
        try (InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(in))
        {
            String line;
            while ((line = buffer.readLine()) != null)
            {
                String[] tokens = line.split("\\s");
                System.out.println(Arrays.toString(tokens));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```
