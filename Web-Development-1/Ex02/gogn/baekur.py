with open("baekur.csv") as f:
    for line in f:
        print(f"<li>{line.strip()}</li>")