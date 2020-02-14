/*
 * Author: TODO
 * Date: TODO
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 */
public class SearchEngine {

    /**
     * Populate BSTrees from a file
     * @param movieTree - BST to be populated with actors
     * @param studioTree - BST to be populated with studios
     * @param ratingTree - BST to be populated with ratings
     * @param fileName - name of the input file
     * @returns false if file not found, true otherwise
     */
    public static boolean populateSearchTrees(BSTree<String> movieTree,
                                             BSTree<String> studioTree,
                                             BSTree<String> ratingTree,
                                             String fileName) {
        
    }

    /*Search a query in a BST
     * @param searchTree - BST to be searched
     * @param fileName - query string
     * @returns LinkedList of documents in which the query string is found
     */
    public static void searchMyQuery(BSTree<String> searchTree, String query) {
        
    }

    /**
     * Print output of query
     * @param query Query used to search tree
     * @param documents Output of documents from query
     */
    public static void print(String query, LinkedList<String> documents) {
        if(documents==null || documents.isEmpty())
            System.out.println("The search yielded no results for "+query);
        else {
            Object[] converted = documents.toArray();
            Arrays.sort(converted);
            System.out.println("Documents related to "+ query +" are: "+Arrays.toString(converted));
        }
    }
    
    public static void main( String[] args ) {
        
    }
}
