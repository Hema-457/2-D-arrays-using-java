class Main{
    public static void main(String args[])
    {
        int matrix[][]=
        {
            {12,29,13},
            {4,15,65},
            {74,20,9}
        };
        for(int j=0;j<matrix[0].length;j++)
        {
            for(int i=0;i<matrix.length;i++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
