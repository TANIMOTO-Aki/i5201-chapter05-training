public class EX5_AndOrNot {
    public static void main(String[] args) {
        boolean pF = false;                 //ｐとｑの真偽を用意
        boolean pT = true;
        boolean qF = false;
        boolean qT = true;
        boolean A = false;                  // 結果表示用の変数

        /* pqともに偽の場合 */
        System.out.println("p=偽、q=偽の場合");
        A = pF & qF;
        System.out.println("p&q  =" + A);
        A = pF | qF;
        System.out.println("p|q  =" + A);
        A = pF ^ qF;
        System.out.println("p^q  =" + A);
        A = !pF;
        System.out.println("!p   =" + A);
        A = pF && qF;
        System.out.println("p&&q =" + A);
        A = pF || qF;
        System.out.println("p||q =" + A);
        A = pF == qF;
        System.out.println("p==q =" + A);
        A = pF != qF;
        System.out.println("p!=q =" + A);
        System.out.println("");     //改行

        /* p=偽、q=真の場合 */
        System.out.println("p=偽、q=真の場合");
        A = pF & qT;
        System.out.println("p&q  =" + A);
        A = pF | qT;
        System.out.println("p|q  =" + A);
        A = pF ^ qT;
        System.out.println("p^q  =" + A);
        A = !pF;
        System.out.println("!p   =" + A);
        A = pF && qT;
        System.out.println("p&&q =" + A);
        A = pF || qT;
        System.out.println("p||q =" + A);
        A = pF == qT;
        System.out.println("p==q =" + A);
        A = pF != qT;
        System.out.println("p!=q =" + A);
        System.out.println("");     //改行

        /* p=真、q=偽の場合 */
        System.out.println("p=真、q=偽の場合");
        A = pT & qF;
        System.out.println("p&q  =" + A);
        A = pT | qF;
        System.out.println("p|q  =" + A);
        A = pT ^ qF;
        System.out.println("p^q  =" + A);
        A = !pT;
        System.out.println("!p   =" + A);
        A = pT && qF;
        System.out.println("p&&q =" + A);
        A = pT || qF;
        System.out.println("p||q =" + A);
        A = pT == qF;
        System.out.println("p==q =" + A);
        A = pT != qF;
        System.out.println("p!=q =" + A);
        System.out.println("");     //改行

        /* pqともに真の場合 */
        System.out.println("p=真、q=真の場合");
        A = pT & qT;
        System.out.println("p&q  =" + A);
        A = pT | qT;
        System.out.println("p|q  =" + A);
        A = pT ^ qT;
        System.out.println("p^q  =" + A);
        A = !pT;
        System.out.println("!p   =" + A);
        A = pT && qT;
        System.out.println("p&&q =" + A);
        A = pT || qT;
        System.out.println("p||q =" + A);
        A = pT == qT;
        System.out.println("p==q =" + A);
        A = pT != qT;
        System.out.println("p!=q =" + A);
        System.out.println("");     //改行
    }
}
