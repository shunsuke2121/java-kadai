package java12345;

import java12345.TriangleFinder;

import java.util.Scanner;

public class kadai57 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        Triangle[] triangles = new Triangle[3];//トライアングル型の配列trianglesをインスタンス化
        for (int i = 0; i < triangles.length; i++) {
            triangles[i] = new Triangle();//配列の箱の中身にTriangleのインスタンスを入れる。
            System.out.print("x=");
            float x = input.nextFloat();
            triangles[i].tate = x;
            System.out.print("y=");
            float y = input.nextFloat();
            triangles[i].yoko = y;
            System.out.print("z=");
            float z = input.nextFloat();
            triangles[i].takasa = z;
        }
        TriangleFinder find = new TriangleFinder(triangles);
        find.FindMaxArea();
        find.FindMaxVolume();
        // System.out.println("最大の面積は"+find.FindMaxArea()+"番目で"+triangles[find.FindMaxArea()].menskei()+"である");
        // System.out.println("最大は体積は"+find.FindMaxVolume()+"番目で"+triangles[find.FindMaxVolume()].taiseki()+"である");

    }
}
