import java.util.NoSuchElementException;
/**
 * TODO
 * @param <T> Generics
 */
public class BinaryHeap <T extends Comparable<? super T>> {

    private static final int DEFAULT_CAPACITY = 5; // default initial capacity
    private static final int EXPAND_FACTOR    = 2; // resizing factor

    private T[] heap;          // heap array
    private int nelems;        // number of elements
    private boolean isMaxHeap; // boolean to indicate whether heap is max or min

    /**
     * Initializes a binary max heap with capacity = 5
     */
    @SuppressWarnings("unchecked")
    public BinaryHeap() {
        /* TODO */
    }
    /**
     * Initializes a binary max heap with a given initial capacity.
     *
     * @param heapSize The initial capacity of the heap.
     */
    @SuppressWarnings("unchecked")
    public BinaryHeap(int heapSize) {
        /* TODO */
    }

    /**
     * Initializes a binary heap with a given initial capacity.
     * @param heapSize The initial capacity of the heap.
     * @param isMaxHeap indicates whether the heap should be max or min
     */
    @SuppressWarnings( "unchecked" )
    public BinaryHeap(int heapSize, boolean isMaxHeap) {
        /* TODO */
    }

    /**
     * Returns the number of elements stored in the heap.
     *
     * @return The number of elements stored in the heap.
     */
    public int size() {
        /* TODO */
        return 0;
    }

    /**
     * Clears all the items in the heap
     * Heap will be empty after this call returns
     */
    @SuppressWarnings("unchecked")
    public void clear() {
        /* TODO */
    }

    /**
     * Adds the specified element to the heap; data cannot be null.
     * Resizes the storage if full.
     * @param data The element to add.
     * @throws NullPointerException if o is null.
     */
    public void add( T data ) throws NullPointerException {
        /* TODO */
    }

    /**
     * Removes and returns the element at the root. If the
     * heap is empty, then this method throws a NoSuchElementException.
     * @return The element at the root stored in the heap.
     * @throws java.util.NoSuchElementException if the heap is empty
     */
    public T remove() throws NoSuchElementException {
        /* TODO */
        return null;
    }

    /**
     * Retrieves, but does not remove, the element at the root.
     * @return item at the root of the heap
     * @throws NoSuchElementException - if this heap is empty
     */
    public T element() throws NoSuchElementException {
        /* TODO */
        return null;
    }

    /**
     * Bubble up the element until the ordering property of the heap
     * is satisfied
     * @param index the index of the element to be trickled down
     */
    private void bubbleUp(int index) {
        /* TODO */
    }

    /**
     * Trickle down the element until the ordering property of the heap
     * is satisfied
     * @param index the index of the element to be trickled down
     */
    private void trickleDown(int index) {
        /* TODO */
    }

    /**
     * Double the size of the heap
     */
    @SuppressWarnings("unchecked")
    private void resize() {
        /* TODO */
    }

}
