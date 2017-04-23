# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
import random

class Solution(object):

    def __init__(self, head):
        """
        @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node.
        :type head: ListNode
        """
        self.head = head


    def getRandom(self):
        """
        Returns a random node's value.
        :rtype: int
        """
        temp = self.head
        length = 0
        result = 0
        while temp != None:
            length += 1
            temp = temp.next
        index = random.randint(1, length)
        temp = self.head
        for i in range(index):
            result = temp.val
            temp = temp.next
        return result


# Your Solution object will be instantiated and called as such:
# obj = Solution(head)
# param_1 = obj.getRandom()
