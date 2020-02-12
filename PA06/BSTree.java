import java.util.*;

public class BSTree<T extends Comparable<? super T>> implements Iterable {

    private int nelems;
    private BSTNode root;

    protected class BSTNode {

        T key;
        LinkedList<T> dataList;
        BSTNode left;
        BSTNode right;

        /**
         * A constructor that initializes the BSTNode instance variables.
         *
         * @param left      Left child
         * @param right      Right child
         * @param dataList Linked list of related info
         * @param key         Node's key
         */
        public BSTNode(BSTNode left, BSTNode right, LinkedList<T> dataList, T key) {
            
        }

        /**
         * A constructor that initializes BSTNode variables.
         * Note: This constructor is used when you want to add
         * a key with no related information yet. In this case,
         * you must create an empty LinkedList for the node.
         *
         * @param left Left child
         * @param right Right child
         * @param key    Node's key
         */
        public BSTNode(BSTNode left, BSTNode right, T key) {

        }

        /**
         * Return the key
         *
         * @return The key
         */
        public T getKey() {

        }

        /**
         * Return the left child of the node
         *
         * @return The left child of the node
         */
        public BSTNode getLeft() {

        }

        /**
         * Return the right child of the node
         *
         * @return The right child of the node
         */
        public BSTNode getRight() {

        }

        /**
         * Return the linked list of the node
         *
         * @return The linked list of the node
         */
        public LinkedList<T> getDataList() {

        }

        /**
         * Setter for left child of the node
         *
         * @param newleft New left child
         */
        public void setleft(BSTNode newleft) {

        }

        /**
         * Setter for right child of the node
         *
         * @param newright New right child
         */
        public void setright(BSTNode newright) {

        }

        /**
         * Setter for the linked list of the node
         *
         * @param newData New linked list
         */
        public void setDataList(LinkedList<T> newData) {

        }

        /**
         * Append new data to the end of the existing linked list of the node
         *
         * @param data New data to be appended
         */
        public void addNewInfo(T data) {

        }

        /**
         * Remove 'data' from the linked list of the node and return true.
         * If the linked list does not contain the value 'data', return false.
         *
         * @param data Info to be removed
         * @return True if data was found, false otherwise
         */
        public boolean removeInfo(T data) {

        }
    }

    //////////////////////////////////// BSTree methods here

    /**
     * 0-arg constructor that initializes root to null and nelems to 0
     */
    public BSTree() {
        
    }

    /**
     * Return the root of BSTree. Returns null if the tree is empty
     *
     * @return The root of BSTree, null if the tree is empty
     */
    public BSTNode getRoot() {
        
    }

    /**
     * Return the BST size
     *
     * @return The BST size
     */
    public int getSize() {
        
    }

    /**
     * Insert a key into BST
     * @param key
     * @return true if insertion is successful and false otherwise
     */
    public boolean insert(T key) {
        
    }

    /**
     * Return true if the 'key' is found in the tree, false otherwise
     *
     * @param key To be searched
     * @return True if the 'key' is found, false otherwise
     * @throws NullPointerException If key is null
     */
    public boolean findKey(T key) {
        
    }

    /**
     * Insert 'data' into the LinkedList of the node whose key is 'key'
     *
     * @param key  Target key
     * @param data To be added to key's LinkedList
     * @throws NullPointerException     If eaither key or data is null
     * @throws IllegalArgumentException If key is not found in the BST
     */
    public void insertData(T key, T data) {
        
    }

    /**
     * Return the LinkedList of the node with key value 'key'
     *
     * @param key Target key
     * @return LinkedList of the node whose key value is 'key'
     * @throws NullPointerException     If key is null
     * @throws IllegalArgumentException If key is not found in the BST
     */
    public LinkedList<T> findDataList(T key) {
        
    }

    /**
     * Perform a recursive inorder traversal of the BST and add
     * key values to the keyArray in order.
     *
     * @param keyArray BST keys are added to keyArray
     * @throws NullPointerException If BST is empty
     */
    public void inorderTraversal(T[] keyArray) {
        
    }

    /**
     * Helper for the inorderTraversal method
     *
     * @param root         Root node
     * @param keyArrayList BST keys are added to this keyArrayList
     */
    private void inOrderTraversalHelper(BSTNode root, ArrayList<T> keyArrayList) {
        
    }

    /**
     * Return the height of the tree
     *
     * @return The height of the tree, -1 if BST is empty
     */
    public int findHeight() {
        
    }

    /**
     * Helper for the findHeight method
     *
     * @param root Root node
     * @return The height of the tree, -1 if BST is empty
     */
    private int findHeightHelper(BSTNode root) {
        
    }

    /**
     * Return the number of leaf nodes in the tree
     *
     * @return The number of leaf nodes in the tree
     */
    public int leafCount() {
        
    }

    /**
     * Helper for the leafCount method
     *
     * @param root Root node
     * @return The number of leaf nodes in the tree
     */
    private int leafCountHelper(BSTNode root) {
        
    }

    /**
     * Replaces a key stored in BST with a new one
     *
     * @param oldKey Old key to be replaced
     * @param newKey New key to be replaced with old key
     */
    public void replaceKey(T oldKey, T newKey) {
        
    }

    /**
     * Removes a key from the BST
     *
     * @param key To be removed
     */
    private void remove(T key) {
        
    }

    /**
     * Helper for the remove method
     *
     * @param root Root
     * @param key  To be removed
     * @return The removed node
     */
    private BSTNode removeHelper(BSTNode root, T key) {
        
    }

    /**
     * Returns the smallest node from a given node
     *
     * @param root Smallest node will be found from this node
     * @return The smallest node from the 'root' node
     */
    private BSTNode findMin(BSTNode root) {
        
    }

    /**
     * Finds the parent of any given node
     *
     * @param node Node whose parent is going to be returned
     * @return The parent of 'node'
     */
    private BSTNode findParent(BSTNode node) {
        
    }

    /**
     * Helper for the findParent method
     *
     * @param currentRoot Current root
     * @param node        Node whose parent is going to be returned
     * @return The parent of 'node'
     */
    private BSTNode findParentHelper(BSTNode currentRoot, BSTNode node) {
        
    }

    //******************ITERATOR STARTS HERE!!!********************************
    public class BSTree_Iterator implements Iterator<T> {
        
    }

    public Iterator<T> iterator() {
        
    }

    //EXTRA CREDIT
    public ArrayList<T> intersection(Iterator<T> iter1, Iterator<T> iter2) {
        
    }
}
