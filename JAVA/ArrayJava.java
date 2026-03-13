public class ArrayJava {
    public static void main(String[] args) {
//         int [] nums={1,2,3,4,5,6};
//         for(int i=0;i<nums.length;i++){
//             if(i%2==0){
// System.out.println(i);
//             }
//         }

//multi dimension array
// int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
// System.out.println(myNumbers[1][2]);

//2nd
int[][] nums= { {1, 4, 2}, {3, 6, 8, 5, 2} };
for(int i=0;i<nums.length;i++){
    for(int j=0;j<nums[i].length;j++){
        System.out.println(i+" "+j+" "+nums[i][j]);
    }
}
    }
}
