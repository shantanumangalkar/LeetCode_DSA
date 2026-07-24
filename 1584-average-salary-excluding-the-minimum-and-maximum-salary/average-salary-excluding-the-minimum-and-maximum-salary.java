class Solution {
    public double average(int[] salary) {
        for(int i=0;i<salary.length;i++){
            for(int j=1;j<salary.length;j++){
            if(salary[j-1]>salary[j]){
                int temp=salary[j-1];
                salary[j-1]=salary[j];
                salary[j]=temp;
            }
            }
        }
        double sum=0;
        for(int k=1;k<salary.length-1;k++){
            sum= sum+salary[k];
        }
        double avg= sum/(salary.length-2);
        return avg;
    }
}