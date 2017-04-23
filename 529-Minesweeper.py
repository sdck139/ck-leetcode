class Solution(object):
    def updateBoard(self, board, click):
        """
        :type board: List[List[str]]
        :type click: List[int]
        :rtype: List[List[str]]
        """
        self.board = board
        self.H = len(board)
        self.W = len(board[0])
        self.open(click[0], click[1])
        return self.board

    def open(self, x, y):
        if self.board[x][y] == 'M':
            self.board[x][y] = 'X'
            return
        count = 0
        for i in range(x-1, x+2):
            for j in range (y-1, y+2):
                if i >= 0 and i < self.H and j >= 0 and j < self.W and not (i == x and j == y) and self.board[i][j] == 'M':
                    count += 1
        if count > 0:
            self.board[x][y] = str(count)
        else:
            self.board[x][y] = 'B'
            for i in range(x-1, x+2):
                for j in range (y-1, y+2):
                    if i >= 0 and i < self.H and j >= 0 and j < self.W and not (i == x and j == y) and self.board[i][j] == 'E':
                        self.open(i, j)

            
