class Solution(object):
    def detectCapitalUse(self, word):
        """
        :type word: str
        :rtype: bool
        """
        if len(word) == 1:
            return True
        if self.isLow(word[0]):
            for i in range(1, len(word)):
                if not self.isLow(word[i]):
                    return False
            return True
        else:
            if self.isLow(word[1]):
                for i in range(1, len(word)):
                    if not self.isLow(word[i]):
                        return False
            else:
                for i in range(1, len(word)):
                    if self.isLow(word[i]):
                        return False
            return True

    def isLow(self, letter):
        return letter >= 'a'
