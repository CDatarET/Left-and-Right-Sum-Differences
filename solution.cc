class Solution {
public:
    vector<int> leftRightDifference(vector<int>& nums) {
        int right = 0;
        for(int i = 0; i < nums.size(); i++) right += nums[i];

        int left = 0;
        vector<int> v;
        for(int i = 0; i < nums.size(); i++){
            right -= nums[i];
            v.push_back(std::abs(left - right));
            left += nums[i];
        }

        return v;
    }
};
