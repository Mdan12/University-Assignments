#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int *get_ints(size_t n)
{
    int *ip;
    ip = (int *)calloc(n, sizeof(int));

    if (ip == NULL)
    {
        printf("Can't allocate %zu ints\n", n);
    }
    return ip;
}

int main(int argc, char **argv)
{
    srand(time(NULL));
    if (argc < 3)
    {
        printf("Usage: %s <filename>\n", argv[0]);
        return 1;
    }
    int n = atoi(argv[1]);
    int k = atoi(argv[2]);
    int *ip = get_ints(n);
    for (int i = 0; i < n * k; i++)
    {
        int r = rand() % (n - 1);
        ip[r] += 1;
    }
    int cnt = 0;
    for (int j = 0; j < n; j++)
    {
        if (ip[j] == 0)
            cnt += 1;
    }

    float percent = ((float)cnt / n) * 100;
    printf("Eftir %d ítranir eru %d hólf ennþá 0, eða %.2f %%\n", n * k, cnt, percent);
    free(ip);
    return 0;
}