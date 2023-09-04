#include <stdio.h>

int main()
{
    int i = 2;
    int *p = &i;
    *p = 5;
    printf("%d\n and %p\n", i, &i);
}