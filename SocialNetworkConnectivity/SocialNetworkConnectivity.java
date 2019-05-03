import jdk.jfr.Timestamp;

/**
 *   Given a social network containing nn members and a log file containing mm timestamps at which times pairs of members formed friendships, 
 * design an algorithm to determine the earliest time at which all members are connected 
 * (i.e., every member is a friend of a friend of a friend ... of a friend). 
 * Assume that the log file is sorted by timestamp and that friendship is an equivalence relation. 
 * The running time of your algorithm should be m log m or better and use extra space proportional to nn.
 */

public class Main {
    public static void main(String[] args) {
        String x = "Hello world";
        System.out.println(x);
    }
}

public class Member {
    private int id;
    private String name;

    public Member(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }
}
public class LogEntry {
    private Timestamp timestamp;
    private int friendAId;
    private int friendBId;

    public LogEntry(Timestamp timestamp, int friendAId, int friendBId) 
    {
        this.timestamp = timestamp;
        this.friendAId = friendAId;
        this.friendBId = friendBId;
    }
}

public class Log {
    private 
}

public class SocialNetworkAgeConnector {

}
public class QuickUnionUF {

    private int[] id;

    public QuickUnionUF(int N)
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
        id[i] = j;
    }

    public int[] getID() {
        return this.id;
    }  
}