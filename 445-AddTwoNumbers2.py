# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        def toInt(ln):
            num = 0
            while ln != None:
                num = num * 10 + ln.val
                ln = ln.next
            return num
        def toLn(num):
            if num == 0:
                return ListNode(0)
            temp = None
            while num > 0:
                temp1, temp = temp, ListNode(num % 10)
                temp.next = temp1
                num = num / 10
            return temp
        ln1, ln2 = toInt(l1), toInt(l2)
        return toLn(ln1 + ln2)
