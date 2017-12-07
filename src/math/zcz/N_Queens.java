package math.zcz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class N_Queens {
    // 皇后的个数
    private int queensNum;
 
    // column[i] = j 表示第 i 列的第 j 行放置一个皇后
    private int[] queens;
 
    // rowExists[i] = true 表示第 i 行有皇后
    private boolean[] rowExists;
 
    // a[i] = true 表示右高左低的第 i 条斜线有皇后
    private boolean[] a;
 
    // b[i] = true 表示左高右低的第 i 条斜线有皇后
    private boolean[] b;
 
    public N_Queens() {
 
    }
 
    public N_Queens(int queensNum) {
        this.queensNum = queensNum;
        this.queens = new int[queensNum + 1];
        this.rowExists = new boolean[queensNum + 1];
        this.a = new boolean[queensNum * 2];
        this.b = new boolean[queensNum * 2];
    }
 
    // 初始化变量
    private void init() {
        for (int i = 0; i < queensNum + 1; i++) {
            rowExists[i] = false;
        }
 
        for (int i = 0; i < queensNum * 2; i++) {
            a[i] = b[i] = false;
        }
    }
 
    // 判断该位置是否已经存在一个皇后,存在则返回 true
    private boolean isExists(int row, int col) {
        return (rowExists[row] || a[row + col - 1] || b[queensNum + col - row]);
    }
 
    private List list = new ArrayList();
 
    // 主方法：测试放置皇后
    public List testing(int column) {
        // 遍历每一行
        for (int row = 1; row < queensNum + 1; row++) {
            // 如果第 row 行第 column 列可以放置皇后
            if (!isExists(row, column)) {
                // 设置第 row 行第 column 列有皇后
                queens[column] = row;
                // 设置以第 row 行第 column 列为交叉点的斜线不可放置皇后
                rowExists[row] = a[row + column - 1] = b[queensNum + column
                        - row] = true;
 
                // 全部尝试过，打印
                if (column == queensNum) {
                    for (int col = 1; col <= queensNum; col++) {
                        list.add("(" + col + "," + queens[col] + ")  ");
                    }
                } else {
                    // 放置下一列的皇后
                    testing(column + 1);
                }
                // 撤销上一步所放置的皇后，即回溯
                rowExists[row] = a[row + column - 1] = b[queensNum + column
                        - row] = false;
            }
        }
        return list;
    }
 
    // 测试
    public static void main(String[] args) {
        List k=new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入棋盘规模:");
        int queensNum = sc.nextInt();
         
        sc = new Scanner(System.in);
        System.out.println("请输入皇后位置:");
        String queenLocation=sc.nextLine().replace(" ", ",");
        queenLocation="("+queenLocation+")  ";
        System.out.println(queenLocation);
        N_Queens queen = new N_Queens(queensNum);
        queen.init();
        // 从第 1 列开始求解
        List li = queen.testing(1);
        if (li.size() == 0) {
            System.out.println("no solution");
        } else {
            for(int i=0;i<li.size()/queensNum;i++){
                for(int j=0;j<queensNum;j++){
//                    System.out.print(li.get(i*queensNum+j));
//                    System.out.print(li.get(16));
                    if(li.get(i*queensNum+j).equals(queenLocation)){
                        k.add(i);
                    }
                }
//                System.out.println();
            }
            if(k.size()==0){
                System.out.println("no solution");
            }else{
                for(int i=0;i<k.size();i++){
//                    System.out.println(k.get(i));
                    int m=Integer.parseInt(k.get(i).toString());
                    for(int j=0;j<queensNum;j++){
                        System.out.print(li.get((m)*queensNum+j));
                    }
                    System.out.println();
                }
            }
        }
    }
}