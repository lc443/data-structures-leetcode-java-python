# https://www.youtube.com/watch?v=KLlXCFG5TnA

class TwoSum:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        prevMap = {} # mapping the value to its index
        
        for i, n in enumerate(nums):
            diff = target - n
            if diff in prevMap:
                return [prevMap[diff], i]
            prevMap[n] = i
        return

