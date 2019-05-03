/**
 *  QuickUnionFind
 *
 *  algorithm:  weighted QU
 *  initialize: N
 *  union:      lg N † includes cost of finding roots
 *  find:       lg N
 * 
 *  Quick-union defect.
 *   - Trees can get tall.
 *   - Find too expensive (could be N array accesses).
 */

public class WeightedQuickUnionUF {

    private int[] id;
    private int[] sz;

    public WeightedQuickUnionUF(int N)
    {
        id = new int[N];
        // Set ID of each object to itself 
        //(N Array accesses)
        for (int i = 0; i < N; i++) id[i] = i;
    }
    private int root(int i)
    {
        // chase parent pointers until reach root 
        //(depth of i array access)
        while (i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(int p, int q)
    {
        // check if p and q have same root 
        //(depth of p and q array accesses)
        return root(p) == root(q);
    }

    public void union(int p, int q)
    {
        // change root of p to point to root of q
        // (depth of p and q array accesses)
        int i = root(p);
        int j = root(q);
        if (i == j) return;
        if (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i]; }
        else { id[j] = i; sz[i] += sz[j]; } 
    }
}