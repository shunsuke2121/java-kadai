public class TriangleFinder {
    Triangle[] triangles; //フィールドにTriangle型のtrianglesを定義
    TriangleFinder(Triangle[] triangles){//引数ありのコンストラクタ。引数でTriangle型の配列を受け取り、上で定義しフィールドに代入
        this.triangles = triangles;
    }

    void FindMaxArea(){ //小さいものを優先
        float max = 0;
        int key=0;
        for(int i=0;i<triangles.length;i++){
            if (triangles[i].menskei()>max){
                max = triangles[i].menskei();
                key=i;
            }
        }
        System.out.println("最大の面積は"+key+"番目で"+triangles[key].menskei()+"である");
    }

    void FindMaxVolume() { //小さいものを優先
        float max = 0;
        int key = 0;
        for (int i = 0; i < triangles.length; i++) {
            if (triangles[i].taiseki() > max) {
                max = triangles[i].taiseki();
                key = i;
            }
        }
        System.out.println("最大の体積は"+key+"番目で"+triangles[key].taiseki()+"である");
    }
}
