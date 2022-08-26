# B. Drawing 'X'
- time limit per test1 second
- memory limit per test256 megabytes
- inputstandard input
- outputstandard output


 Some day, an artist wanted to draw an X mark on the wall in a fashionable way.


## He wanted to do so by grouping snippets of slashes /, backslashes \, asterisks * and a capital X letter in an N×N square as shown in the sample. Can you help him?

## Input
Only one line containing one odd number N (3≤N≤49).

## Output
Print the fashionable drawing.


## Examples
### input
5
output
\***/
*\*/*
**X**
*/*\*
/***\

---

```java
import java.io.*;

public class mainClass {
    public static void main(String[] args) throws IOException {
       int [] arrOfNums = new int[1];
       int i=0;
        while (i < 1) {

        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int number=Integer.parseInt(in.readLine());
arrOfNums[i]=number;
i++;

        }
        new DrawingX(arrOfNums[0]);
    }
}

```
---
```java
import java.util.Arrays;

public class DrawingX {
    public DrawingX(int oddLineLen){
        double xPosition=Math.floor(oddLineLen+2/2);

        int x= oddLineLen/2;

       String[] line= new String[oddLineLen];
        Arrays.fill(line, "*");
        int ln=1;
        int counter=1;
        while (ln<xPosition){
line[ln-1]="\\";

line[line.length-ln]="/";
            if(counter == x+1){
                line[x]="X";
                ++counter;

            }
            System.out.println(Arrays.toString(line));
            Arrays.fill(line, "*");
            ln++;
            ++counter;
        }
    }
}

```
