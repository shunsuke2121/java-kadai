import java.util.Scanner;

public class Array2DMAP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] ia = new int[5][5];
        int x = 0;
        int y = 0;
        while (true) {
            for (int i = 0; i < ia.length; i++) {
                for (int j =0; j<ia.length;j++){
                    if (i == y && j==x) {
                        ia[i][j] = 1;
                    } else {
                        ia[i][j] = 0;
                    }
                    System.out.printf(ia[i][j] + "");
                }
                System.out.printf("\n");
                }
            System.out.printf("どちらに移動する？:");
            String key = input.nextLine();
                switch (key) {
                    case "a":
                        x = x - 1;
                        System.out.println("左に移動");
                        break;
                    case "d":
                        x=x+1;
                        System.out.println("右に移動");
                        break;
                    case "w":
                        y=y-1;
                        System.out.println("上に移動");
                        break;
                    case "s":
                        y=y+1;
                        System.out.println("下に移動");
                        break;
                    case "q":
                        System.out.println("終了");
                        System.exit(0);
                }
            if (x > 4 || x < 0 ||y>4 ||y<0) {
                System.out.println("位置がだめ");
                switch (key){
                case "a":
                    x = x + 1;
                    break;
                case "d":
                    x = x - 1;
                    break;
                case "w":
                    y=y+1;
                    break;
                case "s":
                    y=y-1;
                    break;


            }
            }


        }
    }
}
