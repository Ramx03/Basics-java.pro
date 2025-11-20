#include <stdio.h>

int main() {
     
    float a; 
    float b; 
    double c; 
    double d; 

    a = 3.1234567890f; 
    b = 3.1234567890f;
    c = 3.12345678901234567890;
    d = 3.12345678901234567890;

    printf("%.5f\n", a);
    
    printf("%.2f\n", b);

    printf("%.10lf\n", c);
    
    printf("%.16lf\n", d);
    
    return 0;
}