class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        right = sum(nums)
        left = 0
        ret = []
        for n in nums:
            right -= n
            ret.append(abs(left - right))
            left += n
        
        return ret
