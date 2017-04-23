class Solution(object):
    def frequencySort(self, s):
        """
        :type s: str
        :rtype: str
        """
        bucket = [0 for i in range(256)]
        result = ''
        for char in s:
            bucket[ord(char)] += 1
        bucketMax = max(bucket)
        while bucketMax != 0:
            index = bucket.index(bucketMax)
            count = bucket[index]
            while count > 0:
                result += chr(index)
                count -= 1
            bucket[index] = 0
            bucketMax = max(bucket)
        return result
