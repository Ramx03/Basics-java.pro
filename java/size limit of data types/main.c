#include <float.h>
#include <limits.h>
#include <stdio.h>

int main()
{
    printf("Limits of Int Min =%d and Max = %d\n",INT_MIN,INT_MAX);
    printf("Limits of Float Min =%e and Max = %e\n",FLT_MIN,FLT_MAX);
    printf("Limits of double Min =%e and Max = %e\n",DBL_MIN,DBL_MAX);
    printf("Limits of Char Min =%d and Max = %d\n",CHAR_MIN,CHAR_MAX);

    printf("---------------------------------------------\n");
    /*printf("Sizeof Int =%zu bytes\n",sizeof(int));
    printf("Sizeof Float =%zu bytes\n",sizeof(float));
    printf("Sizeof double =%zu bytes\n",sizeof(double));
    printf("Sizeof Char =%zu bytes\n",sizeof(char));*/
    
    return 0;
    
}
