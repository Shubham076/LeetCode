import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * mergeIntervals
 */
public class mergeIntervals  {

    public static class Pair implements Comparable<Pair> {

        int start;
        int end;

        Pair(int start , int end){

            this.start = start;
            this.end = end;
        }

        @Override
        // if this.start > other.start return positive means this is placed after the other  
        public int compareTo(Pair other){

            if(this.start != other.start){
                return this.start - other.start;
            }

            else{
                return this.end - other.end;
            }
        }


    }

    

    public static void main(String[] args) {

        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        if(intervals.length <= 1){
            return ;
        }

        merge(intervals);
        

        
        
    }


    // using stack
    public static void merge(int[][] intervals){

        Pair[] pairs = new Pair[intervals.length];

        for(int i = 0 ; i < intervals.length ; i++){

            pairs[i] = new Pair( intervals[i][0] , intervals[i][1]);
        }

        Arrays.sort(pairs);
        
        // for(Pair i :pairs){
        //     System.out.print("("+i.start +" "+ i.end+") ");
        // }

        Stack<Pair> stack = new Stack<>();
        stack.push(pairs[0]);


        for( int i = 1 ; i < pairs.length ; i++){

            Pair top = stack.peek();

            if(pairs[i].start > top.end){

                stack.push(pairs[i]);
            }

            else{

                top.end = Math.max(top.end , pairs[i].end);
            }

        }

        Stack<Pair> res  = new Stack<>(); 
        while(!stack.isEmpty()){

            res.push(stack.pop());

        }

        while(!res.empty()){
            Pair p  = res.pop();
            System.out.print("("+p.start+" "+p.end+") ");
        }

    }


    // without using stack
    public static int[][] Merge(int[][] intervals){

    

        Arrays.sort(intervals , (arr1,arr2) -> Integer.compare(arr1[0], arr2[0]));
        ArrayList<int[]> res = new ArrayList<>();
        int[] curInterval = intervals[0];
        res.add(curInterval);

        for( int[] interval: intervals){

            int curBegin = curInterval[0];
            int curEnd = curInterval[1];

            int nextBegin = interval[0];
            int nextEnd = interval[1];

            if(curEnd >= nextBegin){

                curInterval[1] = Math.max(curEnd , nextEnd);
            }
            else{
                curInterval = interval;
                res.add(curInterval);
            }


        }

        return res.toArray( new int[res.size()][]);
        

    }
}