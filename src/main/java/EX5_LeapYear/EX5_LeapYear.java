import java.io.*;

public class EX5_LeapYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        /* 西暦の入力 */
        System.out.print("西暦年(1～2011)　？");
        int year = Integer.parseInt(br.readLine());
        if (year <= 2011 && 1 <= year) {
            if (year % 400 == 0) {
                System.out.println(year + "年はうるう年です。");
            } else if (year % 4 != 0) {
                System.out.println(year + "年は平年です。");
            } else if (year % 100 == 0) {
                System.out.println(year + "年は平年です。");
            } else {
                System.out.println(year + "年はうるう年です。");
            }
        } else {
            System.out.println("入力値に誤りがあります");
        }
    }
}
