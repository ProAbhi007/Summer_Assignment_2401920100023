class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {

        deque<int> dq;
        vector<int> result;

        for (int i = 0; i < nums.size(); i++) {

            // Remove elements outside window
            while (!dq.empty() && dq.front() <= i - k)
                dq.pop_front();

            // Maintain decreasing order
            while (!dq.empty() &&
                   nums[dq.back()] <= nums[i])
                dq.pop_back();

            dq.push_back(i);

            // Window formed
            if (i >= k - 1)
                result.push_back(nums[dq.front()]);
        }

        return result;
    }
};