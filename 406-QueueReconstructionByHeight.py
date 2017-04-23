class Solution(object):
    def reconstructQueue(self, people):
        """
        :type people: List[List[int]]
        :rtype: List[List[int]]
        """
        queue = []
        for p in sorted(people, key=lambda (h, t): (-h, t)):
            queue.insert(p[1], p)
        return queue
