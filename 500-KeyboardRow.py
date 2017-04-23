class Solution(object):
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        keyboard = ['qwertyuiop', 'asdfghjkl', 'zxcvbnm']
        result = []
        for word in words:
            if len(word) == 1:
                result.append(word)
                continue
            item = 0
            for j in range(len(word)):
                if j == 0:
                    for i in range(len(keyboard)):
                        if keyboard[i].find(word[j].lower()) != -1:
                            item = i
                            break
                else:
                    if keyboard[item].find(word[j].lower()) == -1:
                        break
                    if j == len(word) - 1:
                        result.append(word)
        return result
                
