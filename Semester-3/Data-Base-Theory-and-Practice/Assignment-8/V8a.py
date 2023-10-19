import sqlite3

conn = sqlite3.connect("company.db")

cursor = conn.cursor()

cursor.execute("SELECT sum(Salary) FROM EMPLOYEE")

(result,) = cursor.fetchone()

print(result)

cursor.close()
conn.close()
