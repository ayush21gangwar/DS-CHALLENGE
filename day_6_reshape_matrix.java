class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    int rm=mat.length;
    int cm=mat[0].length;
            
    if((r*c)!=(rm*cm))
        return mat;
    
    int i=0,j=0;
    int nmat[][]=new int[r][c];
    
    for(int im=0;im<rm;im++)
    {
        for(int jm=0;jm<cm;jm++)
        {
            nmat[i][j]=mat[im][jm];
            
            if(j==c-1)
            {
                i++;
                j=0;
            }
            else
            j++;
            
        }
    }
    
    return nmat;
    }
}