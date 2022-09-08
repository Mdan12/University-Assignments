from itertools import chain

with open("baekur.csv") as f:
    for line in f:
        asd =  line.split(";")
        string = [s for S in asd for s in S]
        print(string)