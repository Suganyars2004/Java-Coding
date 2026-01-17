package Arrays.medium;
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int a[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        boolean row[]=new boolean[a.length];
        boolean column[]=new boolean[a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
               if(a[i][j]==0){
                row[i]=true;
                column[j]=true;
            }
        }
    }
     for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
               if(row[i]||column[j]){
                a[i][j]=0;
               }
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
