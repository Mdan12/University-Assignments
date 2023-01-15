import math

def CelciusToFahrenheit():
    print("°C       °F")
    print("------------")
    for i in range(-30,51,5):
        x = ((9/5)*i)+32
        print(f"{i:<3}    {x:>4.0f}")
CelciusToFahrenheit()


def RLK(n, k):
    for i in range(n,k+1):
        squareroot = math.sqrt(i)
        logarithm = math.log(i)
        square = pow(i, 2)
        print(f"Ferningsrót {i} er {squareroot:.2f}, lógaritmi {i} er {logarithm:.2f} og {i} í öðru veldi er {square}")
    while n<=k:
        squareroot = math.sqrt(n)
        logarithm = math.log(n)
        square = pow(n, 2)
        print(f"Ferningsrót {n} er {squareroot:.2f}, lógaritmi {n} er {logarithm:.2f} og {n} í öðru veldi er {square}")
        n+=1
RLK(1,10)


def LogAndPower(log, logexp, log10, log2):
    logarithm = math.log(log)
    logexponent = math.log(math.exp(logexp))
    logarithm10 = math.log(log10, 10)
    logarithm2 = math.log(log2, 2)
    print(f"""Lógaritmi af {log} er {logarithm:.0f}, lógaritmi af e í veldinu {logexp} er {logexponent}, 
lógaritmi af {log10} með grunntöluna 10 er {logarithm10:.0f} og lógaritmi af {log2} með grunntöluna 2 er {logarithm2:.0f}""")
LogAndPower(1, 3, 1000, 8)


def volumeOfSphere(radius):
    return (4/3)*math.pi*(radius**3)

def radiusOfSphere(circumference):
    return circumference/(2*math.pi)

def weightOfGold(side, densityOfGold):
    return (side**3) * densityOfGold/1000

radius = 2
print(f"rúmmál kúlu með radíus {radius} er ", round(volumeOfSphere(radius), 2))

circumference = 100
print(f"Radíus hrings með ummálið {circumference} er", round(radiusOfSphere(circumference), 2))

side = 20
densityOfGold = 19.30
print(f"Eðlismassi gulltenings sem er {side} á kant og eðlisþyng {densityOfGold} er", weightOfGold(20, 19.3))

circumference = 40000
density = 5.5 
radiusOfEarth = radiusOfSphere(circumference*10**4)
volueOfEarth = volumeOfSphere(radiusOfEarth)
massOfEarth = volueOfEarth * (density*10**3)
print(f"Massi jarðar með ummálið {(circumference/1000):.0f} km og eðlismassan {density:.0f} er {massOfEarth/(10**6)} tonn")


def Chess(n):
    lines = "-"*2*(n+1)
    newline = lines.replace("-", '', 1)
    print("+", newline, "+", sep='')
    for i in range(0,n):
        print("|", end=' ')
        for t in range(0,n):
            if (i+t)%2==0:
                print(" ", end=' ')
            else:
                print("X", end=' ')
        print("|")
    print("+", newline, "+", sep='')      
Chess(8)
