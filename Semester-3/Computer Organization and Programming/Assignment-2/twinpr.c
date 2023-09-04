#include <stdio.h>
#include <stdlib.h>

int isprime(long k)
{
    int flag = 1;

    for (int i = 2; i <= k / 2; i++)
    {

        if (k % i == 0)
        {
            return 0;
        }
    }
    return 1;
}

int main(int argc, char **argv)
{
    if (argc != 2)
    {
        printf("Usage: %s <n>\n", argv[0]);
        return 1;
    }

    int counter = 0;
    int num = 2;
    int n = atoi(argv[1]);

    while (counter < n)
    {
        if (isprime(num) && isprime(num + 2))
        {
            printf("%d og %d\n", num, num + 2);
            num = num + 2;
            counter += 1;
        }
        else
        {
            num += 1;
        }
    }
}