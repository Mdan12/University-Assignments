#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LINE_LENGTH 1024
#define MAX_FIELDS 50

struct realestate
{
    int total;
    int size_of_post_code;
};

int main()
{
    int sum = 0;
    int population = 0;
    char line[MAX_LINE_LENGTH];
    fgets(line, sizeof(line), stdin);

    char *fields[MAX_FIELDS];
    struct realestate *ip = calloc(999, sizeof(struct realestate));
    while (fgets(line, sizeof(line), stdin))
    {
        line[strcspn(line, "\n")] = '\0';

        char *token = strtok(line, "\t;");

        int numFields = 0;
        while (token != NULL)
        {
            if (numFields < MAX_FIELDS)
            {
                fields[numFields] = token;
                numFields++;
            }
            else
            {
                fprintf(stderr, "Too many fields in the CSV line.\n");
                exit(1);
            }

            token = strtok(NULL, "\t;");
        }

        if (atoi(fields[5]) < 999)
        {
            ip[atoi(fields[5])].total += atoi(fields[11]);
            ip[atoi(fields[5])].size_of_post_code += 1;
            sum += atoi(fields[11]);
        }
        else
        {
            sum += atoi(fields[10]);
        }
        population += 1;
    }
    for (int i = 0; i < 901; i++)
        if (ip[i].total != 0)
        {
            printf("%d %d %d %f %f\n", i, ip[i].total, ip[i].size_of_post_code, ((float)ip[i].total / sum), ((float)ip[i].size_of_post_code / population));
        }

    free(ip);
    return 0;
}
