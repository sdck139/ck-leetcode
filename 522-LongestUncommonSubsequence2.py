class Solution(object):
    def findLUSlength(self, strs):
        """
        :type strs: List[str]
        :rtype: int
        """

        def isSub(sm, sb):
            start = 0
            for i in range(len(sm)):
                lstart = start
                for j in range(start, len(sb)):
                    if sm[i] == sb[j]:
                        start = j + 1
                        break
                if lstart == start:
                    return False
            return True

        stack = []
        while len(strs) > 0:
            sMax = max(strs, key=len)
            strs.remove(sMax)
            if sMax in strs:
                stack.append(sMax)
                while sMax in strs:
                    strs.remove(sMax)
            else:
                noture = False
                for s in stack:
                    if isSub(sMax, s):
                        noture = True
                if not noture:
                    return len(sMax)
        return -1

        
