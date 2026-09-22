class Solution {
public:
    vector<int> smallestRange(vector<vector<int>>& nums) {

        priority_queue<tuple<int, int, int>, vector<tuple<int, int, int>>, greater<>> minHeap;

        int maxVal = INT_MIN;
        int start = 0, end = INT_MAX;


        for (int i = 0; i < nums.size(); ++i) {
            minHeap.emplace(nums[i][0], i, 0);
            maxVal = max(maxVal, nums[i][0]);
        }

        while (minHeap.size() == nums.size()) {
            auto [minVal, row, idx] = minHeap.top();
            minHeap.pop();


            if (maxVal - minVal < end - start) {
                start = minVal;
                end = maxVal;
            }


            if (idx + 1 < nums[row].size()) {
                int nextVal = nums[row][idx + 1];
                minHeap.emplace(nextVal, row, idx + 1);
                maxVal = max(maxVal, nextVal);
            }
        }

        return {start, end};
    }
};