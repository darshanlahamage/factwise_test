package Q5;

public class Q5solution {
    public static int solution(int[] gas, int[] cost){
        int totalgas=0, totalcost=0;
        for(int i=0;i<gas.length;i++){
            totalgas += gas[i];
            totalcost += cost[i];
        }
        if(totalgas <totalcost){
            return -1;
        }

        int remainingas =0, start=0;
        for(int i=0;i<gas.length;i++){
            remainingas  = remainingas + (gas[i]-cost[i]);
            if(remainingas<0){
                start = i+1;
                remainingas =0;
            }
        }
        return start;
    }
    public static void main(String [] args){
        int gas[] = {1,2,3,4,5};
        int cost[] = {3,4,5,1,2};
        System.out.println(solution(gas,cost));
        
   }
}
