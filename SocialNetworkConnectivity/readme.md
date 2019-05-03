Social network connectivity. Given a social network containing nn members and a log file containing mm timestamps at which times pairs of members formed friendships, design an algorithm to determine the earliest time at which all members are connected (i.e., every member is a friend of a friend of a friend ... of a friend). Assume that the log file is sorted by timestamp and that friendship is an equivalence relation. The running time of your algorithm should be 'm log n' or better and use extra space proportional to 'n'.

Solution process:
We should ensure our Union-Find algorithm sorts the node route by the oldest timestamp available,  and then ensures that each node is flattened to this timestamp using a weighted quick-union. This should allow a look up of any relationship to refer to the oldest relationship node in log n time. 


Assuming array 