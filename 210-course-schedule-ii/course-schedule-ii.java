class Solution {
    class edge{
        int src;
        int dest;
        public edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public void createG(ArrayList<edge>[] graph, int[][] p){
        for(int i = 0;i < graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0;i < p.length;i++){
            int sr = p[i][1];
            int de = p[i][0];
            graph[sr].add(new edge(sr,de));
        }
    }
    public void calIn(ArrayList<edge>[] a, int[] indeg){
        for(int i = 0;i < a.length;i++){
            for(int j = 0;j < a[i].size();j++){
                edge e = a[i].get(j);
                indeg[e.dest]++;
            }
        }
    }
    public void top(ArrayList<edge>[] a,int[] ans){
        int idx = 0;
        int[] indeg = new int[a.length];
        calIn(a,indeg);

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i < indeg.length;i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int x = q.poll();
            ans[idx++] = x;
            for(int i = 0;i < a[x].size();i++){
                edge e = a[x].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
    }
    public boolean isCycle(ArrayList<edge>[] g){
        boolean[] vis = new boolean[g.length];
        boolean[] stk = new boolean[g.length];
        for(int i = 0;i < g.length;i++){
            if(vis[i] == false){
                if(dfs(g,vis,stk,i)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(ArrayList<edge>[] g,boolean[] vis,boolean[] stk,int curr){
        vis[curr] = true;
        stk[curr] = true;
        for(int i = 0;i < g[curr].size();i++){
            edge e = g[curr].get(i);
            if(vis[e.dest] == false && dfs(g,vis,stk,e.dest)){
                return true;
            }
            else if(stk[e.dest] == true){
                return true;
            }
        }
        stk[curr] = false;
        return false;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        ArrayList<edge>[] graph = new ArrayList[n];
        int[] ans =  new int[n];
        createG(graph,prerequisites);
        top(graph,ans);
        if(isCycle(graph)){
            return new int[0];
        }
        return ans;
    }
}