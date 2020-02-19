/*
 * NAME: xxxxxxxxx
 * PID: Axxxxxxxx
 */

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Binomial Heap Implementation
 *
 * @author First Last
 * @since ${date}
 */
public class BinomialHeap<T extends Comparable<? super T>>  implements binomialHeapInterface<T> {


    private static final int DEFAULT = 5; // default size for the binomial heap
    public Node<T>[] forest;
    private int n;
    private boolean isMaxHeap;

    /**
     * Node Class for nodes in Binomial Heap
     */
    protected class Node<T> {
        private T value;
        private int degree;
        private LinkedList<Node<T>> children;

        /**
         * Node Constructor
         * @param x -> key value of the node
         */
        public Node(T x) {
            /* TODO */
        }

        /**
         * method to add children to node
         * @param node the new child of this node
         */
        public void addChild(Node node) {
            /* TODO */
        }

        /**
         * Getter method for degree
         *
         * @return degree of the current node
         */
        public int getDegree() {
            /* TODO */
            return 0;
        }

        /**
         * Getter method for the value of the node
         * @return value of the node
         */
        public T getValue() {
            /* TODO */
            return null;
        }

        /**
         * getter method for the children
         * @return the children of a node
         */
        public LinkedList<Node<T>> getChildren() {
            /* TODO */
            return null;
        }
    }

    /**
     * Initializes a binomial max heap with capacity = 5
     */
    public BinomialHeap() {
        /* TODO */
    }

    /**
     * Initializes a binomial max heap with a given initial capacity.
     *
     * @param heapSize The initial capacity of the heap.
     */
    public BinomialHeap(int heapSize) {
        /* TODO */
    }

    /**
     * Initializes a binomial heap (with a given value for d), with a given
     * initial capacity.
     *
     * @param heapSize The initial capacity of the heap.
     * @param isMaxHeap indicates whether the heap should be max or min
     */
    public BinomialHeap(int heapSize, boolean isMaxHeap) {
        /* TODO */
    }

    /**
     * size of the heap
     * @return number of elements in heap
     */
    public int size() {
        /* TODO */
        return 0;
    }

    /**
     * clears the Binomial Heap
     */
    public void clear() {
        /* TODO */
    }

    /**
     * Add element to the binomial Heap
     * @param o The element to add.
     * @throws NullPointerException if o is null
     */
    public void add(T o) {
        /* TODO */
    }

    /**
     * Helper Method for inserting elements into the Binomial Heap
     * @param node node to insert into forest
     */
    private void insertHelper(Node<T> node) {
        /* TODO */
        // hint 1: the 'node' of degree k is going to be placed at forest[k]
        // hint 2: consider how this helper can be used in the add and remove method
        // attempt to place 'node' in forest degree of the Node (for the rest, assume degree of 'node' is k)
            // if forest[k] is empty, place 'node' at forest[k]
            // if forest[k] contains a Node:
                // compare 'node' and forest[k] -> one of these becomes the child of the other 
                // (consider using the addChild method of Node)
                // 'node' <-- the non-child of the either 'node' and forest[k]
                // return back to the first step of trying to place 'node' into forest
                    // note: because I have added a child, the degree of 'node' has increased by 1
        // if my forest wasn't big enough for the 'node' (consider how I can tell if this is true):
            // resize the forest & place the 'node' in the appropriate spot. 
    }

    /**
     * compareTo wrapper to take care of Max Heap & Min Heap Implementation
     *
     * @param node1 first node
     * @param node2 second node
     * @return compareTo values between node1 and node2 relative to the Heap type
     */
    private Boolean compareToWrapper(Node<T> node1, Node<T> node2) {
        /* TODO */
        return false;
    }

    /**
     * remove method for binomial heap
     * @return removes the min/max from the heap
     * @throws NoSuchElementException if heap is empty
     */
    public T remove() throws NoSuchElementException {
        /* TODO */
        return null;
    }

    /**
     * Find the index of extrema
     * @return index of extrema
     */
    private int findExtrema() {
        /* TODO */
        return 0;
    }

    /**
     * resizes the forest
     */
    private void resize() {
        /* TODO */
    }

    /**
     * looks at top element
     * @return returns min/max relative to heap type
     * @throws NoSuchElementException if heap is empty
     */
    public T element() throws NoSuchElementException {
        /* TODO */
        return null;
    }


    /*************** EXTRA CREDIT PROBLEMS ***************/

    /**
     * Find all elements in the max-heap that is greater than k.
     * Return an empty list if current heap is a min-heap.
     * @param k threshold
     * @return LinkedList of elements greater than k
     */
    public LinkedList findGreaterThanK(T k) {
        /* TODO */
        return null;
    }

    /**
     * Find the sum of all elements between num1-th smallest element and
     * num2-th smallest element.
     * @param a an array of numbers
     * @param num1 lower bound
     * @param num2 upper bound
     * @return the sum of all elements in this range
     */
    public int findSum(int[] a, int num1, int num2) {
        /* TODO */
        return 0;
    }

}
