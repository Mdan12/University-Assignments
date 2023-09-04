#include <stdio.h>

typedef struct
{
    int a[8];
    double d;
    double x;
} struct_t;

double fun(int i)
{
    volatile struct_t s;
    s.d = 3.14;
    s.a[i] = 1073741824; /* Possibly out of bounds */
    return s.d;
}

int main()
{
    printf("%li\n", sizeof(struct_t));
    for (int i = 0; 1; i++)
        printf("%i %lf\n", i, fun(i));
    return 0;
}