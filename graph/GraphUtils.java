package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * author:fangjie
 * time:2019/11/18
 */
public class GraphUtils {
    /**
     * 获取邻接表
     * @param  n 节点数 节点从1-n
     * @param edges 边的集合，e[0]到e[1],权值e[2]
     * @return 领接表
     */
    public static List<int[]>[] getGraphs(int n, int[][] edges) {
        List<int[]>[] graphs=new List[n+1];
        for (int i=0;i<graphs.length;i++)graphs[i]=new ArrayList<>();
        for (int[] edge:edges) graphs[edge[0]].add(new int[]{edge[1],edge[2]});
        return graphs;
    }
}
