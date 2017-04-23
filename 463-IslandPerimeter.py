class Solution(object):
    def islandPerimeter(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        length = 0
        for i in range(len(grid)):
            for j in range(len(grid[i])):
                if grid[i][j] == 1:
                    count = 0
                    if i == 0 or grid[i-1][j] == 0:
                        count = count + 1
                    if i == len(grid) - 1 or grid[i+1][j] == 0:
                        count = count + 1
                    if j == 0 or grid[i][j-1] == 0:
                        count = count + 1
                    if j == len(grid[i]) - 1 or grid[i][j+1] == 0:
                        count = count + 1
                    length = length + count
        return length
