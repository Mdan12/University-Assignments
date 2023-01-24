from math import log2
def calculations(n):
    a = 4 * log2(n) * n * 10**-6
    b = 10 * n * log2(n) * 10**-6
    c = 2 * n**2 * 10**-6
    d = (1/10) * 2**n * 10**-6
    print(a, b, c, d)

calculations(10)
calculations(100)
calculations(1000)
calculations(10**6)
calculations(10**9)