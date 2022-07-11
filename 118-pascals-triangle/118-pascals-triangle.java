class Solution {
    
        public static List<Integer> toList(int arr[]){
            List<Integer> l = new ArrayList<>();
            for(int i : arr){
                l.add(i);
            }
            return l;
        }
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int arr[][] = new int[numRows][];
        
        for(int i = 0; i<numRows; i++){
            arr[i] = new int[i+1];
            for(int j = 0; j<=i; j++){
                if(j==0 || j==i){
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }        
            }
            List l = toList(arr[i]);
            list.add(l);
        }
        System.gc();
        return list;
    }
}