class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
//         System.out.println(Arrays.toString(tasks));
//         int rounds=0;
//         int arr[]=new int[tasks.length];
//         System.out.println(arr.length);
//         for(int i=0;i<arr.length-1;i++)
//         {
//             arr[tasks[i]]++;
//         }
//         System.out.println(Arrays.toString(arr));
        
//         for(int i=0;i<arr.length-1;i++)
//         {
//             if(arr[i]==2||arr[i]==3)
//             {
//                 System.out.println("T");
//                 rounds++;
//             }
//                 else if(arr[i]==1)
//             {
//                 System.out.println("TT");
//                 return -1;
//             }
//             else if(arr[i]==0)
//                 continue;
//             else
//             {
//                 int mul=arr[i]/3;
//                 rounds+=mul;
//                 arr[i]-=3*mul;
//                 System.out.println(arr[i]);
//                 System.out.println(mul);
//                 if(arr[i]==1)
//                     rounds++;
//                 else if(arr[i]==2)
//                     rounds++;
//             }
                
//         }
//         return rounds;
        
        System.out.println(Arrays.toString(tasks));
        int round=0;
        int count=0;
        for(int i=0;i<tasks.length-1;i++)
        {
            if(tasks[i]==tasks[i+1])
            {
                System.out.println("Yes2");
                count++;
            }
            else
            {
                count++;
                if(count==2||count==3)
                {
                    System.out.println("Yes1");
                    round++;
                }
                else if(count>3)
                {
                    System.out.println("Yes");
                    int dif=count/3;
                    round=round+dif;
                    if(count%3==1||count%3==2)
                        round++;
                }
                else //count==1;
                    return -1;
                System.out.println(count);
                count=0;
            }
        }
        if(count>0)
            {
                count++;
                if(count==2||count==3)
                {
                    System.out.println("Yes1");
                    round++;
                }
                else if(count>3)
                {
                    System.out.println("Yes");
                    int dif=count/3;
                    round=round+dif;
                    if(count%3==1||count%3==2)
                        round++;
                }
                else //count==1;
                    return -1;
        }
        if(tasks.length==1)
            return -1;
        if(tasks[tasks.length-1]!=tasks[tasks.length-2])
            return -1;
        else
            
        return round;
    }
}
