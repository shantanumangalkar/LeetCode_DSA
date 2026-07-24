/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakElement(mountainArr);
        int fisttry=binaryserch(target,mountainArr,0,peak,true);
        if(fisttry!=-1){
            return fisttry;
        }
        return binaryserch(target,mountainArr,peak+1,mountainArr.length()-1,false);

    }
    public int findPeakElement(MountainArray mountainArr) {
           int start=0;
        int end=mountainArr.length()-1;
        while(start<end){
            int mid=(start+end)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end=mid;
            }
            else if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                start=mid+1;
            }
            
        }
        return end;
    }
    public int binaryserch(int target,MountainArray mountainArr,int start,int end,boolean asc){
             while(start<=end){
                int mid=(start+end)/2;
                int value= mountainArr.get(mid);
                if (value == target)
                return mid;
                if(asc){
                    if(value<target){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                }
                else{
                    if(target<value){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                }
                
             }
             return -1;
    }
}
