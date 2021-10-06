#GITHUB :dharmateja03
# Kadens Algo / Max contiguous sum in an array
l=list(map(int,input().split())) # enter numbers follwed by a space/Tab
n=len(l)
max_so_far = a[0]
max_ending_here = 0
for i in range(n):
  max_ending_here = max_ending_here + a[i]
  if max_ending_here < 0:
      max_ending_here = 0
  elif (max_so_far < max_ending_here):
      max_so_far = max_ending_here
print(max_so_far)
