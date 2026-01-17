package Searching;

public class linearSearch {
    public static void main(String[] args) {
        int a[]={12,6,8,33,22};
        int target=3;
        int arr[][]={{1,2},{2,4},{8,9,3}};
        int resultMat[]=linearmat(arr,target);
        for(int i:resultMat){
            System.err.print(i+" ");
        }
        System.err.println();
        int result=linear(a,target);
        System.out.println("Found at index:"+result);
        String str="code io";
        char tar='e';
        int resultString=linearString(str, tar);
        System.out.println(resultString);
        boolean resultbool=linearbool(a,target);
        System.out.println("Found at index:"+resultbool);
    }
    static int linear(int a[],int target){
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                return i;
            }
        }
        return -1;

    }
    static int linearString(String st,char tar){
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==tar){
                return i;
            }
        }
        return -1;

    }
    static int[] linearmat(int arr[][],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==target){
                return new int[]{i,j};
            }
        }
    }
        return new int[] {-1,-1};

    }
    static boolean linearbool(int a[],int target){
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                return true;
            }
        }
        return false;

    }
}
