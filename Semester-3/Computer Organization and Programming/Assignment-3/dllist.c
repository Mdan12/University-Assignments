/******************************************************************
  Beinagrind fyrir dæmi 3 í heimadæmum 3 í Tölvutækni og forritun,
  haust 2022

  Sjá lýsingu verkefnis á dæmablaði
*******************************************************************/
#include <stdio.h>
#include <stdlib.h>

struct dNode
{
    int data;
    struct dNode *prev;
    struct dNode *next;
};

/* Prentar út stök í tvítengdum list */
void printList(struct dNode *h)
{
    printf("Listi: ");
    while (h != NULL)
    {
        printf("%d ", h->data);
        h = h->next;
    }
    printf("\n");
}

/* Eyðir hnúti númer k í tvítengda listanum sem h og t benda á.
   Breytir mögulega haus- og halabendunum h og t               */
void delNode(struct dNode **h, struct dNode **t, int k)
{
    struct dNode *p = *h;
    // eyða fyrsta hnúti
    if (k == 1)
    {
        p = p->next;
        free(*h);
        *h = p;
    }
    // leita að og eyða hnút öðrum en fyrsta
    else
    {
        // leitum að staki númer k
        for (int i = 1; i < k - 1 && p->next != NULL; i++)
        {
            p = p->next;
        }
        if (p->next == NULL)
        {
            return;
        }

        struct dNode *temp = p->next;
        p->next = temp->next;
        free(temp);
    }
    // skilum bendi á fyrsta hnútinn
    return;
}

/* Býr til n-staka lista með slembigildum (0 til 99),
   skilar bendi á fremsta hnút, eða NULL ef n < 1 */
void createList(struct dNode **h, struct dNode **t, int n)
{
    struct dNode *p;
    int i;

    /* Ef n er núll eða minna þá tómur listi */
    if (n < 1)
    {
        *h = NULL;
        *t = NULL;
        return;
    }

    /* Búa til fyrsta hnútinn og láta haus og hala benda á hann */
    *h = *t = p = (struct dNode *)malloc(sizeof(struct dNode));
    (*h)->data = rand() % 100;
    (*h)->prev = NULL;
    (*h)->next = NULL;

    /* Búa til restina af hnútunum og setjum þá aftast */
    for (i = 1; i < n; i++)
    {
        p = (struct dNode *)malloc(sizeof(struct dNode));
        p->data = rand() % 100;
        p->prev = *t;
        p->next = NULL;
        (*t)->next = p;
        *t = p;
    }
}

int main()
{
    int i;

    struct dNode *head = NULL;
    struct dNode *tail = NULL;

    /* Búa til listann með 10 slembigildum */
    createList(&head, &tail, 10);
    printList(head);

    /* Eyða út nokkrum hnútum og skoða listann í hvert sinn */
    delNode(&head, &tail, 1);
    printList(head);

    delNode(&head, &tail, 3);
    printList(head);

    delNode(&head, &tail, 10);
    printList(head);

    return 0;
}
