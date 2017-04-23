class Solution(object):
    def countBattleships(self, board):
        """
        :type board: List[List[str]]
        :rtype: int
        """
        result = 0
        lst = [[1 for j in range(len(board[0]))] for i in range(len(board))]
        dec = [[0 for j in range(len(board[0]))] for i in range(len(board))]
        for i in range(len(board)):
            for j in range(len(board[i])):
                if lst[i][j] == 1 and board[i][j] == 'X':
                    lst[i][j] = 0
                    result = result + 1
                    k = 1
                    while i+k < len(board) and lst[i+k][j] == 1 and board[i+k][j] == 'X':
                        lst[i+k][j] = 0
                        k = k + 1
                    k = 1
                    while j+k < len(board[i]) and lst[i][j+k] == 1 and board[i][j+k] == 'X':
                        lst[i][j+k] = 0
                        k = k + 1
        return result
