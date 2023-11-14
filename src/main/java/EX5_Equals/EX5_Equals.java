import java.io.*;

public class EX5_Equals {
    public static void main(String[] args) throws IOException {
        String ans1 = "",ans2 = "";

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.print("文字列1を入力してください＞");
        String str1 = br.readLine();
        System.out.print("文字列2を入力してください＞");
        String str2 = br.readLine();

        if (str1.equals(str2)) {
            ans1 += "文字列1と文字列2は同じ文字列です";
        } else {
            ans1 += "文字列1と文字列2は違う文字列です";
        }

        if (str1.equalsIgnoreCase(str2)){
            ans2 += "文字列1と文字列2は同じ文字列です";
        } else {
            ans2 += "文字列1と文字列2は違う文字列です";
        }

        System.out.println("大文字と小文字を区別して比較:" + ans1);
        System.out.println("大文字と小文字を区別しないで比較:" + ans2);
    }
}
