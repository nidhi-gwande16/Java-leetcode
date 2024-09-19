class Solution {
    class Project{
        int capital;
        int profit;
        Project(int capital , int profit)
        {
            this.capital=capital;
            this.profit=profit;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        Project[] a1=new Project[capital.length];
        for(int i=0;i<capital.length;i++)
        {
            a1[i]=new Project(capital[i],profits[i]);
        }
        Arrays.sort(a1,new Comparator<Project>(){
            public int compare(Project p1,Project p2){
                return p1.capital-p2.capital;
            }
        });
        
        int i=0;
        PriorityQueue<Project> q=new PriorityQueue<>(new Comparator<Project>(){
            public int compare(Project p1,Project p2){
                return p2.profit-p1.profit;
            }
        });
        
        while(k-->0)
        {
            while(i<a1.length && a1[i].capital<= w)
            {
                q.add(a1[i]);
                i++;
            }
            if(q.size()==0)
                break;
            w=w+q.poll().profit;
        }
        return w;
    }
}