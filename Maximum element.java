class Main{
    public static void main(String args[])
    {
        int [][]matrix=
        {
            {1,29,13},
            {4,15,65},
            {74,20,9}
        };
        int max=matrix[0][0];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]>max)
                {
                    max=matrix[i][j];
                }
            }
        }
            System.out.println("max : "+max);
        
    }
}
