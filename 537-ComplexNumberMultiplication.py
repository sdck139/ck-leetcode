class Solution(object):
    def complexNumberMultiply(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        a1, a2 = self.strToInt(a)
        b1, b2 = self.strToInt(b)
        return str(a1*b1-a2*b2) + "+" + str(a1*b2 + a2*b1) + "i"
    def strToInt(self, a):
        strs = a.split("+")
        return int(strs[0]), int(strs[1][:-1])
