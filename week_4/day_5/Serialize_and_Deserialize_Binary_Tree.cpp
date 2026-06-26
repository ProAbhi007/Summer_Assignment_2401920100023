#include <iostream>
#include <sstream>
#include <string>
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

class Codec {
public:

    void serializeHelper(TreeNode* root, string& str) {
        if (root == nullptr) {
            str += "#,";
            return;
        }

        str += to_string(root->val) + ",";
        serializeHelper(root->left, str);
        serializeHelper(root->right, str);
    }

    string serialize(TreeNode* root) {
        string str;
        serializeHelper(root, str);
        return str;
    }

    TreeNode* deserializeHelper(stringstream& ss) {
        string val;
        getline(ss, val, ',');

        if (val == "#")
            return nullptr;

        TreeNode* root = new TreeNode(stoi(val));

        root->left = deserializeHelper(ss);
        root->right = deserializeHelper(ss);

        return root;
    }

    TreeNode* deserialize(string data) {
        stringstream ss(data);
        return deserializeHelper(ss);
    }
};

void preorder(TreeNode* root) {
    if (root == nullptr) {
        cout << "# ";
        return;
    }

    cout << root->val << " ";
    preorder(root->left);
    preorder(root->right);
}

int main() {
    TreeNode* root = new TreeNode(1);

    root->left = new TreeNode(2);

    root->right = new TreeNode(3);
    root->right->left = new TreeNode(4);
    root->right->right = new TreeNode(5);

    Codec obj;

    string data = obj.serialize(root);

    cout << "Serialized: " << data << endl;

    TreeNode* newRoot = obj.deserialize(data);

    cout << "Preorder after Deserialization: ";
    preorder(newRoot);

    return 0;
}