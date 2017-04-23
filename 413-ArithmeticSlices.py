class Solution(object):
    def numberOfArithmeticSlices(self, A):
        """
        :type A: List[int]
        :rtype: int
        """
        d = [0 for x in range(len(A))]
        start = 0
        result = 0
        for i in range(1, len(A)):
            d[i]=A[i]-A[i-1]
            if i>2 and d[i] != d[i-1] and d[i-1]==d[i-2]:
                result = result + (i-start-1)*(i-start-2)/2
            if i>1 and d[i]!=d[i-1] and d[i-1]==d[i-2]:
                start=i
            if i>1 and d[i]!=d[i-1] and d[i-1]!=d[i-2]:
                start=i-1
            if i == len(A) - 1 and i - start > 1:
                result=result+(i-start)*(i-start-1)/2
        return result

            
