package com.atlassian;




import java.util.*;
import java.util.stream.Collectors;


/*

    Vote{
        Candidate1 (point:3)
        Candidate2 (point:2)
        Candidate3 (point:1)
    }

    Vote{
        Candidate1 (point:3)
        Candidate2 (point:2)
        Candidate3 (point:1)
    }



 */

class Candidate{

    public String name;
    public String empID;

    public Candidate(String name, String empID) {
        this.name = name;
        this.empID = empID;
    }

    public String getUniqueID(){
        return name+"_"+empID;
    }
}

class Vote{

    public Vote(){
        candidates =  new ArrayList<>();
    }
    public List<Candidate> candidates;

}
public class Solutions {


    public static void main(String[] args) {
        Candidate c1 = new Candidate("C1", "emp1");
        Candidate c2 = new Candidate("C2", "emp2");

        Vote v1 = new Vote();
        v1.candidates.add(c1);
        v1.candidates.add(c2);

        Vote v2 = new Vote();
        v2.candidates.add(c2);
        v2.candidates.add(c1);

        Vote v3 = new Vote();
        v3.candidates.add(c1);
        v3.candidates.add(c2);

        Solutions s = new Solutions();
        List<Vote> votes = new ArrayList<>();
        votes.add(v1);
        votes.add(v2);
        votes.add(v3);

        s.findWinner(votes).forEach( s1 -> System.out.println(s1));


    }

    /**
     * For a list of votes, return an ordered set of candidate in descending order of their votes.
     */
    List<String>   findWinner(List<Vote> votes){
        HashMap<String, Integer> candidateScores = calculateCandidateScore(votes);

        List<String> winnerList  = null;
        if (candidateScores !=null) {
            winnerList = winnerIdentifier(candidateScores);
        }

        return winnerList;
    }

    private List<String>  winnerIdentifier(HashMap<String, Integer> candidateScores){

        if (candidateScores == null){
            return null;
        }


        List<String> result = candidateScores.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).map( v -> v.getKey())
                .collect(Collectors.toList());
    return result;
    }
    private HashMap<String, Integer> calculateCandidateScore(List<Vote> votes){

        if (votes == null) {
            return null;
        }

        HashMap<String, Integer> result = new HashMap<>();

        votes.forEach( v ->{
            for (int i=0;i < v.candidates.size() ;i++) {
                Candidate c = v.candidates.get(i);
                if (result.containsKey(c.getUniqueID())){
                    result.put(c.getUniqueID(), result.get(c.getUniqueID())+(3-i));
                }else{
                    result.put(c.getUniqueID(), (3-i));
                }
            }
        });

        return result;
    }
}
