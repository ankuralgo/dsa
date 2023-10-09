package array;

import java.util.ArrayList;
import java.util.List;

public class MergeOverlappingIntervals {

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        ArrayList<Interval>  result = new ArrayList<Interval> ();

        Interval prev = intervals.get(0);
        Interval next = null ;
        int i =1;
        while (i < intervals.size()){
            next = intervals.get(i);;
            int start = prev.start;
            int end = prev.end;
            while( i < intervals.size()){
                if (prev.end > next.start) {
                    end = prev.end > next.end ? prev.end : next.end;
                    i++;
                }else{
                    break;
                }
            }
            Interval it = new Interval(0,0);
            it.start = start;
            it.end =end;
            result.add(it);
        }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<Interval> intervals = new ArrayList<>(){{
            add(new Interval(1,10));
            add(new Interval(2,9));
            add(new Interval(3,8));
            add(new Interval(6,6));
        }};

        MergeOverlappingIntervals m = new MergeOverlappingIntervals();
        List<Interval> result = m.merge(intervals);
        result.stream().forEach(System.out::print);
    }
}

class Interval{
    int start;
    int end;
    Interval(int start, int end){
        this.start= start;
        this.end= end;
    }

    @Override
    public String toString() {
        return "["+start +","+end+"]";
    }
}

