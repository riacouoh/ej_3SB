
sales = [[1, 2, 3], [4, 5, 6], [7, 8, 9], [1, 2, 3], [4, 5, 6], 
               [7, 8, 9], [1, 2, 3], [4, 5, 6], [7, 8, 9], [1, 2, 3], [4, 5, 6], [7, 8, 9]]

for r in sales:
   for c in r:
      print(c,end = " ")
   print()

sales.insert(2,[1])