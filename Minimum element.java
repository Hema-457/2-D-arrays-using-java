class Main{
    public static void main(String args[])
    {
        int [][]matrix=
        {
            {12,29,13},
            {4,15,65},
            {74,20,9}
        };
        int min=matrix[0][0];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                }
            }
        }
            System.out.println("min : "+min);
        
    }
}
