/***************************************************************
Beinagrind að lausn á dæmi 4 í heimadæmum 3 í Tölvutækni
og forritun, haust 2023
Sjá lýsingu á dæmablaði
****************************************************************/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LEN 200

int main(int argc, char **argv)
{
    char innstr[MAX_LEN];
    while (scanf("%s", innstr) != EOF)
    {
        int length = strlen(innstr); // Use strlen to get the length of the input string
        char *newstr;

        // Check if the input string contains 'x'
        if (strchr(innstr, 'x') != NULL)
        {
            // Allocate memory for the new string containing 'x' repeated 'length' times
            newstr = (char *)malloc((length + 1) * sizeof(char));
            if (newstr == NULL)
            {
                printf("Can't allocate memory\n");
                return 1;
            }

            // Initialize the new string with 'x' repeated 'length' times
            for (int i = 0; i < length; i++)
            {
                newstr[i] = 'x';
            }
            newstr[length] = '\0'; // Null-terminate the new string
        }
        else
        {
            // If the input string doesn't contain 'x', just copy it as-is
            newstr = strdup(innstr);
            if (newstr == NULL)
            {
                printf("Can't allocate memory\n");
                return 1;
            }
        }

        printf("%s\n", newstr);

        free(newstr); // Free the allocated memory for the new string
    }
    return 0;
}
