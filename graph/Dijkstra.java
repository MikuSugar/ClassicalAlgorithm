package graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * author:fangjie
 * time:2019/11/8
 */
public class Dijkstra {
    /**
     * 求start到end的最短路径
     * @param n 节点数 节点从1-n
     * @param edges 边的集合，e[0]到e[1],权值e[2]
     * @param start 起点
     * @param end 终点
     * @return
     */
    public static int getMinLen(int n,int[][] edges,int start,int end)
    {
        if (start==end)return 0;
        //建图
        List<int[]>[] graphs=GraphUtils.getGraphs(n, edges);

        //堆优化的Dijkstra
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(o->o[1]));
        int res=Integer.MAX_VALUE;
        pq.add(new int[]{start,0});
        boolean[] book=new boolean[n+1];
        while (!pq.isEmpty())
        {
            int[] cur=pq.poll();
            for (int[] next:graphs[cur[0]])
            {
                if(book[next[0]])continue;
                if(next[0]==end)
                {
                    res=Math.min(res,next[1]+cur[1]);
                    continue;
                }
                book[next[0]]=true;
                pq.add(new int[]{next[0],cur[1]+next[1]});
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }


}
