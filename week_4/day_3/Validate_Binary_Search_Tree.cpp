#include <iostream>
#include <climits>
using namespace std;

struct TreeNode {
    int val;
    TreeNode* left;
    TreeNode* right;

    TreeNode(int x) {
        val = x;
        left = nullptr;
        right = nullptr;
    }
};

class Solution {
public:
    bool isValid(TreeNode* root, long long low, long long high) {
        if (root == nullptr)
            return true;

        if (root->val <= low || root->val >= high)
            return false;

        return isValid(root->left, low, root->val) &&
               isValid(root->right, root->val, high);
    }

    bool isValidBST(TreeNode* root) {
        return isValid(root, LLONG_MIN, LLONG_MAX);
    }
};

int main() {
    TreeNode* root = new TreeNode(2);
    root->left = new TreeNode(1);
    root->right = new TreeNode(3);

    Solution obj;

    if (obj.isValidBST(root))
        cout << "true";
    else
        cout << "false";

    return 0;
}