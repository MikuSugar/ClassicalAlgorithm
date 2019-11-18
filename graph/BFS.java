package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * author:fangjie
 * time:2019/11/18
 */
public class BFS {
    /**
     * 求start到end的最短路径
     * 假定节点之间的权重为1 否则BFS不适合求最短路径
     * @param n 节点数 节点从1-n
     * @param edges 边的集合，e[0]到e[1],权值e[2]
     * @param start 起点
     * @param end 终点
     * @return
     */
    public static int getMinLen(int n,int[][] edges,int start,int end)
    {
        if(start==end)return 0;
        //建图
        List<int[]>[] graphs=GraphUtils.getGraphs(n, edges);

        //BFS
        Queue<Integer> queue=new LinkedList<>();
        queue.add(start);
        int res=0;
        boolean[] book=new boolean[n+1];
        while (!queue.isEmpty())
        {
            int size=queue.size();
            res++;
            while (size-->0)
            {
                int cur=queue.poll();
                for (int[] next:graphs[cur])
                {
                    int nextP=next[0];
                    if(book[nextP])continue;
                    if(nextP==end)return res;
                    book[nextP]=true;
                    queue.add(nextP);
                }
            }
        }
        return -1;
    }
}

