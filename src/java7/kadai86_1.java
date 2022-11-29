package java7;

import java.util.Scanner;

public class kadai86_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("部活名を入力");
        String clubName = input.nextLine();
        System.out.println("顧問名を入力");
        String komon = input.nextLine();
        Club_1 club = new Club_1(clubName,komon);
        while (true){
            System.out.println("入部=1, 表示=2, 削除=3, 終了=0");
            System.out.print("数字を入力");
            int i = input.nextInt();
            if(i == 1) {
                System.out.println("学籍番号を入力");
                String gakuseki = input.next();
                System.out.println("氏名を入力");
                String shimei = input.next();
                Member_1 member = new Member_1(gakuseki, shimei);
                club.join(member);
            }else if( i == 2){
                club.print();
            }
            else if(i==3){
                System.out.println("消したい学籍番号を入力:");
                String gakuseki = input.next();
                club.delete(gakuseki);
            }
            else if(i==0){
                System.exit(0);
            }
        }

    }
}
