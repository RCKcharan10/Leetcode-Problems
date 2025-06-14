# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def insertIntoBST(self, root, val):
        """
        :type root: Optional[TreeNode]
        :type val: int
        :rtype: Optional[TreeNode]
        """
        new_node = TreeNode(val)
        if not root:
            return new_node
        current = root
        while True:
            if val < current.val:
                if current.left:
                    current = current.left
                else:
                    current.left = new_node
                    break
            else:
                if current.right:
                    current = current.right
                else:
                    current.right = new_node
                    break
        return root