import itertools

table = ...
count = 0
for i in range(0, len(table)+1):
  for subset in itertools.combinations(table, i):
    if sum(subset) == 150:
        count += 1
print(count)
