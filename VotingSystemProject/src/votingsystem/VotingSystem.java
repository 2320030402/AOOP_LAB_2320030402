package votingsystem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class VotingSystem {
    private Set<Voter> voters;           // Track voters
    private Map<String, Integer> candidates; // Track candidates and votes
    public VotingSystem() {
        voters = new HashSet<>();
        candidates = new HashMap<>();
    }
    // Register a candidate
    public void registerCandidate(String candidate) {
        if (!candidates.containsKey(candidate)) {
            candidates.put(candidate, 0);
        }
    }
    // Cast a vote
    public boolean castVote(Voter voter, String candidate) {
        if (voters.contains(voter)) {
            System.out.println("Voter " + voter.getVoterId() + " has already voted.");
            return false; // Voter has already voted
        }
        if (!candidates.containsKey(candidate)) {
            System.out.println("Candidate " + candidate + " not found.");
            return false; // Candidate not found
        }
        voters.add(voter);
        candidates.put(candidate, candidates.get(candidate) + 1);
        System.out.println("Voter " + voter.getVoterId() + " voted for " + candidate);
        return true;
    }

    // Get the vote count for a candidate
    public int getVoteCount(String candidate) {
        return candidates.getOrDefault(candidate, 0);
    }
    // Print results
    public void printResults() {
        System.out.println("Voting Results:");
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }
}
