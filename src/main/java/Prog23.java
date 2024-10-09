
/**
 * クラス Prog23 の注釈をここに書きます.
 * 
 * @author (熊野)
 * @version (２０２４．１０．8)
 */
public class Prog23 { 
    public static void main(String[] args) {
        int input;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("料金：１）大人（高校生以上）、２）小人（中学生以下）、３）動物園パスポート");
        System.out.print("区分を入力してください：");
        input = sc.nextInt(); 

        if (input == 1) {
            System.out.print("旭川市在住者であることがわかる証書がありますか？１）はい、２）いいえ)：");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("料金は700円です。");
            } else if (n == 2) {
                System.out.println("料金は1,000円です。");
            }
        } else if (input == 2) {
            System.out.println("料金は無料です。");
        } else if (input == 3) {
            System.out.println("料金は1,400円です。");
        }else {
                System.out.println("区分の入力が正しくありません。");
        }

        sc.close(); 
}
}
