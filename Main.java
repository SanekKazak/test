import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static double sum;

    public static void main(String[] args) {

        //1)..............................................

        for (double i = 1; i < 10000; i += 2) {
            sum += (1 / i);
        }
        for (double i = 2; i < 10000; i += 2) {
            sum -= (1 / i);
        }
        System.out.print("\nResult first task:" + sum + "\n");

        //2)..............................................

        int rand_num = (int) (Math.random() * (9 - (-1)) - 1);
        switch (rand_num) {
            case (0) -> System.out.print("result second task:" + 0 + "  it's zero\n");
            case (1) -> System.out.print("result second task:" + 1 + "  it's one\n");
            case (2) -> System.out.print("result second task:" + 2 + "  it's two\n");
            case (3) -> System.out.print("result second task:" + 3 + "  it's three\n");
            case (4) -> System.out.print("result second task:" + 4 + "  it's four\n");
            case (5) -> System.out.print("result second task:" + 5 + "  it's five\n");
            case (6) -> System.out.print("result second task:" + 6 + "  it's six\n");
            case (7) -> System.out.print("result second task:" + 7 + "  it's seven\n");
            case (8) -> System.out.print("result second task:" + 8 + "  it's eight\n");
            case (9) -> System.out.print("result second task:" + 9 + "  it's nine\n");
        }

        //3)..............................................

        Scanner in = new Scanner(System.in);
        String strInput, str0 = "zero", str1 = "one", str2 = "two", str3 = "three", str4 = "four", str5 = "five",
                str6 = "six", str7 = "seven", str8 = "eight", str9 = "nine";
        strInput = in.nextLine();
        if (str0.equals(strInput)) System.out.print("result third task: 0\n");
        if (str1.equals(strInput)) System.out.print("result third task: 1\n");
        if (str2.equals(strInput)) System.out.print("result third task: 2\n");
        if (str3.equals(strInput)) System.out.print("result third task: 3\n");
        if (str4.equals(strInput)) System.out.print("result third task: 4\n");
        if (str5.equals(strInput)) System.out.print("result third task: 5\n");
        if (str6.equals(strInput)) System.out.print("result third task: 6\n");
        if (str7.equals(strInput)) System.out.print("result third task: 7\n");
        if (str8.equals(strInput)) System.out.print("result third task: 8\n");
        if (str9.equals(strInput)) System.out.print("result third task: 9\n");

        //4)..............................................

        int minNum = 101, indexMin = 0, maxNum = -1, indexMax = 0, sizeMas = 13;
        int[] mas_task4 = new int[sizeMas];
        System.out.print("first massive from 4 task:");
        for (int i = 0; i < sizeMas; i++) {
            mas_task4[i] = (int) (Math.random() * (100 - 1) + 1);
            System.out.print(mas_task4[i] + "  ");
        }
        for (int i = 0; i < sizeMas; i++) {
            if (minNum > mas_task4[i]) {
                minNum = mas_task4[i];
                indexMin = i;
            }
            if (maxNum < mas_task4[i]) {
                maxNum = mas_task4[i];
                indexMax = i;
            }
        }
        System.out.print("\n");
        mas_task4[indexMin] = maxNum;
        mas_task4[indexMax] = minNum;
        System.out.print("second massive from 4 task:");
        for (int i = 0; i < sizeMas; i++) {
            System.out.print(mas_task4[i] + "  ");
        }
        System.out.print("\n4 task: max: " + maxNum + "  min: " + minNum);

        //5)..............................................

        int[] mas_task5 = new int[sizeMas];
        System.out.print("\nfirst massive from 5 task:");
        for (int i = 0; i < sizeMas; i++) {
            mas_task5[i] = (int) (Math.random() * (100 - 1) + 1);
            System.out.print(mas_task5[i] + "  ");
        }
        Arrays.sort(mas_task5);
        System.out.print("\nsecond massive from 5 task:");
        for (int i = 0; i < sizeMas; i++) {
            System.out.print(mas_task5[i] + "  ");
        }

        //6)..............................................

        double midNum = 0;
        int[] mas_task6 = new int[sizeMas];
        System.out.print("\nmassive from 6 task:");
        for (int i = 0; i < sizeMas; i++) {
            mas_task6[i] = (int) (Math.random() * (100 - 1) + 1);
            System.out.print(mas_task6[i] + "  ");
            midNum += mas_task6[i];
        }
        midNum = midNum / sizeMas;
        System.out.print("\nanswer on task six:" + midNum);

        //7)..............................................

        int checkEvenNum, checkNum, sumEven = 0, sumOdd = 0;
        sizeMas = 12;
        int[] mas_task7 = new int[sizeMas];
        System.out.print("\nmassive from 7 task:");
        for (int i = 0; i < sizeMas; i++) {
            mas_task7[i] = (int) (Math.random() * (100 - 1) + 1);
            System.out.print(mas_task7[i] + "  ");
            checkEvenNum = mas_task7[i];
            checkNum = mas_task7[i];
            checkEvenNum = checkEvenNum % 2;
            if (checkEvenNum == 0) sumEven += checkNum;
            if (checkEvenNum > 0) sumOdd += checkNum;
        }
        System.out.print("\nanswer from 7 task: sum even: " + sumEven + " sum odd:  " + sumOdd);

        //8)..............................................

        int sizeX = 5, sizeY = 3;
        System.out.print("\nmassive from 8 task:\n");
        int[][] mas_task8 = new int[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                mas_task8[i][j] = (int) (Math.random() * (100 - 1) + 1);
                System.out.print(mas_task8[i][j] + "   ");
            }
            System.out.print("\n");
        }

        //9)..............................................

        System.out.print("\nAnswer 9 task:\n");
        String s1, s2, s3, s4, s5, condition1, condition2 = null;
        System.out.print("s1:");
        s1 = in.nextLine();
        System.out.print("s2:");
        s2 = in.nextLine();
        System.out.print("s3:");
        s3 = in.nextLine();
        System.out.print("s4:");
        s4 = in.nextLine();
        System.out.print("s5:");
        s5 = in.nextLine();
        if (s4==s5) {
            condition1 = s1 + s3;
            System.out.print(condition2);
        } else {
            condition2 = s1 + s3;
            System.out.print(condition2);
        }
    }
}