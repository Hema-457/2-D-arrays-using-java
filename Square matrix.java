class Main{
    public static void main(String args[])
    {
        int matrix[][]=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        if(matrix.length==matrix[0].length)
        {
            System.out.println("Square matrix");
        }
        else{
            System.out.println("Not Square matrix");
        }
    }
    
}
