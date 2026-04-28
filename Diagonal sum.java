class Main{
    public static void main(String args[])
    {
        int [][]matrix=
        {
            {12,29,13},
            {4,15,65},
            {74,20,9}
        };
        
            int sum=0;
            for(int i=0;i<matrix.length;i++)
            {
                    sum+=matrix[i][i];
            }
            System.out.println("Diagonal sum = "+sum);
        
        
        
    }
}
