/**
 *  QuickFindUF
 *
 *  algorithm: quick-find 
 *  initialize: N
 *  union:      N 
 *  find:       1
 * 
 *  Quick-Find defect.
 *  - Union too expensive (N array accesses).
 *  - Trees are flat, but too expensive to keep them flat.
 */

public class QuickFindUF {

    private int[] id;

    public QuickFindUF(int N)
    {
        id = new int[N];
        // Set ID of each object to itself 
        //(N Array accesses)
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
            
    }
    public boolean connected(int p, int q)
    {
        // check whether p and q are in the same component 
        //(2 array accesses)
        return id(p) == id(q);
    }

    public void union(int p, int q)
    {
        // change all entries with id[p] to id[q]
        // (At most 2N + 2 array accesses)
        int pid = id(p);
        int qid = id(q);
        for (int i = 0; i < id.length; i++){
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}