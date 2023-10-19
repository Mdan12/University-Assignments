import sqlite3

conn = sqlite3.connect("company.db")
cursor = conn.cursor()

update_query = "UPDATE EMPLOYEE SET Salary = Salary + 100 WHERE SSN = ?"

cursor.execute("UPDATE EMPLOYEE SET Salary = (Salary*1.02)")

conn.commit()
cursor.close()
conn.close()
