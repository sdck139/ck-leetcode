class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        result = []
        for i in range(n):
            if (i+1) % 15 == 0:
                result.append("FizzBuzz")
            elif (i+1) % 5 == 0:
                result.append("Buzz")
            elif (i+1) % 3 == 0:
                result.append("Fizz")
            else:
                result.append(str(i+1))
        return result
