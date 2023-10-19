import sqlite3

conn = sqlite3.connect("company.db")
cursor = conn.cursor()

update_query = "UPDATE EMPLOYEE SET Salary = Salary + 100 WHERE SSN = ?"

cursor.execute("SELECT SSN FROM EMPLOYEE")
ssns = cursor.fetchall()

for ssn in ssns:
    cursor.execute(update_query, (ssn[0],))

conn.commit()
cursor.close()
conn.close()
