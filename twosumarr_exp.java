class twosumarr_exp{
    public static int[] twosum(int[] nums,int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] result=twosum(nums,target);
        if(result!=null)
        {
            System.out.println("Indices:"+result[0]+","+result[1]);
        }
        else
        {
            System.out.println("No paiirs found");
        }
    }
}